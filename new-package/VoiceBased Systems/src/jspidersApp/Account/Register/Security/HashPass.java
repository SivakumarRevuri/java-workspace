package jspidersApp.Account.Register.Security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Random;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import jspidersApp.Account.Register.CreateUser.NewUser;

public class HashPass 
{
	private static int objCount = 1;
	
	private  final Random RANDOM = new SecureRandom();
	private  final int ITERATIONS = 1000;
	private  final int KEY_LENGTH = 256;

	
	private  HashPass() 
    {
        objCount++;
    }
	
	public static synchronized HashPass getInstance() 
	{
        if(objCount < 2 )
        {
            return new HashPass();
        }
        return null;
    }
	

	public  byte[] getNextSalt()
	{
		byte[] salt = new byte[16];
		RANDOM.nextBytes(salt);
		return salt;
	}

	public byte[] hash(char[] password, byte[] salt) 
	{
		PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
		Arrays.fill(password, Character.MIN_VALUE);
		try 
		{
			SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			return skf.generateSecret(spec).getEncoded();
		}
		catch (NoSuchAlgorithmException | InvalidKeySpecException e) 
		{
			throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
		} 
		finally
		{
			spec.clearPassword();
		}
	}

	public boolean isExpectedPassword(char[] password, byte[] salt, byte[] expectedHash) 
	{
		byte[] pwdHash = hash(password, salt);
		Arrays.fill(password, Character.MIN_VALUE);
		if (pwdHash.length != expectedHash.length)
			return false;
		for (int i = 0; i < pwdHash.length; i++) 
		{
			if (pwdHash[i] != expectedHash[i]) 
				return false;
		}
		return true;

	}
}

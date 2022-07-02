package jspidersApp.Account.Register.RandomGenerator;

import java.util.Random;

public class RandomGen 
{
	public StringBuilder randomId()
	{
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append("3014D");
		Random random = new Random();
		for (int l = 0; l < 5; l++) {
			char c = chars[random.nextInt(chars.length)];
			while(l==4 && (c>58))
			{
				c = chars[random.nextInt(chars.length)];
			}
			sb.append(c);
		}
		return sb;
	}
}

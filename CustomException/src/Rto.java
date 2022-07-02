import java.util.Random;
import java.util.Scanner;

public class Rto {

	DrivingLicience issueDl() throws InvalidAgeException
	{
		DrivingLicience dl=null;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.nextLine();
		System.out.println("enter the age of applicant");
		int age=s.nextInt();
		if (age>=18) {
			dl= new DrivingLicience();
			dl.name=name;
			Random rn= new Random();
			int dln=rn.nextInt(9999);
			dl.licenceNum=dln;
		}
		else{
			throw new InvalidAgeException();
		}
		return dl;		
	}
}

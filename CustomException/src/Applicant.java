
public class Applicant {
	
	
	public static void main(String[] args) {
		
		Rto r= new Rto();
		try {
			DrivingLicience dl= r.issueDl();
			System.out.println("driving licence issued");
			System.out.println(dl.name+"======="+dl.licenceNum);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}
}

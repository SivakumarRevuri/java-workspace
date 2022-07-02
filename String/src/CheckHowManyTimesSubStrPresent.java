import java.util.Scanner;
public class CheckHowManyTimesSubStrPresent {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the main string");
		String s1=s.nextLine();
		System.out.println("enter the substring");
		String s2= s.nextLine();
		int i=occured(s1,s2);
		System.out.println("no of times substring present in the print main string:      "+i);
		s.close();
	}
	private static int occured(String s1, String s2) {

		char [] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			int t=i;
			int j=0;
			while (i<ch1.length&&j<ch2.length&&ch1[i]==ch2[j]) {
				i++;
				j++;
			}
			if(j==s2.length()){
				if (t==0 || ch1[t-1]==' ' && j==ch1.length && (i==ch1.length||ch1[i]==' ' )) {
					count++;
				}
			}	
			i=t;
		}		
		return count;
	}
}


import java.util.Scanner;

public class CheckSubStrPresentInStringOrNot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the main string");
		String s1=s.nextLine();
		System.out.println("enter the substring");
		String s2= s.nextLine();
		boolean b=checkstr(s1,s2);
		System.out.println(b);
		s.close();
	}
	private static int checkstr(String s1, String s2) {

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
				if ((t==0 || ch1[t-1]==' ' )&& (i==ch1.length||ch1[i]==' ' )) {
					count++;
				}
					return count;
			i=t;
		}		
		return false;
	}
}

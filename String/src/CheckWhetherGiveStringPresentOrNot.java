import java.util.Scanner;

public class CheckWhetherGiveStringPresentOrNot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the main string");
		String s1=s.nextLine();
		System.out.println("enter the substring");
		String s2= s.nextLine();
		
		if (occured(s1,s2)) {
			System.out.println("yes, specified word present ");
		}else
		System.out.println("no, specified word not present");
		s.close();
	}
	private static boolean occured(String s1, String s2) {

		char [] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			int t=i;
			int j=0;
			while (i<ch1.length&&j<ch2.length&&ch1[i]==ch2[j]) {
				i++;
				j++;
			}
			if(j==s2.length()){
				if (t==0||ch1[t-1]==' '&&j==ch1.length||ch1[i]==' ' ) {
					return true;
				}
			}	
			i=t;
		}		
		return false;
	}
}

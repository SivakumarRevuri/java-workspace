import java.util.Scanner;

public class StringWithoutUsingPlusOperator {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String sn=s.nextLine();
		String st=rev(sn);
		if (st.equals(sn)) {
			System.out.println("given string is palindrome");
		}else
			System.out.println("given string is not palindrome");
		s.close();
	}

	private static String rev(String sn) {
		char[] ch=sn.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char t=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=t;
		}
		return new String(ch);
	}
}

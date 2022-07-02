import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=s.nextLine();
		System.out.println("enter the second string");
		String  s2=s.nextLine();
		String s3=removeSpace(s1);
		String s4=removeSpace(s2);
		String s5=toLower(s3);
		String s6=toLower(s4);
		boolean b=anagram(s5,s6);
		if (b) {
			System.out.println("given strings are anagrams");
		}else
			System.out.println("are not anagrams");
	}
	private static String toLower(String s3) {
		char[] ch=s3.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>=65&&ch[i]<=90) {
				ch[i]=(char)(ch[i]+32);
			}
		}
		return new String(ch);
	}
	private static String removeSpace(String s1) {
		char[] ch=s1.toCharArray();
		s1="";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!=' ') {
				s1=s1+ch[i];
			}
		}
		return s1;
	}
	private static boolean anagram(String s1, String s2) {
		if (s1.length()!=s2.length()) {
			return false;
		}else{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String st1=new String(ch1);
			String st2=new String(ch2);
			if(st1.equals(st2)){
				return true;
			}
			return false;
		}
	}

}

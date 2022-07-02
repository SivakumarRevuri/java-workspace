import java.util.Scanner;

public class CountEvenDigitsInString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		char[] ch=st.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=48&&ch[i]<=57){
				ch[i]=(char)(ch[i]);
				if (ch[i]%2==0) {
					count++;
					System.out.print(ch[i]+"  ");
				}
			}
		}
		System.out.println();
		System.out.println("the no of even digits in the given string ");
		System.out.println(count);
	}
}

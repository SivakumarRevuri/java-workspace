
import java.util.Scanner;

public class ReverseWordInASentence {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 System.out.println("enter the line");
		 String st= s.nextLine();
		 char[] ch=st.toCharArray();
		 st="";
		 for (int i = 0; i<ch.length; i++) {
			int sin=i;
			while (i<ch.length&&ch[i]!=' ') {
				i++;
			}
			int j=i-1;
			while(j>=sin){
				st=st+ch[j];
				j--;
			}
			if (i<ch.length) {
				st=st+ch[i];
			}
				System.out.println(st);
		 }
		 s.close();
	}
}
import java.util.Scanner;

public class ReverseAlterantiveEvenWords {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the line");
		String st= s.nextLine();
		char[] ch=st.toCharArray();
		st=""; int count=1;
		for (int i = 0; i<ch.length; i++) {
			int sin=i;
			while (i<ch.length&&ch[i]!=' ') {
				if (count%2==1) 
					st=st+ch[i];
				i++;
			}
			if (count%2==0) {
				int j=i-1;
				while(j>=sin){
					st=st+ch[j];
					j--;
				}
				if (i<ch.length) {
					st=st+ch[i];
					count++;
				}
			}
		
		}
		System.out.println(st);
	}
}

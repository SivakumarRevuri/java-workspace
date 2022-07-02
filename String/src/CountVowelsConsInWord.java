import java.util.Scanner;

public class CountVowelsConsInWord {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the sentence");
		String st= s.nextLine();
		char[] ch= st.toCharArray();
		int v=0,c=0;
		for (int i = 0; i < ch.length; i++) {

			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
				v++;
			}else if(ch[i]!=' ')
				c++;

		}
		System.out.println(st+  "  consists vowels "+v+"  consonants "+c);
	}
}

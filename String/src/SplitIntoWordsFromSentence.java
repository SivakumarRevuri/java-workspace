import java.util.Scanner;

public class SplitIntoWordsFromSentence {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the input line statement");
		String st=s.nextLine();
		String[] sg=splitIntoWords(st);
		for (int i = 0; i < sg.length; i++) {
			if (sg[i]==null) {
				break;
			}
			System.out.println(i+1+"----------------->"+sg[i]);		
		}		
		s.close();
	}
	private static String[] splitIntoWords(String st) {

		int c=gertWordCount(st);
		String[] rs= new String[c];
		char [] ch=st.toCharArray();
		int in=0;
		rs[in]="";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!=' '&&ch[i]!=','&&ch[i]!='.') {
				rs[in]=rs[in]+ch[i];
			}else{
				if (i<ch.length-1&&ch[i+1]!='.'&&ch[i+1]!=' '&&ch[i+1]!=',') {
					in++;
					rs[in]=" ";
				}
			}
		}
		return rs;
	}

	private static int gertWordCount(String s) {

		int count=0;
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if (i==0&&ch[i]!='.'&&ch[i]!=' '&&ch[i]!=','
				||(ch[i]==' '&&ch[i+1]!='.'&&ch[i+1]!=' '&&ch[i]!=',')
				||(ch[i]=='.'&&ch[i+1]!='.'&&ch[i+1]!=' '&&ch[i]!=',')
				||(ch[i]==','&&ch[i+1]!='.'&&ch[i+1]!=' '&&ch[i]!=','));
			{
				count++;
			}
		}	
		return count;
	}
	
}

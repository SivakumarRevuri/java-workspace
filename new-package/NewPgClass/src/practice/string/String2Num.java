package practice.string;

public class String2Num {

	public static void main(String[] args) {
		String name="siva";
		String st=name.toUpperCase();
		System.out.println(st);
		char[] ch=st.toCharArray();
		int[] a=new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A'&& ch[i]<='Z') {
				a[i]=(int)( ch[i]-64);
			}
		}
		for (int i : a) {
			System.out.print(i+"  ");
		}
	}
}

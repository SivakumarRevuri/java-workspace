
// Stack data structure

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		
		String st="abc*d/+";
		Scanner sc= new Scanner(System.in);
		Stack< Double> stk= new Stack<Double>();
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			if (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
				System.out.println("enter "+ch+" value");
				stk.push(sc.nextDouble());
			}else{
				double v1=stk.pop();
				double v2=stk.pop();

				switch (ch) {
				case '+' :stk.push(v2+v1);					
				break;
				case '-' :stk.push(v2-v1);					
				break;
				case '*' :stk.push(v2*v1);					
				break;
				case '/' :stk.push(v2/v1);					
				break;
				case '%' :stk.push(v2%v1);					
				break;				
				}
			}
		}
		System.out.println("final value "+stk.pop());
		sc.close();
	}
}

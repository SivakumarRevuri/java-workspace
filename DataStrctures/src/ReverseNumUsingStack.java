import java.util.Scanner;
import java.util.Stack;

// w a j p to reverse the number using stack

public class ReverseNumUsingStack {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the input");
		int n= s.nextInt();
		Stack<Double> st= new Stack<Double>(); //  for generic type we have to use wrapper class only not primitive data type
		
		while (n!=0) {
			st.push((double) (n%10));  // it will get the last digit of your number (we are using modulus)
			n=n/10;
		}
		n=1; int sum=0;
		while (!st.isEmpty()) {
			sum=(int) (n*st.pop()+sum);
			n=n*10;
		}
		System.out.println(sum);
		s.close();
	}
}

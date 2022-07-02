
public class Test {
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	static  int output = 1;
	private static int factorial(int i) {
		if (i > 1) {
			output = i * factorial(i-1);
			return output;
		} else {
			return output;
		}
		
	}
}

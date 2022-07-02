package practice.number;

public class DivisionOperWithOutOperator {

	public static void main(String[] args) {
		int n=125;
		int r=5,count=0;
		while (n>=r) {
			n=n-r;
			count++;
		}
		System.out.println(count);
	}
}

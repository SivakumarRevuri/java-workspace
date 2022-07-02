package practice;

public class NoOfPrimeNumbers {

	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i < 1000; i++) {

			int t=2;
			while(t<=i/2){
				if(i%2==0){
					count++;
				}
			}		
		
		}
		System.out.println(count);
	}
	private static int prime(int n) {

	
		return  n;
	}
}

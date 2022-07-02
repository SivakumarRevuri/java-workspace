package practice;

// w a j p if given no divisible by 3 display fizz, divisible by 5 display buzz, divisible by both display fizz&buzz

public class DivisionOf3And5 {
	public static void main(String[] args) {
		int both=0;
		int three=0;
		int five=0;
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println("  fizz & buzz");
				both++;
			}
			else if (i%3==0) {
				System.out.println(" fizz");
				three++;
			}
			else if(i%5==0){
				System.out.println(" buzz");
				five++;
			}
		}
		System.out.println("divided by 3&5 is:  "+both);
		System.out.println(" divided by 3 : "+three);
		System.out.println(" divided by 5 : "+five);
	}
}

// print even number between 100 an d150
public class Demo5 {

	public static void main(String[] args) {
		int count=0;
		
//		for (int i = 100; i <=150; i++) {
//			if (i%2==0) {
//			count++;
//			System.out.println(i);
//			}
//		}
		
		int i=100;
		while(i<=151){
			if (i%2==0) {
				count++;
				System.out.println(i);
			}
			i++;
		}
		System.out.println(count+"===============");
	}
}

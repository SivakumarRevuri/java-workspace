package practice.number;

public class Series10_12_20_22_40_42 {

	public static void main(String[] args) {
		int i=10;
		int a=12;
		for (int j = 0; j <=30; j++) {
			System.out.println(i);
			int k=i*2;
			i=k;
			System.out.println(a);
			int d=a*2-2;
			a=d;
		}

	}
}

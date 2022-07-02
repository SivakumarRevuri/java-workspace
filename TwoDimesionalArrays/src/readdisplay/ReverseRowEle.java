package readdisplay;

public class ReverseRowEle {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("before reversing rows ");
		displayMat(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length/2; j++) {
				int t=a[i][j];
				a[i][j]=a[i][a.length-1-j];
				a[i][a.length-1-j]=t;
			}
		}
		System.out.println("after reversing rows");
		displayMat(a);
	}
	private static void displayMat(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}

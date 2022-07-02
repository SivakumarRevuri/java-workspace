package readdisplay;

public class SwapDiagonal {

	public static void main(String[] args) {
		int a[][]={{2,3,4,5},{6,7,8,9},{3,6,4,6},{7,3,2,1}};
		System.out.println("before");
		displayMat(a);
		for (int i = 0; i < a.length/2; i++) {
			for (int j = 0; j < a.length; j++) {
				// primary diagonal elements
				if (i==j) {
					int t=a[i][j];
					a[i][j]=a[a.length-1-i][a.length-1-j];
					a[a.length-1-i][a.length-1-j]=t;		
				}
				// secondary diagonal elements
				if ((i+j)==a.length-1) {
					int t=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=t;
				}
			}
		}
		System.out.println("after");
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

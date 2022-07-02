package readdisplay;

public class RowColumnSum {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};

		int r=0,c=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i<a.length) {
					r=r+a[i][a.length-1-j];
				}
				if (j<a.length) {
					c=c+a[a.length-1-i][j];
				}
			}			
		}
		System.out.println("sum of rows "+r);
		System.out.println("sum of columns "+c);
	}
}

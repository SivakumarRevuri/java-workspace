package practice.array;

public class MergeArray {

	public static void main(String[] args) {
		int a[]={1,3,5,7};
		int b[]={2,4,6,8};
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i]=a[j];	
				for (int k = 0; k < c.length; k++) {
					c[i+1]=b[k];
				}				
			}
		}
		for (int i : c) {
			System.out.println(i);
		}
	}
}

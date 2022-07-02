package practice.array;

public class SortArray {

	public static void main(String[] args) {
		int []a={2,6,4,9,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}				
			}
		}
		System.out.println("the array elements after sorting");
		for (int k : a) {
			System.out.print(k+" ");
		}
	}
}


public class Demo4 {

	public static void main(String[] args) {

		int a[]={6,3,2,2,3};
//		int max = a[0];
//		for (int i = 1; i < a.length; i++) {
//			if(max<a[i])
//				max = a[i];
//		}
//		int count[] = new int[max+1];
//		for (int i = 0; i < a.length; i++) {
//			count[a[i]]++;
//		}		
//		for (int i = 0; i < a.length; i++) {
//			if(count[a[i]]==1){
//				System.out.println(a[i]);
//				return;
//			}
//		}
		int b=a[0];
		for (int i = 0; i < a.length; i++) {
			if (b<a[i]) {
				b=a[i];
			}
		}
		int count[]=new int[b+1];
		for (int i = 0; i < a.length; i++) {
			count[a[i]]++;
		}
		for (int i = 0; i < a.length; i++) {
			if (count[a[i]]==1) {
				System.out.println(a[i]);
				System.exit(0);
			}
		}
	}
}



public class Test1 {
	
	
	public static void main(String[] args) {
		int[] a={1,2,3,5};
	int[] b={2,4,5,6};		
	int[] c=union(a,b);
	displayArray(c);
	}

	private static int[]  union(int[] a, int[] b) {
		
		int[] c=new int[a.length+b.length];
		int count=0;
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(b[j]!=a[j]){
					count=1;
				}else
					count=0;
			}
	int	k=	a.length;
			if(count==1){
				c[k]=b[i];
				k++;
			}
		}
		return c;
	}
	static void displayArray(int[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	
}

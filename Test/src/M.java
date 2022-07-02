
public abstract class M {
	
 	public abstract void siva();
	

	public static void main(String[] args) {
		int[] a={0,3,64,4,187};
		int b=a[0];
		int[] c=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b>a[i]) {
				c[i]=a[i+1];
			}else{
				c[i]=a[i];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}

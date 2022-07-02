class PassA 
{
	public static void main(String[] args) {
		int a[]=new int[0];
		try {
			
			int x=0;
			int y=5/x;
		} catch (Exception e) {
			System.out.println("exception");
		}
		
	}
}
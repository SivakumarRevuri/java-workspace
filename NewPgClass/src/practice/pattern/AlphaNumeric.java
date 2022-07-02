package practice.pattern;

public class AlphaNumeric {


	public static void main(String[] args) {
		int n=5;
		for (int i = n; i >= n; i--)
		{
			for (int j = 1; j <=n	; j++) 
			{
				if (i==n||i<=j) 
					System.out.print((char)(i+64)+" ");	
				else 
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}

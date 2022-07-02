package practice.number;

// w a j p to find the strong number between 1 to 100000

public class StrongNumBW1To100000 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 100000; i++) {
		int  res=strong(i);
		boolean strong=isStrong(i,res);
		if(strong)
			System.out.println(i+" is strong number ");
		}
	
	}
	private static boolean isStrong(int n, int res) {
		if (n==res) {
			return true;
		}else
			return false;
	}

	private static int strong(int n) {
		int st=0;
		while (n!=0) {
			int re=n%10;
			st=st+fact(re);
			n=n/10;
		}
		return st;
	}

	private static int fact(int re) {
		int fc=1;
		while (re>0) {
			fc=fc*re;
			re--;
		}
		return fc;
	}	

}

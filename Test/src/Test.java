import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfPersons = 5;
		int[] ticketNo = new int[noOfPersons];
		System.out.println("Enter the ticket numbes");
		for (int i = 0; i < noOfPersons; i++) {
			ticketNo[i] = scanner.nextInt();
		}
		System.out.println(alone_in(ticketNo));
		scanner.close();
	}
	
	static int alone_in(int[] arr) {
		Set<Integer> list = new HashSet<>();
		for (int i : arr) {
			list.add(i);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					list.remove(arr[i]);
				}
			}
		} 
		Object[] element = list.toArray();
		 for (Object object : element) {
			return ((Integer)object);
		}
		 return 0;
	}
}

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSetDemo hd1=new HashSetDemo(12, "siva");
		HashSetDemo hd2=new HashSetDemo(12, "kumar");
		HashSetDemo hd3=new HashSetDemo(12, "revuri");
		HashSetDemo hd4=new HashSetDemo(22, "siva");
		HashSetDemo hd5=new HashSetDemo(152, "siva");
		
		LinkedHashSet<HashSetDemo> lhs= new LinkedHashSet<HashSetDemo>();
		lhs.add(hd1);
		lhs.add(hd2);
		lhs.add(hd3);
		lhs.add(hd4);
		lhs.add(hd5);
		System.out.println(lhs.size());
		for (HashSetDemo hash : lhs) {
			System.out.println(hash);
		}
		ArrayList<HashSetDemo> alt = new ArrayList<>(lhs);
		System.out.println(alt.size());
		
	}
}

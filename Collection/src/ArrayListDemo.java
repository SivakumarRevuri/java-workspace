import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList< String> alt= new ArrayList<String>();
		alt.add("siva");
		alt.add("kumar");
		alt.add("pavan");
		alt.add(null);
		alt.add("venkateswarulu");
		alt.add("lakshmi");
		alt.add("devi");
		
		System.out.println("array list size is: "+alt.size());
		for (String string : alt) {
			System.out.println(string);
		}
		System.out.println();
		System.out.println("linked list ");

		LinkedList<String> lst= new LinkedList<String>(alt);
		System.out.println("linked list size is: "+lst.size());
		
		System.out.println(lst);
		for (String string : lst) {
			System.out.println(string);
		}
		System.out.println();
		System.out.println("set interface");
		Set<String> st= new HashSet<String>(lst);
		System.out.println("set  size is: "+st.size());
		for (String string : st) {
			System.out.println(string);
		}
		System.out.println("hash set iterating using iterator");
		HashSet< String > hst= new HashSet<String>(st);
		
		Iterator<String> ite= hst.iterator();
		while (ite.hasNext()) {
			String string = (String) ite.next();
			System.out.println(string);
		}		
	}
}

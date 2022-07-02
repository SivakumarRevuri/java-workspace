import java.util.HashSet;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {

		HashSet<String> alst=new HashSet<>();
		alst.add("siva");
		alst.add("kumar");
		alst.add("revuri");

		for (String string : alst) {
			System.out.println(string);
		}

		Iterator<String> ite=alst.iterator();
		while (ite.hasNext()) {
			String string = (String) ite.next();
			System.out.println(string);
		}


	}
}
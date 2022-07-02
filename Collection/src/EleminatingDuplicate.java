import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EleminatingDuplicate {

	public static void main(String[] args) {
		ArrayList<String> alst=new ArrayList<>();
		alst.add("hyderabad");
		alst.add("patna");
		alst.add("telangana");
		alst.add("delhi");
		alst.add("hyderabad");
		
		Set<String> st= new HashSet<>();
		st.addAll(alst);
		
		System.out.println(st);
		
	}
}

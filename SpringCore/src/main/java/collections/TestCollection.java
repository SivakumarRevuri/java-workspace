package collections;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/collections.xml");
		SubjectClass subjectClass = (SubjectClass) context.getBean("diffCollections");
		// print arrayList
		System.out.println("====================");
		Iterator<String> listIterator = subjectClass.getArrayList().iterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println(string);
		}

		System.out.println("====================");
		Iterator<String> setIterator = subjectClass.getSetList().iterator();
		while (setIterator.hasNext()) {
			String string = (String) setIterator.next();
			System.out.println(string);
		}

		System.out.println("====================");
		Set<String> keys  = subjectClass.getMapList().keySet();
		for (Object key : keys) {
			System.out.println("percenate: "+key+" value: "+subjectClass.getMapList().get(key));
		}

	}

}

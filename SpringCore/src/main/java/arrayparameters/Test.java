package arrayparameters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("resources/array.xml");
		Fruits  fruits = (Fruits)context.getBean("fruit");
		String[] fruitNames = fruits.getFruitName();
		for (String string : fruitNames) {
			System.out.println(string);
		}
	}
}

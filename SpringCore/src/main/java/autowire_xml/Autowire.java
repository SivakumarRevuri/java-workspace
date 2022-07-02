package autowire_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowire {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/autowire.xml");
	/*	Car carByType = (Car)applicationContext.getBean("car");
		carByType.printData();*/
		
		Car carByName = (Car)applicationContext.getBean("car");
		carByName.printData();
	}
}

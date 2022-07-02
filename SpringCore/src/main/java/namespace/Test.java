package namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/namespace.xml");
		Car car = (Car)applicationContext.getBean("car");
		car.printCarInfo();
	}
}

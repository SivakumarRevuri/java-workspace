package dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("resources/dependencyinjection.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
	}
}
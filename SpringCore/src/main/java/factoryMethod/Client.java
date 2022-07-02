package factoryMethod;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {

		// creating object using clone method.
//		FactoryMethodTest methodTest = new FactoryMethodTest();
//		FactoryMethodTest test = (FactoryMethodTest)methodTest.clone();

		// creating object using Spring.
		Resource resource = new ClassPathResource("resources/factorymethod.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		FactoryMethodTest methodTest1 = (FactoryMethodTest) beanFactory.getBean("factoryMethod");
		FactoryMethodTest methodTest2 = (FactoryMethodTest) beanFactory.getBean("factoryMethod");

		System.out.println(methodTest1 == methodTest2);
		// creating object as singleton
//		FactoryMethodTest factoryMethodTest1 = FactoryMethodTest.getInstance();
//		FactoryMethodTest factoryMethodTest2 = FactoryMethodTest.getInstance();
//		System.out.println(factoryMethodTest1 == factoryMethodTest2);

		// example for creating object for Factory Class
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		
		//Accessing FactoryBeanTest Object 
		FactoryBeanTest beanTest = (FactoryBeanTest)beanFactory.getBean("factorybean");
		System.out.println("Factory bean test is Singleton class: "+beanTest.isSingleton());
	}
}

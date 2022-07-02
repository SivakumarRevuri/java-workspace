package beans;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	public static void main(String[] args) {

		/**
		 * If a class contains a private constructor ... Spring can create a constructor
		 * for that corresponding class. for example they access the private constructor
		 * like below.
		 */
		try {
			Constructor constructor[] = Class.forName("beans.Student").getDeclaredConstructors();
			constructor[0].setAccessible(true);
			constructor[0].newInstance(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Accessing beans from XML through applicationContext interface(Eager
		// container) i.e recommended (due to it instantiates all objects in XML value)
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.getId() + "  " + student.getName());

		Resource resource = new ClassPathResource("resources/spring.xml");
		// Accessing beans through beanFactory(lazy)
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		// creating student class object. BeanFactory will creates the objects on demand
		// only.
		Student student1 = (Student) beanFactory.getBean("student");
		Student student2 = (Student) beanFactory.getBean("student");
		Student student3 = (Student) beanFactory.getBean("student");

		// checking the object values are same or not (the no of objects getting created
		// by IOC container). If the scope of the object is Singleton
		// (scope="singleton") i.e default below output will
		// be TRUE, if not it will output will be false. (scope="prototype")
		System.out.println(student1 == student2);
		System.out.println(student1 == student3);

		// getting student name using getter method
		System.out.println("Hello " + student1.getName());

		// dependency injection means passing input parameters(we can pass any data)
		// through the XML to POJO classes
	}
}
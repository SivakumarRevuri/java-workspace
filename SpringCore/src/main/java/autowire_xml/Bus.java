package autowire_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bus {

	private Engine eng;

	public Bus() {
		System.out.println("default constuctor");
	}

	public Bus(Engine e) {
		System.out.println("I am parameterized constrctor");
		this.eng = e;
	}

	public void setEngine(Engine engine) {
		this.eng = engine;
	}

	public Engine getEngine() {
		return eng;
	}

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/autowire-constructor.xml");
//		Bus bus = (Bus)applicationContext.getBean("bus");
//		System.out.println(bus.getEngine().getModelYear());
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"resources/autowire-autodetect.xml");
		Bus bus = (Bus) applicationContext.getBean("bus");
		System.out.println(bus.getEngine().getModelYear());

	}

}

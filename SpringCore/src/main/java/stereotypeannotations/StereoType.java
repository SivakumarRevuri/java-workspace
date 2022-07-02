package stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoType extends Heart {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/stereotype.xml");
		// if you use @Component annotation it can access through class file (Since
		// Spring creates Object not by programmer)
		Human human = (Human) context.getBean(Human.class);
		human.humanInfo();
	}

}

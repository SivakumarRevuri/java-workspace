package stereotypeannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human  extends Heart{

	//private String humanName;
	@Autowired
	@Qualifier("heart2")
	private Heart heart;
	
	public void humanInfo() {
		System.out.println("Hi!!!  your heart rate is: " + heart.getHeartRate());
	}
	
}

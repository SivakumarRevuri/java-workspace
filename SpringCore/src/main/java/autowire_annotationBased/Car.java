package autowire_annotationBased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier("engine2")
	private Engine engine;
	// if we use Auto wired annotation no need of constructor and setter method.

	public void printData() {
		System.out.println("Engine modle year is: " + engine.getModelNo());
	}
}

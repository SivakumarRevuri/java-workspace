package namespace;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String name;
	private Engine engine;
	
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getName() {
		return name;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public void printCarInfo() {
		System.out.println(name);
		System.out.println(engine.getModelNo());
	}
}

package dependencyinjection;

public class Car {

	private Engine engine;
	private String name;
	// static variable dependency injection
	private static double carPrice;

	public Car() {
		System.out.println("I am Car constructor...");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void setCarPrice(double carPrice) {
		Car.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "engine=" + engine.getModelNo() + ",   name=" + name +"  price: "+carPrice;
	}

	
}

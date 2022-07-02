package autowire_xml;

public class Car {

	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public void printData() {
		System.out.println("Engine model year: "+engine.getModelYear());
	}
}

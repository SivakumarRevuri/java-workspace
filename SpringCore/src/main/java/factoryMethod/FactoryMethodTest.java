package factoryMethod;

public class FactoryMethodTest {

	private static FactoryMethodTest factoryMethodTest;

	private FactoryMethodTest() {
		System.out.println("I am private constructor");
	}

	public static FactoryMethodTest getInstance() {
		if (factoryMethodTest == null) {
			return factoryMethodTest = new FactoryMethodTest();
		} else {
			return factoryMethodTest;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	
}

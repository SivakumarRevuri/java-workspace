package factoryMethod;

import org.springframework.beans.factory.FactoryBean;

@SuppressWarnings("rawtypes")
public class FactoryBeanTest implements FactoryBean{

	private FactoryBeanTest beanTest;
	private FactoryBeanTest() {
		System.out.println("I am private constrcutor of Factory bean test");
	}
	public Object getObject() throws Exception {
		if (beanTest == null) {
			return beanTest = new FactoryBeanTest();
		}else {
			return beanTest;
		}
	}

	public Class getObjectType() {
		return FactoryBeanTest.class;
	}

	public boolean isSingleton() {
		return Boolean.TRUE;
	}

}

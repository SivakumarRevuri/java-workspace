package practice.array;

public class TestCase {

	public static void main(String[] args) {
		Test t1= new Test();
		Test.Inner i1= t1.new Inner();
		System.out.println(t1.i);
		System.out.println(i1.j);
	}
}

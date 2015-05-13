package super1;

/**
 * @author 姚义祥
 * @2015-3-31
 * @desperation:
 * 
 */
class A {
	public A() {
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		super();
		System.out.println("B");
	}
}

class C extends B{
	public C() {
		super();
		System.out.println("C");
	}
}

class A1 {
	public void print() {
		System.out.println("A1");
	}
}
class B1 extends A1 {
	public void print() {
		System.out.println("B1");
		super.print();
	}
}
public class TestSuper {

	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.print();
	}
}

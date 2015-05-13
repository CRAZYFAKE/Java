package super1;

/**
 * @author 姚义祥
 * @2015-4-22
 * @desperation:
 * 
 */
class FatherClass {
	public int value;

	public void print() {
		System.out.println("FatherClass's value is " + value);
	}
}

public class ChildClass extends FatherClass {

	public int value;

	@Override
	public void print() {
		System.out.println(super.value);
		super.value = 100;
		value = 200;
		System.out.println("ChildClass's value is " + value);
		super.print();
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.print();
	}
}

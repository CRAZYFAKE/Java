package innerclass;
/**
 *@author 祥
 *@desperation: 内部类实现接口 
 *				1、内部类可以实现接口。
 *				2、内部类之间相互可见，但并非内部类之间方法都可见。
 *@2014-7-19
 */
interface Foo{
	void say();
}

interface Bar{
	void readme();
}

class Outer1 {
	private class FooImpl implements Foo {

		@Override
		public void say() {
			System.out.println("say foo!!");
		}
	}
	
	private class BarImpl implements Bar {

		@Override
		public void readme() {
			System.out.println("say bar!!");
		}
	}
	
	public Foo getFoo() {
		return new FooImpl();
	}
	
	public Bar getBar() {
		return new BarImpl();
	}
}
public class InnerAndInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		Foo f = outer.getFoo();
		Bar b = outer.getBar();
		f.say();
		b.readme();
	}
	/**
	 new class
	 */
}

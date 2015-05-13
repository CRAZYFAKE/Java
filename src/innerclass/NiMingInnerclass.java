package innerclass;
/**
 *@author 祥
 *@desperation:  匿名类. 
 *@2014-7-19
 */
interface Foo1 {
	void say();
}
public class NiMingInnerclass {
	public Foo f = new Foo() {
		
		@Override
		public void say() {
			System.out.println("say foo1!!");
		}
	};
	
	public Foo test() {
		return new Foo() {
			
			@Override
			public void say() {
				System.out.println("say foo2!!");
			}
		};
	}
	public static void main(String[] args) {
		NiMingInnerclass niming = new NiMingInnerclass();
		niming.f.say();
		niming.test().say();
	}
}

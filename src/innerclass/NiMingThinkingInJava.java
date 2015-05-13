package innerclass;
/**
 *@author 祥
 *@desperation: 
 *@2014-7-19
 */
interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {

	@Override
	public void method1() {
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation1 method2");
	}
	
	public static ServiceFactory factory = new ServiceFactory() {
		
		@Override
		public Service getService() {
			return new Implementation1();
		}
	};
}

class Implementation2 implements Service {

	@Override
	public void method1() {
		System.out.println("Implementation2 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2 method2");
	}
	public static ServiceFactory factory = new ServiceFactory() {
		
		@Override
		public Service getService() {
			return new Implementation2();
		}
	};
}

public class NiMingThinkingInJava {

	public static void serviceConsummer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}
	public static void main(String[] args) {
		serviceConsummer(Implementation1.factory);
		serviceConsummer(Implementation2.factory);
	}
}

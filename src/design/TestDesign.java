package design;

public class TestDesign {

	public static void main(String[] args) {
		/**
		 * 单例模式 Singleton
		 */
		singleton();
		/*
		 * 饿汉式单例模式
		 */
		singletion1();
	}

	/**
	 * 单例模式 Singleton
	 */
	private static void singleton() {
		Singleton sl1 = Singleton.getIntence();
		sl1.setNameString("one");
		Singleton sl2 = Singleton.getIntence();
		sl2.setNameString("tow");
		sl1.outputName();
		sl2.outputName();

		if (sl1 == sl2) {
			System.out.println("创建的是相同实例");
		} else {
			System.out.println("创建的是不同的实例");
		}
	}

	private static void singletion1() {
		Singleton1 sl = Singleton1.getIntence();
		Singleton1 sl2 = Singleton1.getIntence();
		System.out.println(sl == sl2);
	}
}

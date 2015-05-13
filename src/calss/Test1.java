package calss;

/**
 * @author 姚义祥
 * @2014-9-21
 * @desperation:
 * 
 */
class Methed {
	public Methed(int maker) {
		System.out.println("Methed" + "(" + maker + ")");
	}
}

class Horse {
	Methed m1 = new Methed(1);

	public Horse() {
		System.out.println("Horse()");
		@SuppressWarnings("unused")
		Methed w33 = new Methed(33);
	}

	Methed w2 = new Methed(2);

	void f() {
		System.out.println("f()");
	}

	Methed w3 = new Methed(3);
}

public class Test1 {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @author: 姚义祥
	 * @version: 2014-9-21 上午9:40:59
	 * @param args
	 *            设定文件
	 * @throws
	 */
	public static void main(String[] args) {
		Horse h = new Horse();
		h.f();
	}
}

package design;

/**
 * @author 姚义祥
 * @2014-11-19
 * @desperation: 懒汉式单例模式
 * 
 */
public class Singleton2 {
	private Singleton2() {
	}

	private static Singleton2 single = null;

	public synchronized static Singleton2 getIntence() {
		if (single == null) {
			single = new Singleton2();
		}
		return single;
	}
}

package design;
/**
 *@author 姚义祥
 *@2014-11-19
 *@desperation:  饿汉单例模式
 *
 */
public class Singleton1 {
	private Singleton1() {
		
	}
	private static final Singleton1 single = new Singleton1();
	public static Singleton1 getIntence() {
		return single;
	}
}

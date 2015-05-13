package synchornized;

class Foo extends Thread {
	private int val;
	private static Object lock = new Object();

	public Foo(int v) {
		this.val = v;
	}

	public void printVal(int v) {
		synchronized (lock) {
			while (true) {
				System.out.println(v);
			}
		}
	}

	public void run() {
		printVal(val);
	}
}

/**
 * @author 姚义祥
 * @2014年11月23日
 * @desperation:
 *
 */
public class SyncTest {

	public static void main(String[] args) {
		Foo f1 = new Foo(1);
		f1.start();
		Foo f2 = new Foo(2);
		f2.start();
	}
}

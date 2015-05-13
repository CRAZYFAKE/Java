package callback;

/**
 * @ClassName: CallBack
 * @Description: 回调函数经典实例:有一天A 遇到一个很难的问题，问题是“1 + 1 = ?”，就打电话问B ，B 一下子也不知道，就跟A
 *               说，等我办完手上的事情 ，就去想想答案，A 也不会傻傻的拿着电话去等B 的答案吧 ，于是A 就对B
 *               说，我还有事情，你知道了答案就打我电话告诉我，于是挂了电话 ，自己办自己的事情，过了一个小时，B 打了A
 *               的电话，告诉他答案是2
 * @version: 2015-1-21 下午8:49:00
 */
interface CallBack {
	/**
	 * @Description: TODO(这个是B 知道答案时要调用的函数告诉A ，也就是回调函数 )
	 * @version: 2015-1-21 下午8:48:39
	 * @param result
	 *            是答案
	 */
	public void solve(String result);
}

/**
 * @ClassName: Li
 * @Description: 这个是B
 * @version: 2015-1-21 下午8:50:01
 */
class B {
	public void executeMessage(CallBack callBack, String question) {
		System.out.println("A 问的问题--->" + question);

		// 模拟B 办自己的事情需要很长时间
		for (int i = 0; i < 1000000000; i++) {

		}
		/**
		 * B 办完事情之后想到了答案是2
		 */
		String result = "答案是2";
		/**
		 * 于是就打电话告诉A ，调用A 中的方法
		 */
		callBack.solve(result);
	}
}

/**
 * @ClassName: Wang
 * @Description: 这个是A
 * @version: 2015-1-21 下午8:55:36
 */
class A implements CallBack {
	/**
	 * B 对象的引用
	 */
	private B b;

	/**
	 * A 的构造方法，持有B 的引用
	 * 
	 * @param b
	 */
	public A(B b) {
		this.b = b;
	}

	/**
	 * 
	 * @Title: askQuestion
	 * @Description: TODO(A 问问题 )
	 * @version: 2015-1-21 下午9:06:48
	 * @param question
	 *            问题
	 * @throws
	 */
	public void askQuestion(final String question) {
		/**
		 * A 调用B 的方法，注册回调接口
		 */
		b.executeMessage(A.this, question);
	}

	/**
	 * B 知道答案后，调用此方法告诉A ，就是所谓的A 的回调方法
	 */
	@Override
	public void solve(String result) {
		System.out.println("B 告诉A 的答案是--->" + result);
	}

}

/**
 * @author 姚义祥
 * @2015-1-21
 * @desperation:
 */
public class CallTest {

	public static void main(String[] args) {
		/**
		 * new 一个B
		 */
		A a = new A(new B());
		/**
		 * A 问B 问题
		 */
		a.askQuestion("1 + 1 = ?");
	}
}

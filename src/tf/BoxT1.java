package tf;

/**
 * @author 姚义祥
 * @2014-10-11
 * @desperation: 类型参数也可以被声明在方法和构造函数的签名当中，
 * 				   使它们成为带泛型的方法和构造函数。
 */
public class BoxT1<T> {
	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U> void inspect(U u) {
		System.err.println("T : " + t.getClass().toString());
		System.err.println("U : " + u.getClass().toString());
	}

	public static void main(String[] args) {
		BoxT1<Integer> integerBox = new BoxT1<Integer>();
		integerBox.add(new Integer(10));
		integerBox.inspect("some text");
	}
}

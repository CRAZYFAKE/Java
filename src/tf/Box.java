package tf;
/**
 *@author 姚义祥
 *@2014-10-11
 *@desperation: 
 *
 */
public class Box<T> {
	private T t;
	
	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}


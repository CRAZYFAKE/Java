package design;

/**
 * @author 姚义祥
 * @2014-11-19
 * @desperation:
 * 
 */
public class Singleton {
	private String nameString = null;
	private static Singleton uniqueInstence = null;

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	// 将构造方法限定为private避免了类在外部被实例化
	private Singleton() {

	}

	public static Singleton getIntence() {
		if (uniqueInstence == null) {
			uniqueInstence = new Singleton();
		}
		return uniqueInstence;
	}

	public void outputName() {
		System.out.println("The name is " + nameString);
	}
}

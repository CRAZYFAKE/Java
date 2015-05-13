package calss;


/**
 *@author 姚义祥
 *@2014-9-14
 *@desperation: 一个衍生类引用转换为其基类引用，这叫做向上转换(upcast)或者宽松转换
 *
 */
public class UpcastClass {

	public static void main(String[] args) {
		UpcastClssOne one;
		UpcastClssTwo two = new UpcastClssTwo();
		one = two;
		one.one();
		one.two();
	}
}



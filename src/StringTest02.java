/**
 * @author 姚义祥
 * @2015-4-16
 * @desperation:
 * 
 */
public class StringTest02 {

	public static void main(String[] args) {
		// String aString = "a";
		// String bString = "a";
		// System.out.println(aString == bString);
		//
		// String dString = "d";
		// String dString2 = new String("d").intern();
		// System.out.println(dString == dString2);

		String a = new String("ab");
		String b = new String("ab");
		System.out.println(b.intern() == a);
		String c = "ab";
		System.out.println(b.intern() == c);
		// new创建字符串对象在栈中，不在常量池中
		String d = "a" + "b";
		System.out.println(b.intern() == d);
		String e = "b";
		String f = "a" + e;
		System.out.println(b.intern() == f);
		// 字符串相加时，都是静态字符串的结果会添加到常量池中，如果其中含有变量，则不会进入到常量池
		System.out.println("------------------");
		String a1 = "abc";
		String b1 = "abc";
		String c1 = "a" + "b" + "c";
		String d1 = "a" + "bc";
		String e1 = "ab" + "c";
		String e2 = new String("abc");
		System.out.println(a1 == b1);
		System.out.println(a1 == c1);
		System.out.println(a1 == d1);
		System.out.println(a1 == e1);
		System.out.println(c1 == d1);
		System.out.println(c1 == e1);
		System.out.println(e2 == e1);
		System.out.println("------------------");
		Integer c11 = 10;
		Integer d11= 10;
		System.out.println(c11 == d11);
		Integer e11 = new Integer(10);
		Integer f11 = new Integer(10);
		System.out.println(e11 == f11);
	}
}

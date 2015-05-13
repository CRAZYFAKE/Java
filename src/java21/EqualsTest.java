package java21;
/**
 *@author 祥
 *@desperation: 对象的比较
 *@2014-7-23
 */
public class EqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1,str2;
		str1 = "Free";
		str2 = str1;
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		System.out.println("Some object ?" + (str1 == str2));
		
		System.out.println();
		
		str2 = new String (str1);
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);
		System.out.println("Some object ?" + str1.equals(str2));
	}
}

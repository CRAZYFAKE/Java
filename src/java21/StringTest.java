package java21;
/**
 *@author 祥
 *@desperation: 
 *@2014-7-23
 */
public class StringTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//显示美元符号以及三位加一个逗号
		int accountBalance = 5005;
		System.out.format("Balance: $%,d%n",accountBalance);
		
		//显示圆周率小数点的位数
		double pi = Math.PI;
		System.out.format("%.11f%n", pi);
		
		//类方法
		String s,s1,s2;
		s = "item";
		s1 = s.valueOf(550);
		System.out.println(s1);
		s2 = String.valueOf(550);
		System.out.println(s2);
	}
}

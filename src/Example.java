/**
 * @author 姚义祥
 * @2015-4-10
 * @desperation:
 * 
 */
public class Example {
	String str = new String("good");
	String str2 = "good";
	char[] ch = { 'a', 'b', 'c' };

	public static void main(String args[]) {
		Example ex = new Example();
		ex.change(ex.str2, ex.ch);
		System.out.print(ex.str2 + " and ");
		System.out.println(ex.ch);
		ex.change(ex);
		System.out.print(ex.str + " and ");
		System.out.println(ex.ch);
	}

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'g';
	}

	public void change(Example exp) {
		exp.str = "test ok";
		exp.ch[0] = 'g';
	}
}

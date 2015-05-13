/**
 * @author 姚义祥
 * @2015-4-12
 * @desperation:
 * 
 */
public class StringBufferTest {
	public static void main(String[] args) {
		int a = 1;
		String b = "1";
		char[] d = {'1'};
		String c = new String("1");
		StringBufferTest bufferTest = new StringBufferTest();
		bufferTest.change(a);
		bufferTest.change(b);
		bufferTest.change(c);
		bufferTest.change(d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public void change(int tmp) {
		tmp = 2;
	}

	public void change(String tmp) {
		tmp = "2";
	}
	
	public void change(char ch[]) {
		ch[0] = '2';
	}
}

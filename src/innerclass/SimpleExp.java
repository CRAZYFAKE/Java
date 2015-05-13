package innerclass;

/**
 * @author 祥
 * @desperation:
 * @2014-7-19
 */
class Outer0 {
	private int i = 10;
	private int y = 8;

	Outer0() {
		System.out.println("调用Outer0构造方法：Outer0");
	}

	public void sayMsg() {
		System.out.println("Outer0 class!");
	}

	class Inner {
		int i = 1000;

		Inner() {
			System.out.println("调用Inner构造方法：inner");
		}

		void innerMsg() {
			System.out.println(">>>>>Inner class!");
			sayMsg();
			// 访问内部类自己的成员i，也可以写成 this.i++
			this.i++;
			// 访问外部类的成员 i和y
			Outer0.this.i++;
			y--;
		}

		int getI() {
			return i;
		}
	}

	public void test() {
		Inner in = new Inner();
		in.innerMsg();
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}


class SimpleExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outer0 Outer0 = new Outer0();
		Outer0.test();
		System.out.println(Outer0.getI());
		System.out.println("---------1--------");
		
		Outer0.Inner inner = Outer0.new Inner();
		inner.innerMsg();
		System.out.println(inner.getI());
		System.out.println("---------2--------");
		
		System.out.println(Outer0.getI());
	}
}

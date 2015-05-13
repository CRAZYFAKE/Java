package innerclass;

public class Outer {
	int outerField = 0;

	class Inner {
		void InnerMethod() {
			int i = outerField;
		}
	}
	public static void main(String[] args) {
		
	}
}

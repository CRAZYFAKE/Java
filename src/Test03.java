public class Test03 {
	public static void main(String[] args) {
		 StringBuffer s1 = new StringBuffer("s1");
		 StringBuffer s2 = new StringBuffer("s2");
//		String s1 = new String("s1");
//		String s2 = new String("s2");
		new Test03().test(s1, s2);
		System.out.println(s1);// 9
		System.out.println(s2);// 10
	}

	public void test(String s1, String s2) {
		s2 = s1;// 3
		s1 = new String("new");// 4
		// System.out.println(s1);// 5
		// System.out.println(s2);// 6
		s1 = s1 + " haha";
		s2 = s2 + " haha";
		System.out.println(s1);
		System.out.println(s2 + "\n");
	}

	public void test(StringBuffer s1, StringBuffer s2) {
		s2 = s1;// 3
		s1 = new StringBuffer("new");// 4
		// System.out.println(s1);// 5
		// System.out.println(s2);// 6
		s1.append(" haha");// 7
		s2.append(" haha");// 8
		System.out.println(s1);
		System.out.println(s2 + "\n");
	}

}
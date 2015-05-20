public class Test {

	public int countBitDiff(int m, int n) {
		String m1 = Integer.toBinaryString(m);
		String n1 = Integer.toBinaryString(n);
		int mLenth = m1.length();
		int nLenth = n1.length();
		int answer = 0;
		int result = 0;
		if (mLenth >= nLenth) {
			for (int i = mLenth - 1; i > mLenth - nLenth - 1; i--) {
				if (m1.charAt(i) != n1.charAt(i - mLenth + nLenth)) {
					answer++;
				}
			}
			result = answer + mLenth - nLenth;
		} else if (mLenth < nLenth) {
			for (int i = nLenth - 1; i > nLenth - mLenth - 1; i--) {
				if (m1.charAt(i - nLenth + mLenth) != n1.charAt(i)) {
					answer++;
				}
			}
			result = answer + nLenth - mLenth;
		}
		return result;
	}

	public static void main(String[] argv) {
		// String m = Integer.toBinaryString(2299);
		// String n = Integer.toBinaryString(1999);
		// int mLenth = m.length();
		// int nLenth = n.length();
		// int answer = 0;
		// if (mLenth >= nLenth) {
		// for (int i = mLenth - 1; i > mLenth - nLenth - 1; i--) {
		// if (m.charAt(i) != n.charAt(i - mLenth + nLenth)) {
		// answer++;
		// }
		// }
		// System.out.println(answer + mLenth - nLenth);
		// } else if (mLenth < nLenth) {
		// for (int i = nLenth - 1; i > nLenth - mLenth - 1; i--) {
		// if (m.charAt(i - nLenth + mLenth) != n.charAt(i)) {
		// answer++;
		// }
		// }
		// System.out.println(answer + nLenth - mLenth);
		// }
		// Test test = new Test();
		// 16807,282475249
		// System.out.println(test.countBitDiff(16807, 282475249));
		System.out.println(countBitDiff1(16807, 282475249));
	}

	static int countBitDiff1(int m, int n) {
		// int res = m ^ n;
		// int num = 0;
		// for (int i = 0; i < 32; i++) {
		// if (((res >> i) & 1) == true) {
		// num++;
		// }
		// }
		// return num;
		return 1;
	}
}
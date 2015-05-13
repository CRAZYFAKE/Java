/**
 * @author 姚义祥
 * @2015-4-13
 * @desperation:
 * 
 */
public class StringTest01 {
	public static void main(String[] args) {
		Integer c2 = 128;
		Integer d2 = 128;
		System.out.println(c2 == d2);

		Integer c12 = 1;
		Integer d12 = 1;
		System.out.println(c12 == d12);

		int h = 11;
		h ^= (h >>> 20) ^ (h >>> 12);
		System.out.println(h ^ (h >>> 7) ^ (h >>> 4));
		indexFor(6, 17);
	}

	static void indexFor(int h, int length) {
		System.out.println(h & (length - 1));
	}
}

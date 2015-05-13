package string;

import java.util.Iterator;

/**
 * @author 姚义祥
 * @2015-4-8
 * @desperation:
 * 
 */
public class TestString {

	public static void main(String[] args) {
		new TestString().testLength();
		new TestString().testSubString();
		new TestString().testSplit();
		new TestString().testStartsendsWith();
		new TestString().testReplaceAll();
	}

	public void testLength() {
		String slenString = "abc";
		String slennString = new String("abcdef");
		System.out.println(slenString.length());
		System.out.println(slennString.length());
		System.out.println("1-----------------");
	}

	public void testSubString() {
		String se = new String("abcdefgh");
		String sea = se.substring(3);
		String seaa = se.substring(3, 5);
		System.out.println(sea);
		System.out.println(seaa);
		System.out.println("2-----------------");
	}

	public void testSplit() {
		String s = "阳光:沙滩:海浪:仙人掌";
		String[] results = s.split(":");
		String[] result = s.split(":", 3);
		for (String each : results) {
			System.out.println(each);
		}
		System.out.println("-------");
		for (String each : result) {
			System.out.println(each);
		}
		System.out.println("3-----------------");
	}

	public void testStartsendsWith() {
		String str2 = new String("zyxwvuabcdef");
		boolean bstart = str2.startsWith("z");
		boolean bend = str2.endsWith("f");
		if (bstart) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (bend) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		System.out.println("4-----------------");
	}

	public void testReplaceAll() {
		String sre = new String("cbadzyc");
		String rsre = sre.replace("c", "a");
		String rasre = sre.replaceAll("c", "b");
		System.out.println(rsre);
		System.out.println(rasre);
		System.out.println("5-----------------");
		
		String sreString = new String("123123");
		System.out.println(sreString.replaceAll("\\d", "\\"));
		System.out.println();
	}
}

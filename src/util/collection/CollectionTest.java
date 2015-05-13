package util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import reflection.FindMethod;

/**
 * @author 姚义祥
 * @2015-5-2
 * @desperation:
 */
public class CollectionTest extends Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(441);
		list.add(55);
		Collections.sort(list);
		System.out.println(list);

		CollectionTest collectionTest = new CollectionTest();
		Test test = new Test();
		System.out.println(test.hashCode());
		System.out.println(collectionTest.hashCode());

		test = collectionTest;
		System.out.println(test.hashCode());
		System.out.println(collectionTest.hashCode());

		String a = "1";
		String b = "1";
		String c = "2";
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(a.hashCode() == c.hashCode());

//		System.out.println(a.hashCode() == b.hashCode());
	}
}

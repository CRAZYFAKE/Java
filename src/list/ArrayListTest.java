package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 4; i++) {
			list.add(i);
		}
		System.out.println(list);
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals(1)) {
				list.remove(i);
			}
		}
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(1)) {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}

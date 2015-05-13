package java21;

import java.awt.Point;

/**
 *@author 祥
 *@desperation: 
 *@2014-7-23
 */
public class PointTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point location = new Point(13,4);
		System.out.println("Location position: ");
		System.out.println("x = " + location.x);
		System.out.println("y = " + location.y);
		
		System.out.println("\n Moving to (7,6)");
		location.x = 7;
		location.y = 6;
		System.out.println("Location position: ");
		System.out.println("x = " + location.x);
		System.out.println("y = " + location.y);
	}
	/**
	 new class
	 */
}

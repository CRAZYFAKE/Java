package java21;

import java.awt.Point;

/**
 *@author 祥
 *@desperation: 演示引用的工作原理
 *@2014-7-23
 */
public class RefTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point pt1 , pt2;
		pt1 = new Point(100,100);
		pt2 = pt1; // pt2 引用pt1,而不是将pt1的拷贝给pt2
		
		pt2.x = 200;
		pt2.y = 300;
		System.out.println("Point1: " + pt1.x + "," + pt1.y);
		System.out.println("Point2: " + pt2.x + "," + pt2.y);
		//pt2引用的对象与pt1相同
		//都可以用来引用该对象 或者 修改它的变量
	}
}

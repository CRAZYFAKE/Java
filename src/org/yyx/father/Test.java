package org.yyx.father;

import calss.UpcastClass;

/**
 * @author 姚义祥
 * @2015-5-19
 * @desperation:
 * 
 */

class Shape {
	public void draw() {
		System.out.println("shape");
	}
}

class Cir extends Shape {
	@Override
	public void draw() {
		System.out.println("cir");
	}
}

class Cir1 extends Shape {
	@Override
	public void draw() {
		System.out.println("cir1");
	}
}

class Cir2 extends Shape {
	@Override
	public void draw() {
		System.out.println("cir2");
	}
}

public class Test {
	static void doS(Shape shape) {
		shape.draw();
	}

	static void doS(Cir cir) {
		cir.draw();
	}

	public static void main(String[] args) {
		doS(new Cir());
		doS(new Cir1());
		doS(new Cir2());
		doS(new Shape());
	}
}

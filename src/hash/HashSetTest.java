package hash;

import java.util.HashSet;

/**
 * @author 姚义祥
 * @2015-4-25
 * @desperation:
 * 
 */
class Car {
	private int price;
	private String color;

	public Car(int price, String color) {
		this.price = price;
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "price : " + this.price + "\ncolor : " + this.color;
	}

	@Override
	public boolean equals(Object obj) {
		Car car = (Car) obj;
		if (car.price == price) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return new Integer(price).hashCode();
	}
}

public class HashSetTest {
	public static void main(String[] args) {
		Car car1 = new Car(1, "blue");
		Car car2 = new Car(2, "red");
		HashSet<Car> hashSet = new HashSet<Car>();
		hashSet.add(car1);
		hashSet.add(car2);
		for (Car iCar : hashSet) {
			System.out.println(iCar.toString());
			System.out.println("---------");
		}
	}
}

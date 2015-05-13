package designmodel;

interface Driver1 {
	public Car driverCar();
}
class BenzDriver implements Driver1 {
	@Override
	public Car driverCar() {
		return new Benz();
	}
}
class BmwDriver implements Driver1 {

	@Override
	public Car driverCar() {
		return new Bmw();
	}
}
public class FactoryPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Driver1 driver = new BenzDriver();
		Car car = driver.driverCar();
		car.drive();
	}

}

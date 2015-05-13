package designmodel;
//抽象产品角色
interface Car {
	public void drive();
}
//Benz产品角色
class Benz implements Car {

	@Override
	public void drive() {
		System.err.println("Drive Benz");
	}
}
//Bmw产品角色
class Bmw implements Car {

	@Override
	public void drive() {
		System.err.println("Drive Bmw");
	}
}
class Driver {
	public static Car driverCar(String s)throws Exception{
		if (s.equalsIgnoreCase("Benz")) {
			return new Benz();
		}
		else if (s.equalsIgnoreCase("Bmw")) {
			return new Bmw();
		}
		return null;
	}
}
public class SimpleFactory {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Car car = Driver.driverCar("benz");
		car.drive();
		Car car1 = Driver.driverCar("bmw");
		car1.drive();
	}

}

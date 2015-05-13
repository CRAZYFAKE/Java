package design;

/**
 * @author 姚义祥
 * @2014-11-19
 * @desperation: 工厂方法模式
 * 
 */
abstract class BMW1 {
	public BMW1() {
	}
}

class BMW1320 extends BMW {
	public BMW1320() {
		System.out.println("正在制造-->BMW320 ...");
	}
}

class BMW1523 extends BMW {
	public BMW1523() {
		System.out.println("正在制造-->BMW523 ...");
	}
}

interface FactoryBMW {
	BMW creatBMW();
}

class FactoryBMW320 implements FactoryBMW {

	@Override
	public BMW320 creatBMW() {
		return new BMW320();
	}
}

class FactoryBMW523 implements FactoryBMW {

	@Override
	public BMW523 creatBMW() {
		return new BMW523();
	}
}

public class FactoryMethod {

	public static void main(String[] args) {
		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		BMW320 bmw320 =  factoryBMW320.creatBMW();
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		BMW523 bmw523 = factoryBMW523.creatBMW();
	}
}

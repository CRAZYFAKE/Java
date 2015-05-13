package design;

/**
 * @author 姚义祥
 * @2014-11-19
 * @desperation:
 * 
 */
interface IProduction {
	public void show();
}

class Production1 implements IProduction {
	@Override
	public void show() {
		System.out.println("正在生产产品1 ...");
	}
}

class Production2 implements IProduction {
	@Override
	public void show() {
		System.out.println("正在生产产品2 ...");
	}
}

interface IFactory {
	public Production1 creatProduction1();
	public Production2 creatProduction2();
}
class Factory1 implements IFactory{

	@Override
	public Production1 creatProduction1() {
		return new Production1();
	}

	@Override
	public Production2 creatProduction2() {
		return new Production2();
	}
}
public class FactoryAbstract {

	public static void main(String[] args) {
		Factory1 factory = new Factory1();
		factory.creatProduction1().show();
		factory.creatProduction2().show();
	}
}

package design;

/**
 * @author 姚义祥
 * @2014-11-19
 * @desperation: 简单工厂模式 客户需要知道怎么去创建一款车,客户和车就紧密耦合在一起了.
 *               为了降低耦合,就出现了工厂类,把创建宝马的操作细节都放到了
 *               工厂里面去,客户直接使用工厂的创建工厂方法,传入想要的宝马车型号就行了,
 *               而不必去知道创建的细节.这就是工业革命了：简单工厂模式
 * 
 */
abstract class BMW {
	public BMW() {
	}
}

class BMW320 extends BMW {
	public BMW320() {
		System.out.println("正在制造-->BMW320 ...");
	}
}

class BMW523 extends BMW {
	public BMW523() {
		System.out.println("正在制造-->BMW523 ...");
	}
}

/**
 * 工厂类
 */
class Factory {
	public BMW createBMW(int type) {
		switch (type) {
		case 320:
			return new BMW320();
		case 523:
			return new BMW523();
		default:
			break;
		}
		return null;
	}
}

/**
 * @ClassName: FactorySimple
 * @Description: 简单工厂
 * @author: 姚义祥
 * @version: 2014-11-19 下午9:44:18
 */

public class FactorySimple {

	public static void main(String[] args) {
		Factory factory = new Factory();
		BMW bmw320 = factory.createBMW(320);
		System.out.println(bmw320);
		BMW bmw523 = factory.createBMW(523);
		System.out.println(bmw523);
	}
}

package designmodel;

/**
 * @author 姚义祥
 * @2015-3-23
 * @desperation:
 * 
 */
interface Work {
	public void paint();
}

class Son implements Work {

	@Override
	public void paint() {
		System.out.println("儿子用铅笔画好了一幅画.");
	}
}

class Mother implements Work {

	// 被装饰者
	private Work work;

	public Mother(Work work) {
		this.work = work;
	}

	@SuppressWarnings("unused")
	private Mother() {
	}

	@Override
	public void paint() {
		System.out.println("妈妈正在做给画上颜色前的准备工作。");
		work.paint();
		// 妈妈装饰者做的职责
		System.out.println("妈妈给画上好了颜色。");
	}

}

class Fathor implements Work {

	// 被装饰者
	private Work work;

	public Fathor(Work work) {
		this.work = work;
	}

	@SuppressWarnings("unused")
	private Fathor() {
	}

	@Override
	public void paint() {
		System.out.println("爸爸正在做上画框前的准备工作。");
		work.paint();
		// 妈妈装饰者做的职责
		System.out.println("爸爸给画装好了一个画框。");
	}

}

public class Decorator {

	public static void main(String[] args) {
		Work work = new Son();
		work.paint();
		System.out.println();

		work = new Mother(work);
		work.paint();
		System.out.println();

		work = new Fathor(work);
		work.paint();
		System.out.println();
	}
}

package thread;

public class ThreadSimple extends Thread{

	/**
	 * @param args
	 */
	@Override
	public void run() {
		System.err.println("something is run here");
	}
	public void run(String s) {
		System.err.println("string in run is " + s);
	}
	public static void main(String[] args) {
		ThreadSimple ts = new ThreadSimple();
		ts.start();
		ts.run("it won't auto run!!");
	}

	
	
	/* 输出的结果顺序反了 */
	/* 没有参数的run()方法是自动被调用的，而带参数的run()是被重载的，必须显式调用。 */
	/* 一旦调用start()方法，必须给JVM点时间，让它配置进程。而在它配置完成之前，重载的run(String s)方法被调用了，
	 * 结果反而先输出了“string in run is it won't auto run!”，这时tt线程完成了配置，
	 * 输出了“someting run here！”。 */
}

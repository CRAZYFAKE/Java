package thread;

public class ThreadBase implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadBase tt = new ThreadBase();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		t1.start();
		t2.start();
		
		new Thread(){

			@Override
			public void run() {
				System.err.println("something that we familiar run here");
			}
			
		}.start();
	}

	@Override
	public void run() {
		System.err.println("something is run there");
	}
}

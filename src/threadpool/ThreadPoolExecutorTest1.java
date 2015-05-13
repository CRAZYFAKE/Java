package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorTest1 {

	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(0, 0, 0, null, null);
		ExecutorService fixedThreedPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			fixedThreedPool.execute(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(200);
						System.out.println(index);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}

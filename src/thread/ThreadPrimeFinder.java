package thread;
/**
 *@author 姚义祥
 *@2014-8-31
 *@desperation: 
 *
 */
public class ThreadPrimeFinder implements Runnable{

	public long target;
	public long prime;
	public boolean finished = false;
	private Thread runner;
	
	ThreadPrimeFinder(long inTarget) {
		target = inTarget;
		if (runner == null) {
			runner = new Thread(this);
			runner.start();
		}
	}
	
	@Override
	public void run() {
		long numPrimes = 0;
		long candiDate = 0;
		while(numPrimes < target) {
			if (isPrime(candiDate)) {
				numPrimes ++;
				prime = candiDate;
			}
			candiDate ++;
		}
		finished = true;
	}
	
	boolean isPrime(long chechNumber) {
		double root = Math.sqrt(chechNumber);
		for (int i = 2; i <= root; i++) {
			if (chechNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}

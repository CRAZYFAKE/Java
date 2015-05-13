package thread;

/**
 * @author 姚义祥
 * @2014-8-31
 * @desperation:
 * 
 */
public class ThreadPrime {

	public static void main(String[] args) {

	}

	public ThreadPrime(String[] arguments) {
		ThreadPrimeFinder[] finder = new ThreadPrimeFinder[arguments.length];
		for (int i = 0; i < arguments.length; i++) {
			try {
				long count = Long.parseLong(arguments[i]);
				finder[i] = new ThreadPrimeFinder(count);
				System.out.println("looking for prime " + count);
			} catch (NumberFormatException nfe) {
				System.out.println("error: " + nfe.getMessage());
			}
		}
		boolean complete = false;
		while (!complete) {
			complete = true;
			for (int j = 0; j < finder.length; j++) {
				if (finder[j] == null) {
					continue;
				} else {
					displayResult(finder[j]);
					finder[j] = null;
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

	private void displayResult(ThreadPrimeFinder finder) {
		System.out.println("prime " + finder.target + "is" + finder.prime);
	}
}

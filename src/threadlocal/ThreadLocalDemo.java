package threadlocal;

import java.util.Random;

/**
 * @author 姚义祥
 * @2015-4-20
 * @desperation:
 * 
 */
public class ThreadLocalDemo implements Runnable {

	private final static ThreadLocal<Student> studentLocal = new ThreadLocal<Student>();

	public static void main(String[] agrs) {
		ThreadLocalDemo td = new ThreadLocalDemo();
		Thread t1 = new Thread(td, "a");
		Thread t2 = new Thread(td, "b");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		accessStudent();
	}

	public void accessStudent() {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println(currentThreadName + " is running!");

		Random random = new Random();
		int age = random.nextInt(100);
		System.out.println("thread " + currentThreadName + " set age to:" + age);

		Student student = getStudent();
		student.setAge(age);
		System.out.println("thread " + currentThreadName + " first read age is"
				+ student.getAge());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("thread " + currentThreadName + " second read age is:"
				+ student.getAge());
	}

	protected Student getStudent() {
		Student student = (Student) studentLocal.get();

		if (student == null) {
			student = new Student();
			studentLocal.set(student);
		}
		return student;
	}
}

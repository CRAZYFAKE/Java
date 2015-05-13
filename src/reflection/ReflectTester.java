package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 姚义祥
 * @2014-10-3
 * @desperation:
 * 
 */
public class ReflectTester {

	/**
	 * 通过java的反射机制获取类的所有属性和方法
	 */

	public void test1() {
		try {
			Class c = Class.forName("reflection.Customer");
			System.out.println("属性:");
			Field f[] = c.getDeclaredFields();
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i].getName());
			}
			System.out.println("方法：");
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 通过 java 的反射机制动态修改对象的属性
	 * 
	 * @param o
	 */
	public void test2(Customer o) {
		try {
			Class c = o.getClass();
			Method sAge = c.getMethod("setAge", new Class[] { int.class });
			Method gAge = c.getMethod("getAge", null);
			Method sName = c.getMethod("setName", new Class[] { String.class });

			Object[] args1 = { new Integer(25) };
			sAge.invoke(o, args1);

			Integer AGE = (Integer) gAge.invoke(o, null);
			System.out.println("the Customer age is: " + AGE.intValue());
			Object[] args2 = { new String("李四") };
			sName.invoke(o, args2);
		} catch (Throwable e) {
			System.err.println(e);
		}
	}

	/**
	 * 通过 java 的反射机制做一个简单对象的克隆
	 * 
	 * @param o
	 */

	public Object test3(Customer o) {
		Object o2 = null;
		try {
			Class c = o.getClass();
			o2 = c.getConstructor(new Class[] {}).newInstance(new Object[] {});
		} catch (Throwable e) {
			System.out.println(e);
		}
		return o2;
	}

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @author: 姚义祥
	 * @version: 2014-10-3 上午10:52:20
	 * @param args
	 *            设定文件
	 * @throws
	 */
	public static void main(String[] args) {
		ReflectTester t = new ReflectTester();
		t.test1();
		Customer customer = new Customer();
		customer.setAge(20);
		customer.setName("张三");
		System.out.println("调用前name:" + customer.getName());
		System.out.println("调用前age: " + customer.getAge());
		t.test2(customer);
		System.out.println("调用后name: " + customer.getName());
		System.out.println("调用后age: " + customer.getAge());
		Customer customer2 = (Customer) t.test3(customer);
		System.out.println("克隆对象的name: " + customer2.getName());
		System.out.println("克隆对象的age: " + customer2.getAge());
	}
}

class Customer {
	private long id;
	private String name;
	private int age;

	public Customer() {

	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

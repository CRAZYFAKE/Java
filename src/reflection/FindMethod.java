package reflection;

import java.lang.reflect.Method;

/**
 *@author 姚义祥
 *@2014-10-3
 *@desperation: 
 *
 */

public class FindMethod {

	/**  
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @author: 姚义祥
	 * @version: 2014-10-3 上午10:42:31  
	 * @param args    设定文件 
	 * @throws 
	 */
	public class Method1{
		@SuppressWarnings("unused")
		private int f1(Object p, int x) throws NullPointerException { 
			   if (p == null) 
			      throw new NullPointerException(); 
			   return x; 
		}
	}
	public static void main(String[] args) {
		try { 
	           Class cls = Class.forName("reflection.FindMethod"); 
	           Method methlist[] = cls.getDeclaredMethods(); 
	           for (int i = 0; i < methlist.length; i++) { 
	               Method m = methlist[i]; 
	               System.out.println("name = " + m.getName()); 
	               System.out.println("decl class = " + m.getDeclaringClass()); 
	               Class pvec[] = m.getParameterTypes(); 
	               for (int j = 0; j < pvec.length; j++) 
	                   System.out.println("param #" + j + " " + pvec[j]); 
	               Class evec[] = m.getExceptionTypes(); 
	               for (int j = 0; j < evec.length; j++) 
	                   System.out.println("exc #" + j + " " + evec[j]); 
	               System.out.println("return type = " + m.getReturnType()); 
	               System.out.println("-----"); 
	           } 
	       } 
	       catch (Throwable e) { 
	           System.err.println(e); 
	       }
	}
}

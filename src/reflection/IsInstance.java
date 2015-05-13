  
    /**   
     * 文件名：IsInstance.java   
     * @Description: 描述
     * 版本信息：   
     * 日期：2014-10-3   
     * Copyright 姚义祥 2014    
     * 版权所有    
     */   
    
package reflection;
/**
 *@author 姚义祥
 *@2014-10-3
 *@desperation: 
 *
 */

class S{
	
}

public class IsInstance {

	/**  
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @author: 姚义祥
	 * @version: 2014-10-3 上午10:36:44  
	 * @param args    设定文件 
	 * @throws 
	 */
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("S");
			boolean b1 = cls.isInstance(new Integer(23));
			System.out.println(b1);
			
			boolean b2 = cls.isInstance(new S());
			System.out.println(b2);
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}


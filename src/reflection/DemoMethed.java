  
    /**   
     * 文件名：DemoMethed.java   
     * @Description: 描述
     * 版本信息：   
     * 日期：2014-10-3   
     * Copyright 姚义祥 2014    
     * 版权所有    
     */   
    
package reflection;

import java.lang.reflect.Method;
/**
 *@author 姚义祥
 *@2014-10-3
 *@desperation: 
 *
 */

/**   
 * @ClassName: DemoMethed
 * @Description: 描述   
 * @author: 姚义祥
 * @version: 2014-10-3 上午10:31:57    
 */

public class DemoMethed {

	/**  
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @author: 姚义祥
	 * @version: 2014-10-3 上午10:31:57  
	 * @param args    设定文件 
	 * @throws 
	 */
	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.lang.String");
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(m[i].toString());
			}
		} catch (Throwable e) {
			System.err.println(e);
		}
	}
}

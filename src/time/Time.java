package time;

import java.sql.Date;

/**
 *@author 姚义祥
 *@2014-10-5
 *@desperation: 
 *
 */
public class Time {

	/**  
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @author: 姚义祥
	 * @version: 2014-10-5 下午4:41:01  
	 * @param args    设定文件 
	 * @throws 
	 */
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		System.err.println(date);
	}
	
}

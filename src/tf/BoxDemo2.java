package tf;
/**
 *@author 姚义祥
 *@2014-10-11
 *@desperation: 
 *
 */
public class BoxDemo2 {

	/**  
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @author: 姚义祥
	 * @version: 2014-10-11 下午2:18:38  
	 * @param args    设定文件 
	 * @throws 
	 */
	public static void main(String[] args) {
		Box<String> integerBox = new Box<String>();
		integerBox.add("1110");
		
		String integer = (String)integerBox.get();
		System.err.println(integer);
	}
}

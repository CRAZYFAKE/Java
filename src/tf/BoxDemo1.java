package tf;
/**
 *@author 姚义祥
 *@2014-10-11
 *@desperation: 
 *
 */
public class BoxDemo1 {

	/**  
	 * @Title: main 
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @author: 姚义祥
	 * @version: 2014-10-11 下午2:15:13  
	 * @param args    设定文件 
	 * @throws 
	 */
	public static void main(String[] args) {
		Box integerBox = new Box();
        integerBox.add(new Integer(1110));
        Integer someInteger = (Integer)integerBox.get();
        System.out.println(someInteger);
	}
}

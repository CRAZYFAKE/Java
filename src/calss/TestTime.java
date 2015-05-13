package calss;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Date;

import javax.xml.crypto.Data;

/**
 * @author 姚义祥
 * @2014-10-16
 * @desperation:
 * 
 */
public class TestTime {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @author: 姚义祥
	 * @version: 2014-10-16 下午6:28:34
	 * @param args
	 *            设定文件
	 * @throws
	 */
	public static void main(String[] args) {// 将字符串转换为日期
		
		String s = "19922012";
		java.util.Date data = null;
		java.text.DateFormat format2 = new java.text.SimpleDateFormat(  
                "yyyyMMdd");  
		try {
			data = format2.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Timestamp ts = new Timestamp(data.getTime());
        System.out.println(ts); 
	}
}

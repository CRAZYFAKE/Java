package calss;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Arrays;

import javax.print.attribute.standard.Sides;
import javax.security.auth.PrivateCredentialPermission;

/**
 * @author 姚义祥
 * @2014-10-19
 * @desperation:
 * 
 */
public class Test {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @author: 姚义祥
	 * @version: 2014-10-19 下午6:01:18
	 * @param args
	 *            设定文件
	 * @throws
	 */
	public static void main(String[] args) {
		 java.util.Date data = null;
		 java.text.DateFormat format2 = new java.text.SimpleDateFormat(
		 "yyyy-MM-dd");
		 try {
		 data = format2.parse("2010-02-03");
		 } catch (ParseException e) {
		 e.printStackTrace();
		 }
		 Timestamp ts = new Timestamp(data.getTime());
		 System.err.println(ts);
	}
}

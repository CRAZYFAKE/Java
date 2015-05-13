import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * @author 姚义祥
 * @2015-4-12
 * @desperation:
 * 
 */
public class TuLing {

	public static void main(String[] args) throws Exception {
		String APIKEY = "64d6d280787139b7ed8a56bad1d1c633";
		String INFO = URLEncoder.encode("列车", "utf-8");
		String getURL = "http://www.tuling123.com/openapi/api?key=" + APIKEY
				+ "&info=" + INFO;
		URL getUrl = new URL(getURL);
		HttpURLConnection connection = (HttpURLConnection) getUrl
				.openConnection();
		connection.connect();
 
		// 取得输入流，并使用Reader读取
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				connection.getInputStream(), "utf-8"));
		StringBuffer sb = new StringBuffer();
		String line = "";
		while ((line = reader.readLine()) != null) {
			sb.append(line);
		}
		reader.close();
		// 断开连接
		connection.disconnect();
		System.out.println(sb.toString());
	}
}

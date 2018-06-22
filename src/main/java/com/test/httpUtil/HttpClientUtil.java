/**
 * 
 */
package com.test.httpUtil;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;


/**
 * @author 晋东
 *
 */
public class HttpClientUtil {

	public static String doPost(String url,String jsonStr,String charset){
		HttpClient httpClient = null;
		HttpPost httpPost = null;
		String result = null;
		try {
			httpClient = new SSLClient();
			httpPost = new HttpPost(url);
			httpPost.addHeader("Content-Type","application/json");
			StringEntity se = new StringEntity(jsonStr);
			se.setContentType("text/json");
			se.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
			httpPost.setEntity(se);
			HttpResponse response = httpClient.execute(httpPost);
			if(response!=null){
				HttpEntity resEntity = response.getEntity();
				if(response!=null)
					result = EntityUtils.toString(resEntity, charset);
			}
		} catch (Exception e) {
			//http构建失败
			e.printStackTrace();
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		String url = "https://www.baidu.com/s?tn=98012088_5_dg&ch=13&wd=git-receive-pack%20not";
		String str = HttpClientUtil.doPost(url, "zhongguo", "utf-8");
		System.out.println("==="+str);
	}
	
	
}

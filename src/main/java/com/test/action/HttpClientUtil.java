package com.test.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HttpClientUtil {

	private static Log log = LogFactory.getLog(HttpClientUtil.class);
	
	@RequestMapping("/httpClient01")
	public void HttpPostClient(){
		//returnStr();
		
		
	}
	
	public String returnStr(){
		StringBuffer sb = new StringBuffer();
		Properties pro = new Properties();
		System.out.println("123");
		InputStream is = HttpClientUtil.class.getResourceAsStream("/dmconfig.xml");
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		String len="";
		try {
			for (len=br.readLine(); len!=null; len=br.readLine()) {
				sb.append(len+"\n");
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			log.error(e);
		}
		return sb.toString();
	}
	/*@SuppressWarnings("unchecked")
	public Map<String, Object> xmlToMap(String str){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			Document document = DocumentHelper.parseText(str);
			Element ele = document.getRootElement();
			Iterator<Element> it = ele.elementIterator();
			while(it.hasNext()){
				Element element = it.next();
				map.put(element.getName(), element.getTextTrim());
			}
			System.out.println(map);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}*/
	
}

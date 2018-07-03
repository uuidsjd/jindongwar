/**
 * 
 */
package com.test.game;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import com.mysql.fabric.xmlrpc.base.Array;

/**
 * @author 晋东
 *
 */
public class MD5 {

	
	private static Log log = LogFactory.getLog(MD5.class);
	
	private static String[] strForMd5 = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
	
	public MD5(){
		
	}
	
	private static String byte2ArrayString(byte bs){
		int iRet = bs;
		if(iRet<0){
			iRet+=256;
		}
		int iD1 = iRet/16;
		int iD2 = iRet%16;
		return strForMd5[iD1]+strForMd5[iD2];
	}
	
	private static String byte2String(byte[] b){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			sb.append(byte2ArrayString(b[i]));
		}
		return sb.toString();
	}
	
	public static String str2md5(String pw){
		String resultStr = null;
		try {
			resultStr = new String(pw);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultStr = byte2String(md.digest(resultStr.getBytes()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultStr;
	}
	
//	public static void main(String[] args) {
//		String ms = "sjd";
//		String resultms = str2md5(ms);
//		System.out.println(resultms);
//		//7815696ecbf1c96e6894b779456d330e
////		String $_1 = new BASE64Encoder().encodeBuffer(ms.getBytes());
////		try {
////			byte[] $_2 = new BASE64Decoder().decodeBuffer($_1);
////			String $_3 = new String($_2);
////			log.info("原文"+ms);
////			log.info("加密"+$_1);
////			log.info("解密"+$_3);
////		} catch (IOException e) {
////			e.printStackTrace();
////		}
//	}
	
	
}

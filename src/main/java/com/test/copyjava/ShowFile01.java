/**
 * 
 */
package com.test.copyjava;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author 晋东
 *
 */
public class ShowFile01 {
	
	public static void main(String[] args) {
		String filepath = "E:/BaiduNetdiskDownload/尚学堂_高淇_java300集视频教程/Java300集源码、文档、常用软件、开发词汇";
		File dir = new File(filepath);
		String[] children = dir.list();
		if(children==null){
			
		}else{
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
		//文件名过滤器
		FilenameFilter filter = new FilenameFilter() {
			
			@Override
			public boolean accept(File file, String s) {
				System.out.println(s.startsWith("."));
				return s.startsWith(".");
			}
		};
		String[] children01 = dir.list(filter);
		if(children01!=null&&children01.length>0){
			for (int i = 0; i < children01.length; i++) {
				System.out.println(children01[i]);
			}
		}else{
			System.out.println("符合条件的为空");
		}
		
		//文件过滤器
		FileFilter filefilter = new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				// TODO Auto-generated method stub
				return file.isDirectory();
			}
		};
		
		File[] files = dir.listFiles(filefilter);
		if(files.length>0){
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}
		}
		
		
		
		
	}

}

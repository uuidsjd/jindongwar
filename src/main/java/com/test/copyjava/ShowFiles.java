/**
 * 
 */
package com.test.copyjava;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import javax.naming.directory.DirContext;

/**
 * @author 晋东
 *
 */
public class ShowFiles {

	public static void main(String[] args) {
		showfiles();
	}
	public static String showfiles(){
		File dir = new File("E:/BaiduNetdiskDownload/尚学堂_高淇_java300集视频教程");
		String children[] = dir.list();
		if(children==null){
			System.out.println("其下没有文件");
		}else{
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
		
		//文件名过滤器
		FilenameFilter filter = new FilenameFilter() {
			
			@Override
			public boolean accept(File file, String name) {
				System.out.println(!name.startsWith("."));
				return !name.startsWith(".");
			}
		};
		children = dir.list(filter);
		for (int i = 0; i < children.length; i++) {
			String filename = children[i];
			System.out.println("合格文件名"+filename);
		}
		
		File[] files = dir.listFiles();
		//文件过滤器
		FileFilter filefilter = new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				System.out.println("===="+file);
				System.out.println(file.isDirectory());
				return file.isDirectory();
			}
		};
		//返回过滤后的符合条件的是文件夹的路径
		files = dir.listFiles(filefilter);
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		System.out.println(files);
		
		
		
		return null;
	}
	
}

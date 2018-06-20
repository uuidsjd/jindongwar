/**
 * 
 */
package com.test.copyjava;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author 晋东
 *
 */
public class ZIpIt {

	public static void main(String[] args) throws Exception {
		System.out.println(args.length);
		if(args.length<2){
			System.err.println("错误，虚拟机退出");
			System.exit(-1);
		}
		File zipFile = new File(args[0]);
		if(zipFile.exists()){
			System.err.println("程序终止");
			System.exit(-2);
		}
		
		FileOutputStream fos = new FileOutputStream(zipFile);
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		int byteRead;
		byte[] buffer = new byte[1024];
		CRC32 crc = new CRC32();
		for (int i = 0; i < args.length; i++) {
			
			String name = args[i];
			File file = new File(name);
			if(!file.exists()){
				System.err.println("Skipping:"+name);
				continue;
			}
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			crc.reset();//crc=0
			while((byteRead=bis.read(buffer))!=-1){
				crc.update(buffer, 0, byteRead);
			}
			bis.close();
			
			bis = new BufferedInputStream(new FileInputStream(file));
			ZipEntry entry = new ZipEntry(name);
			entry.setMethod(ZipEntry.STORED);
			entry.setCompressedSize(file.length());
			entry.setSize(file.length());
			entry.setCrc(crc.getValue());
			zos.putNextEntry(entry);
			while((byteRead=bis.read(buffer))!=-1){
				zos.write(buffer, 0, byteRead);
			}
			bis.close();
		}
		zos.flush();
		zos.close();
		
	}
	
}

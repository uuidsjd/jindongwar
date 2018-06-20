/**
 * 
 */
package com.test.game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author 晋东
 *
 */
public class GameUtil {

	private static Log log = LogFactory.getLog(GameUtil.class);
	
	private GameUtil(){
		
	}
	
	public static Image getImage(String path){
		BufferedImage bi = null;
		URL u = GameUtil.class.getClassLoader().getResource(path);
		System.out.println(u);
		try {
			bi = ImageIO.read(u);
		} catch (IOException e) {
			log.info(e.getMessage());
		}
		return bi;
	}
	
	
}

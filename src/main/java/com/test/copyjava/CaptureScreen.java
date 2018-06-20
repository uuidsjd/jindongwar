/**
 * 
 */
package com.test.copyjava;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author 晋东
 *
 */
public class CaptureScreen {

	public static void capScreen(String fileName) throws AWTException, IOException{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screenSize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		ImageIO.write(image, "png", new File(fileName));
		System.out.println(screenSize);
		System.out.println(screenRectangle);
		System.out.println(robot);
		System.out.println(image);
		
	}
	
	
	public static void main(String[] args) {
		try {
			capScreen("sun.jpg");
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

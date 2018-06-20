/**
 * 
 */
package com.test.game;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author 晋东
 *
 */
public class Game02 extends Frame{
	
	Image image = GameUtil.getImage("sun.jpg");
	
	public void launchWindows(){
		
		setSize(500, 500);
		setLocation(100, 100);
		setVisible(true);
		
		new PaintThread().start();
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent windowevent) {
				System.exit(0);
			}
			
		});
		
	}
	

	
	
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, (int)X, (int)Y, null);
		
		if(speed>0){
			speed -= 0.05;
		}else{
			speed = 0;
		}
		
		X += speed*Math.cos(degree);
		Y += speed*Math.sin(degree);
		
		if(Y>30||Y<470){
			
			degree = -degree;
			
		}
		
		if(X<0||X>470){
			
			degree = Math.PI - degree;
			
		}
		
	}
	
	class PaintThread extends Thread{

		@Override
		public void run() {
			while(true){
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					log.error(e.getMessage());
				}
			}
		}
		
		
		
	}


	private double X = 100,Y = 100;
	private double degree = 3.14/3;
	private double speed = 100;
	private Log log = LogFactory.getLog(Game02.class);

	public static void main(String[] args) {
		Game02 game = new Game02();
		game.launchWindows();
	}

}

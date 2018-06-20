/**
 * 
 */
package com.test.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author 晋东
 *
 */
public class Game01 extends Frame{
	
	Image image = GameUtil.getImage("sun.jpg");
	
	public static void main(String[] args) {
		Game01 game = new Game01();
		game.launchFrame();
	}

	public void launchFrame(){
		setSize(1000, 1000);
		setLocation(100, 100);
		setVisible(true);
		
		new PaintThread().start();
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosed(WindowEvent arg0) {
				System.exit(0);
			}
		});;
	}

	private double X = 100,Y=100;
	private double degree = 3.14/3;
	private double speed = 20;
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, (int)X, (int)Y, null);
		if(speed>0){
			speed -= 0.01;
		}else{
			speed = 0;
		}
		
		X += speed*Math.cos(degree);
		Y += speed*Math.sin(degree);
		
		if(Y>500-30||Y<30){
			degree = -degree;
		}
		if(X<0||X>500-30){
			degree = Math.PI-degree;
			
		}
		
	}
	
	class PaintThread extends Thread{

		@Override
		public void run() {
			while(true){
				repaint();
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	
}

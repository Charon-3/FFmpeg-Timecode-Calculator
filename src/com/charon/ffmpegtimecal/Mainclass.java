package com.charon.ffmpegtimecal;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class Mainclass {

	public static void main(String[] args) {
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int w = gd.getDisplayMode().getWidth()/2;
		int h = gd.getDisplayMode().getHeight()/2;
		// TODO Auto-generated method stub
		Frame frame = new Frame();
		frame.setSize(300,300);
		frame.setLocation(w,h);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		
	}

}

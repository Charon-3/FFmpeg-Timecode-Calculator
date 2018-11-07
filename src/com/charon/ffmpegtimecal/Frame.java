package com.charon.ffmpegtimecal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7487729017171953241L;
	private JTextField firstSecTimecodeInput;
	private JTextField firstMinTimecodeInput;
	private JTextField firstHourTimecodeInput;
	private JTextField secondSecTimecodeInput;
	private JTextField secondMinTimecodeInput;
	private JTextField secondHourTimecodeInput;
	private JLabel firsttext;
	private JLabel secondtext;
	private JLabel dot;
	private JLabel dot2;
	private JLabel dot3;
	private JLabel dot4;
	private JLabel emptySpace;
	String output ="";
	//AAAAAAAAAAAA
	public Frame() {
		super ("FFmpeg Timecode Calculator");
		setLayout(new FlowLayout());
		
		firsttext = new JLabel("Input First Timecode");
		secondtext = new JLabel("Input Second Timecode");
		dot = new JLabel(":");
		dot2 = new JLabel(":");
		dot3 = new JLabel(":");
		dot4 = new JLabel(":");
		emptySpace = new JLabel("                                                                               ");
		//I am the worst programmer by doing this. But it's just works.
		firstHourTimecodeInput = new JTextField(2);
		firstMinTimecodeInput = new JTextField(2);
		firstSecTimecodeInput = new JTextField(2);
		secondHourTimecodeInput = new JTextField(2);
		secondMinTimecodeInput = new JTextField(2);
		secondSecTimecodeInput = new JTextField(2);
		
		
		add(firsttext);
		add(firstHourTimecodeInput);
		add(dot);
		add(firstMinTimecodeInput);
		add(dot2);
		add(firstSecTimecodeInput);
		add(secondtext);
		add(secondHourTimecodeInput);
		add(dot3);
		add(secondMinTimecodeInput);
		add(dot4);
		add(secondSecTimecodeInput);
		
		add(emptySpace);
		
		add(buttonz);
		buttonz.addActionListener(listener);

	}
	
		SomeActionListener listener = new SomeActionListener();
	 	JButton buttonz=new JButton("Calculate");
	 	
	 	
	    
	private class SomeActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub idk.
			double firstHour = Double.parseDouble(firstHourTimecodeInput.getText());
			double firstMin = Double.parseDouble(firstMinTimecodeInput.getText());
			double firstSec = Double.parseDouble(firstSecTimecodeInput.getText());
			double secondHour = Double.parseDouble(secondHourTimecodeInput.getText());
			double secondMin = Double.parseDouble(secondMinTimecodeInput.getText());
			double secondSec = Double.parseDouble(secondSecTimecodeInput.getText());
			
			double firstHourtoSec = firstHour*3600;
			double secondHourtoSec = secondHour*3600;
			
			double firstMintoSec = firstMin*60;
			double secondMintoSec = secondMin*60;
			
			double allFirst = firstHourtoSec + firstMintoSec + firstSec;
			double allSecond = secondHourtoSec + secondMintoSec + secondSec;
			
			double cal = allSecond - allFirst;
			
			int hours = (int) (cal / 3600);
			int minutes = (int) ((cal % 3600) / 60);
			int seconds = (int) (cal % 60);
			
			JOptionPane.showMessageDialog(null, hours+":"+minutes+":"+seconds, "Output", JOptionPane.CLOSED_OPTION);

			
		}
		
	}
}

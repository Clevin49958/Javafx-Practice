package com.SecretChatter.frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.SecretChatter.panel.MessengerStage;


public class MessengerFrame extends JFrame{
	private static final long serialVersionUID = 2075704820290359758L;
	public final static MessengerFrame INSTANCE = new MessengerFrame(new MessengerStage());
	private MessengerStage stage;
	
	public MessengerFrame(MessengerStage stage) {
		this.stage = stage;
		this.setTitle("Secret Chatter Lite");
		this.setUndecorated(true);
		this.setBackground(new Color(0, 0, 0, 0));
		this.setForeground(Color.BLACK);
		this.setContentPane(stage);
		this.setSize(stage.getWidth(), stage.getHeight());
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((int) ((screen.getWidth() - this.getWidth()) / 2),
				(int) ((screen.getHeight() - this.getHeight()) / 2));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static MessengerFrame getInstance() {
		return INSTANCE;
	}
}

package com.SecretChatter.panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JLayeredPane;

public class MessengerStage extends JLayeredPane{

	private static final long serialVersionUID = 3725336943898528250L;
	//	private ImageIcon background;
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int width;
	int height;
	
	public MessengerStage() {
		width = 1920;
		height = 1080;
		this.setSize(width, height);
		this.setBackground(new Color(255,255,255));
		this.setLayout(null);
		
	}
}

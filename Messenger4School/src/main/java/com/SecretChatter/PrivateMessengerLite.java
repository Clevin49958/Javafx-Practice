package com.SecretChatter;

import com.SecretChatter.frame.MessengerFrame;

public class PrivateMessengerLite {

	public static void main(String[] args) {
		new PrivateMessengerLite();
	}
	
	private PrivateMessengerLite() {
		MessengerFrame.getInstance().setVisible(true);
	}
}

package com.SecretChatter.connection;

import java.io.IOException;
import java.net.Socket;

import org.apache.log4j.Logger;

public class Client {
	static final String SERVER_DEFAULT_IP = "127.0.0.1";
	static final int SERVER_SIDE_PORT=8888;
	static Logger logger = Logger.getLogger(Client.class);
	public static void main(String[] args) {
		try {
			Socket socket = new Socket(SERVER_DEFAULT_IP, SERVER_SIDE_PORT);
			logger.trace("client side set up.");
			new ThreadSending(socket).start();
			new ThreadReceive(socket).start();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

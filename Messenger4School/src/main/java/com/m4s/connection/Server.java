package com.m4s.connection;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.log4j.Logger;

public class Server {
	static Logger logger = Logger.getLogger(Server.class);
	static final int SERVER_SIDE_PORT=8888;
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket= new ServerSocket(SERVER_SIDE_PORT);
			logger.trace("server port" + SERVER_SIDE_PORT);
			Socket socket= serverSocket.accept();
			logger.info("started connection");
			logger.info(socket.getInetAddress());
			new ThreadSending(socket).start();
			new ThreadReceive(socket).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

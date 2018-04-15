package com.SecretChatter.connection;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ThreadReceive extends Thread {
	Socket socket;

	public ThreadReceive(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			InputStream iStream = socket.getInputStream();
			DataInputStream dataInputStream = new DataInputStream(iStream);
			while (true) {
				String msg = dataInputStream.readUTF();
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.err.println("thread receive finished");
	}
}

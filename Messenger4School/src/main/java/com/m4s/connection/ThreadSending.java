package com.m4s.connection;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ThreadSending extends Thread {
	Socket socket;

	public ThreadSending(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		OutputStream oStream = null;
		try {
			oStream = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		DataOutputStream dataOutputStream = new DataOutputStream(oStream);

		try {
			while (true) {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				String msg = scanner.next();
				dataOutputStream.writeUTF(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}

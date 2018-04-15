package com.SecretChatter.connection;

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
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			while (true) {
				String msg = scanner.nextLine();
				dataOutputStream.writeUTF(msg);
				System.out.println("got: " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}

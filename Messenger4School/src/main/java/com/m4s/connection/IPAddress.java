package com.m4s.connection;

/**
 * @author hyxkv
 *
 */
public class IPAddress {
	private int[] ip = new int[4];
	
	
	/**
	 * @param ipString format <b>"192.168.1.73"<b>
	 */
	public IPAddress(String ipString){
		ipString = ipString.replace('.', ':');
		String[] offset = ipString.split(":");
		try {
			for (int i = 0; i < offset.length; i++) {
				ip[i] = Integer.parseInt(offset[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < ip.length; i++) {
			builder.append(ip[i]);
			if (i != ip.length - 1) {
				builder.append('.');
			}
		}
		return builder.toString();
	}
}

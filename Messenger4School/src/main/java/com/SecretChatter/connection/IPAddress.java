package com.SecretChatter.connection;

/**
 * @author hyxkv
 *
 */
public class IPAddress {
	private int[] ip = new int[4];
	
	public static long encoder(IPAddress ipAddress) {
		long result = 0;
		for (int i = 0; i < 4; i++) {
			result = result*1000 + ipAddress.ip[i];
		}
		return result;
	}
	
	public static IPAddress decoder(long ip) {
		return new IPAddress(ip);
	}
	
	public IPAddress(Long ip) {
		try {
			for (int i = 3; i >= 0; i--) {
				this.ip[i] = (int) Math.floorMod(ip, 1000L);
				ip = Math.floorMod(ip, 1000l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
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
	
	public long toLong() {
		long result = 0;
		for (int i = 0; i < 4; i++) {
			result = result*1000 + this.ip[i];
		}
		return result;
	}
}

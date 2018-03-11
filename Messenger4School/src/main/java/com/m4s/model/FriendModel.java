package com.m4s.model;

import com.m4s.connection.IPAddress;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class FriendModel {
	private final SimpleStringProperty name;
	private final SimpleLongProperty ipAddress;
	
	public FriendModel(String name, IPAddress ipAddress) {
		this.name = new SimpleStringProperty(name);
		this.ipAddress = new SimpleLongProperty(ipAddress.toLong());
	}

	public String getName() {
		return name.get();
	}

	public IPAddress getIP() {
		return new IPAddress(ipAddress.get());
	}
	public void setName(String name) {
		this.name.set(name);
	}
	
	public void setIP(IPAddress ipAddress) {
		this.ipAddress.set(ipAddress.toLong());
	}
	
	public SimpleStringProperty getNameProperty() {
		return name;
	}

	public SimpleLongProperty getIpAddressProperty() {
		return ipAddress;
	}
	
	
	
}

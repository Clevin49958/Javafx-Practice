package com.m4s.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Friends")
public class FriendListWrapper {
	private List<FriendModel> friendModels;
	
	@XmlElement(name="friend")
	public List<FriendModel> getFriends() {
		return friendModels;
	}
	
	public void setFriends(List<FriendModel> friendModels) {
		this.friendModels = friendModels;
	}
}

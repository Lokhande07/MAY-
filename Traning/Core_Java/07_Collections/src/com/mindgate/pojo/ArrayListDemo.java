package com.mindgate.pojo;

import java.util.List;

public class ArrayListDemo {
	private int userId;
	private List<String> nameList;

	public ArrayListDemo() {
		// TODO Auto-generated constructor stub
	}

	public ArrayListDemo(int userId, List<String> nameList) {
		super();
		this.userId = userId;
		this.nameList = nameList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	@Override
	public String toString() {
		return "ArrayListDemo [userId=" + userId + ", nameList=" + nameList + "]";
	}

	

	

}

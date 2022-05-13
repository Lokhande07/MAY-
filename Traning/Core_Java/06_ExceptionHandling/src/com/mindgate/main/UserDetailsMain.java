package com.mindgate.main;

import com.mindgate.pojo.UserDetails;

public class UserDetailsMain {

	public static void main(String[] args) {
		UserDetails details = new UserDetails();
		System.out.println("Main Start");
		details.acceptUserDetails();
		details.displayUserDetails();
		System.out.println("Main End");
		try {
			Class.forName("com.mindgate.pojo.UserDetails");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

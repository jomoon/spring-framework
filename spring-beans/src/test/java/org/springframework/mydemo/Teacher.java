package org.springframework.mydemo;

public class Teacher extends User{
	@Override
	public void showMe() {
		System.out.println("i am teacher");
	}
}

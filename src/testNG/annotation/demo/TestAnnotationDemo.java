package testNG.annotation.demo;

import org.testng.annotations.Test;

@Test
public class TestAnnotationDemo {

	
	public void login()
	{
		System.out.println("Login successful......!");
	}
	
	public void logout()
	{
		System.out.println("Logout successful......!");
	}
}
/*
we can apply test annotation to any class so all the methods in that class will be considered as test cases.abstract*/
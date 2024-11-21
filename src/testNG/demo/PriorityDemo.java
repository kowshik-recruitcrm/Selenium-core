package testNG.demo;

import org.testng.annotations.Test;

public class PriorityDemo {

	// a->b->c->d initially testNG will execute in this order (alphabetical).
	
	//with priority it will d->b->c->a  which ever has low priority will execute first and followed by same.
	
	@Test(priority = 4)
	public void a()
	{
		System.out.println("This is test case a");
	}
	
	@Test(priority = 1)
	public void d()
	{
		System.out.println("This is test case d");
	}
	
	@Test(priority = 2)
	public void b()
	{
		System.out.println("This is test case b");
	}
	
	@Test(priority = 3)
	public void c()
	{
		System.out.println("This is test case c");
	}
	
}

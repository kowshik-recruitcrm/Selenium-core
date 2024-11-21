package testNG.demo;

import org.testng.annotations.Test;

public class PriorityPartial {

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
	
	@Test //if we do not specify priority by default it will be 0 priority 
	public void b()
	{
		System.out.println("This is test case b");
	}
	
	@Test //if we do not specify priority by default it will be 0 priority 
	public void c()
	{
		System.out.println("This is test case c");
	}//as b and c have 0 priority (same) so it will follow alphabetical order so order of execution woul be b->c->d->a.
}

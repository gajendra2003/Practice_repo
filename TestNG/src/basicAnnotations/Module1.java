package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module1 {
	@BeforeClass
	public void beforeModule() {
		System.out.println("Before Module");
	}
	
	@AfterClass
	public void afterModule()
	{
		System.out.println("after Module");
	}
	@BeforeMethod
	public void beforeTestScript() {
		System.out.println("Before test script");
	}
	@Test
	public void test1() {
		System.out.println("Login test case");
	}
	@AfterMethod

	public void afterTestScript() {
		System.out.println("After test script");
	}
		@Test
		public void test2() {
			System.out.println("Logout test case");

		}
	}


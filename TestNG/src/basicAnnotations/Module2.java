package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module2 {
	@BeforeClass
	public void beforeModule2() {
		System.out.println("Before Module2");
	}
	
	@AfterClass
	public void afterModule2()
	{
		System.out.println("after Module2");
	}
	@BeforeMethod
	public void beforeTestScript() {
		System.out.println("Before test script2");
	}
	@Test
	public void test1() {
		System.out.println("Login test case");
	}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("After Suite");
	}
	@AfterMethod

	public void afterTestScript() {
		System.out.println("After test script2");
	}
		@Test
		public void test2() {
			System.out.println("Logout test case");

		}
	}


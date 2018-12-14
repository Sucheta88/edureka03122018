package day10;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestingBasics {
	@Test(priority = 0)
	public void testCase1() {
		System.out.println("Executing test case 1");
	}

	@Test(priority = 1)
	public void testCase3() {
		System.out.println("Executing test case 3");
	}

	@Test(priority = 2, enabled = false)
	public void testCase4() {
		System.out.println("Executing test case 4");
	}

	@Test(priority = 3)
	public void testCase2() {
		System.out.println("Executing test case 2");
	}

	@Test(priority = 4)
	public void testCase5() {
		System.out.println("Executing test case 5");
	}
	
	@BeforeMethod
	
	public void executeBeforeTestCase() {
		System.out.println("Executing before every test case");
	}
	
	@AfterMethod
	public void executeAfterTestCase() {
		System.out.println("Executing after every test case");
	}
	
	@BeforeClass
	public void beforeClass() {
	System.out.println("Executing before class start");	
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	}
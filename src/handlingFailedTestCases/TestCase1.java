package handlingFailedTestCases;

import org.testng.annotations.Test;

//How to execute only failed test cases in Selenium,
//I have explained it by taking test cases using 3 different .java files.

public class TestCase1 {
	
	@Test
	public void TestApple() {
		//This test will pass because we are just printing a statement to console
		System.out.println("Apple is working as expected.");
	}
}

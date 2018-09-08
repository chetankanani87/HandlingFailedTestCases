package handlingFailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

	@Test
	public void TestAmazon() {
		// This test will fail because we are forcefully failing it by passing false
		// argument to assert statement.
		System.out.println("In TestCase2.TestAmazon() method, Before Assertion statement.");
		Assert.assertTrue(false);
		System.out.println("Amazon is working as expected.");
	}
}

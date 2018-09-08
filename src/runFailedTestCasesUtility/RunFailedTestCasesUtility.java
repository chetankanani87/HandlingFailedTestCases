package runFailedTestCasesUtility;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunFailedTestCasesUtility {
	public static void main(String[] args) {
		TestNG runFailedTest = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("C:\\Users\\hck\\eclipse-workspace\\HandlingFailedTestCases\\test-output\\TestSuite\\testng-failed.xml");
		runFailedTest.setTestSuites(list);
		runFailedTest.run();
	}
}

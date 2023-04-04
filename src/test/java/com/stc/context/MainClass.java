package com.stc.context;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;

public class MainClass {
	public static void main(String[] args) {
		TestNG testSuite = new TestNG();
		List<String> suites = new ArrayList<String>();
		suites.add(Constants.WORKING_DIRECTORY + "/testng.xml");
		testSuite.setTestSuites(suites);
		testSuite.run();
	}
}
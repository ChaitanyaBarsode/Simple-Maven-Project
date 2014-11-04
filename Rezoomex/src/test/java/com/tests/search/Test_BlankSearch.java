package com.tests.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_BlankSearch {

	@Test
	public void checkTest() {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://search.rezoomex.net/");

		driver.close();

	}
}

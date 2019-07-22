package org.junit.classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAMBHU\\eclipse-workspace\\SeleniumPractice\\GITProject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	@AfterClass
	public static void afterClass() {
		

	}
	@Test
	public void test1() {
		System.out.println("test1");

	}
	@Test
	public void test2() {
		System.out.println("test2");

	}
	@Before
	public void beforeMethod() {
		System.out.println("beforeMethod");

	}
	@After
	public void afterMethod() {
		System.out.println("afterMethod");

	}

}

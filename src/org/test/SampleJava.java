package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleJava {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAMBHU\\eclipse-workspace\\SeleniumPractice\\SeleTask\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement country1 = driver.findElement(By.id("country"));
		Thread.sleep(5000);
		Select s2=new Select(country1);

		s2.selectByValue("India");
		System.out.println(s2.getFirstSelectedOption().getText());
	}

}

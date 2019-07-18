package org.git.tool;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealSample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHAMBHU\\eclipse-workspace\\projectclass\\Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=BrandCat_new&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=e,snapdeal&gclid=CjwKCAjwscDpBRBnEiwAnQ0HQEXCwV6AWZveANs-RwgGog8RmpEHZGwVlUEhDJtE1Qv83sXU9Srv6RoCxHkQAvD_BwE");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		driver.findElement(By.xpath("(//p[text()='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[1]")).click();
		String par = driver.getWindowHandle();
		Set<String> All = driver.getWindowHandles();
		System.out.println(par+"\n"+All);
		
		for (String x : All) {
			if(!x.equals(par)) {
				driver.switchTo().window(x);
			}
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		WebElement printTxt = driver.findElement(By.xpath("//div[@class='you-pay']"));
		String txt = printTxt.getText();
		System.out.println("Total ammount payable for iphone is : "+txt);
		driver.quit();
	}

}

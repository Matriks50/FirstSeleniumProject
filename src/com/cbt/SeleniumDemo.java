package com.cbt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/alexavara/Documents/selenium dependencies/drivers/chromedriver");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://accounts.google.com/signup");
/*		
	String title = driver.getTitle();
	System.out.println("Title " + title);
	
		if (title.equals("cybertek-bnb")) {
			System.out.println("Title verification passed");
		}else {
			System.out.println("Title verification failed");
		}
		
		//driver.findElement(By.linkText("sign up")).click();
	*/	
		driver.findElement(By.name("firstName")).sendKeys("Alex");  
		driver.findElement(By.name("lastName")).sendKeys("Waters");
		driver.findElement(By.name("Username")).sendKeys("watersalex47");
		driver.findElement(By.name("Passwd")).sendKeys("mike123@");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("mike123@");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.className("CwaK9")).click();
		
		//driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8502289999");
//class="RveJvd snByac"
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		driver.close();
	
		//driver.quit();

		}
	}



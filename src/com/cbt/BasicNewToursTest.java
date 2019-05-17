package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNewToursTest {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/alexavara/Documents/selenium dependencies/drivers/chromedriver");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://newtours.demoaut.com/");
	
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	
	driver.findElement(By.name("login")).click();
	
	//Find a Flight: Mercury Tours:
	
	String expected = "Find a Flight";
	String actual =driver.getTitle();
	
	if (actual.contains(expected)) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
		System.out.println("expected:\t "+expected);
		System.out.println("Actual:\t "+actual);
	}
	
	//Thread.sleep(1000);
	//driver.close();
		
	}

	}



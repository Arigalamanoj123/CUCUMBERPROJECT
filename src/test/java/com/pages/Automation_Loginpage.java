package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Loginpage {
WebDriver driver;

	By Accounts1=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
	By username=By.id("username");
	By password=By.id("password");
	By Loginbutton=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[3]/input[3]");
	

public void browser()
{
	System.setProperty("webdriver.chrome.driver","F:\\CUCUMBER\\cucumner\\src\\test\\resources\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
	
	public void Homepage1()
	{
		driver.get("http://practice.automationtesting.in/");
		System.out.println(driver.getTitle());
	}
	
	public void details1()
	{
		driver.findElement(Accounts1).click();
		driver.findElement(username).sendKeys("manojarigala@gmail.com");
		driver.findElement(password).sendKeys("8142298117M");
		driver.findElement(Loginbutton).click();
	}
	public void submit()
	{
		driver.close();
	
	
	
}}
package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Register_page 
{
	WebDriver driver;
	By accounts=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
	By Emailaddress=By.id("reg_email");
	By Password=By.id("reg_password");
	By Register=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/form/p[3]/input[3]");
	
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver","F:\\CUCUMBER\\cucumner\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
	}
	public void Homepage()
	{
		driver.get("http://practice.automationtesting.in/");
		System.out.println(driver.getTitle());
	}
	public void details()
	{
		driver.findElement(accounts).click();
		driver.findElement(Emailaddress).sendKeys("manojarigala@gmail.com");
		driver.findElement(Password).sendKeys("8142298117M");
		
	}
	public void submit()
	{
		driver.findElement(Register).click();
		driver.close();
	}
	
}

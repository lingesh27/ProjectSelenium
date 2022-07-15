package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSelenium {


	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SONY\\eclipse-workspace\\SeleniunTest\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/");

		driver.manage().window().maximize();

		WebElement txtGreens = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		
		String text = txtGreens.getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
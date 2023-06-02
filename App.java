package com.example.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

//Day-4:
//Tasks-3.1,3.2,3.3,3.4

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {

    	
    	WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		String url="https://demo.opencart.com/";
		//Launchig the url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("search"));
		search.sendKeys("mobiles");
		
		
		//to scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)", "");
		Thread.sleep(3000);

//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement returns =driver.findElement(By.linkText("Returns"));
		returns.click();

		
		  driver.navigate().back();
//		  driver.quit();
		WebElement gift =driver.findElement(By.linkText("Gift Certificates"));
			gift.click();
			driver.quit();
		  
    }
}
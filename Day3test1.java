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

public class Day3test1 
{
    public static void main( String[] args ) throws InterruptedException
    {

    	
    	WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
		//Launchig the url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("aji");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("n");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("a@123");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("5676");
	    driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	    Thread.sleep(3000);
    }
}
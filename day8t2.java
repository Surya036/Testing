package com.demo.demoweb;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

 //day8 t2
public class day8t2 {
	WebDriver driver;
	  @Test
	  public void Test() {
		  driver.switchTo().frame(0);
		  WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		  WebElement desElement=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,300)","");
		  Actions as=new Actions(driver);
		  as.clickAndHold(src).release(desElement).build().perform();
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://jqueryui.com/droppable/");
		  driver.manage().window().maximize();
		  
	  }

	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(3000);
		  driver.close();
		  
	  }

	}


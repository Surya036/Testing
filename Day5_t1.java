package testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_t1 {
	
	public static void main(String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Home");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		
		String title2 = driver.getTitle();
		Assert.assertEquals(title2, "Shop");
	
	}

}

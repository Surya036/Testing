package testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_t3 {
	
	public static void main(String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		
		js.executeScript("window.scrollBy(0,200)", "");
		
		String name1 = driver.findElement(By.linkText("Simple")).toString();
		System.out.println(name1);
		
		String name2 = driver.findElement(By.linkText("Variable")).toString();
		System.out.println(name2);
		
		String name3 = driver.findElement(By.linkText("T-Shirt1")).toString();
		System.out.println(name3);
		
	}

}

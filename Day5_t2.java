package testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_t2 {
	
	public static void main(String args[])
	{
	
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
//		Assert.assertEquals(url, "https://j2store.net/free/");
		if(url.equals("https://j2store.net/free/"))
		{
			System.out.println("Correct Title");
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
		
		String url2 = driver.getCurrentUrl();
//		Assert.assertEquals(url2, "https://j2store.net/free/index.php/shop?filter_catid=11");
		if(url2.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		{
			System.out.println("Correct URL");
		}
		
	}

}

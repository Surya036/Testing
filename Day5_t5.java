package testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_t5 {

	public static void main(String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a/span")).click();
		
		WebElement op = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3"));
		String text = op.getText();
		String tag = op.getTagName();
		
		WebElement srh = driver.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/form/div/input"));
		String size = srh.getSize().toString();
		String col = srh.getCssValue("color");
		
		System.out.println(text);
		System.out.println(tag);
		System.out.println(size);
		System.out.println(col);
		
	}
}

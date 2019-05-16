package Traverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbasedlocator {
	
	// date: 30/4/2019
	
	public static void main(String [] arg)
	{
		 System.setProperty("webdriver.chrome.driver","F://Web Drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 
			driver.get("http://www.qaclickacademy.com/interview.php");
		 
		 //text based   //*[text()='content/ name'] 
			driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
			driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();   //2 nd element
			driver.findElement(By.xpath("//*[text()=' Soap UI ']")).click();
	}

}

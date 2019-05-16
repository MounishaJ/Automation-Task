package Traverse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parenttochild {
	public static void main(String []arg)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		
	}

}

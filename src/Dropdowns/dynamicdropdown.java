package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub  
		
		
		/* 3/5/2019
		 * Dynamic Drop Downs
		 * 
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "F:\\Web Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		driver.findElement(By.id("divpaxinfo")).click();    //click dropdown
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		int i=1;
//		while(i<=2)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();  //increment adult 1
//		}
		
		
		
		for(int i=1;i<=1;i++)
			{
				driver.findElement(By.id("hrefIncAdt")).click();  //increment adult 1
			}
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("hrefIncInf")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		//validating text before and after loop
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
	}

}

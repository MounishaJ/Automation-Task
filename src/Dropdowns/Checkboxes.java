package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException
	
	{	
		
		/* 5-8-2019*/
			
			System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://book.spicejet.com/");
	        
			
			int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
			System.out.println(count); //print howmany check boxes are there
			
			System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
			for(int i=0;i<count;i++) {
	        driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
	        Thread.sleep(2000);
	    	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).get(i).isSelected());
			}
		}

	}



package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {
	public static void main(String []arg) throws InterruptedException 
	{
		// TODO Auto-generated method stub
       /*Radio buttons
        * IRCTC,https://www.cleartrip.com/
        * 5-7-2019
        * 
        * 
        */
	
	
	System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com");
	
	//Finding how many radio button are there by using group name - static approach
	System.out.println(driver.findElements(By.xpath("//input[@class='tripType']")).size());
	
	
	//Select multi-city radio button-last option
	driver.findElement(By.id("MultiCity")).click();
	Thread.sleep(2000);
	
	
	// print radio button values name="trip_type"
	System.out.println("get radio button size");
	int count= driver.findElements(By.xpath("//input[@class='tripType']")).size();
	
	
	System.out.println("go and click radio button one by one ");
	for(int i=0;i<count;i++)
	{
	driver.findElements(By.xpath("//input[@class='tripType']")).get(i).click();
	Thread.sleep(2000);
	}
	
	
	
	// 5-8-2019
	//print radio button names in console
	System.out.println("get and take radio button name and print cosole");
	for(int i=0;i<count;i++)
	{
		System.out.println(driver.findElements(By.xpath("//input[@class='tripType']")).get(i).getAttribute("value"));
	}
		
	
	
	// How to find if the radio button name is multicity then go and click that button
	System.out.println("get and identify if button name is multicity then click ");
	for(int i=0;i<count;i++)
	{
		String text=driver.findElements(By.xpath("//input[@class='tripType']")).get(i).getAttribute("value");
		if(text.equals("OneWay"))
		{
			driver.findElements(By.xpath(" //input[@class='tripType']")).get(i).click();
			}
	}
	
	}
}

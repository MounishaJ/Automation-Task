package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skyhopaddshift {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// 23/5/2019
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://qa-new.skyhop.io/site/sessions");
		
//login credentials
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("skyhopglobal");
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys("accounting");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		
		driver.get("https://qa-new.skyhop.io/site/sessions");
		Thread.sleep(3000);
	
		driver.findElement(By.cssSelector("[class='widget-buttons'] [data-slidepanel='panel']")).click();
		Thread.sleep(3000);
//select city from dropdown
	
		Select city=new Select(driver.findElement(By.id("city")));
		city.selectByIndex(2);
	
		driver.findElement(By.id("sessionname")).sendKeys("Rotational");
	
		driver.findElement(By.id("starttime")).click();
		starttime("10","55");
		driver.findElement(By.id("endtime")).click();
		starttime("23","52");
		driver.findElement(By.id("status")).click();
	}
	
	

	public static void starttime(String h1,String m1) throws InterruptedException 
	{
//select starting time hours
				
		int hours= driver.findElements(By.xpath("//td[@class='ui-timepicker-hour-cell']")).size();
		//System.out.println(hours);	
			
		for(int i=0;i<hours;i++)
		 {
		String text= driver.findElements(By.xpath("//td[@class='ui-timepicker-hour-cell']")).get(i).getText();
		//System.out.println(text);
		if(text.equalsIgnoreCase(h1))
		{
		driver.findElements(By.xpath("//td[@class='ui-timepicker-hour-cell']")).get(i).click();
		}
		  }	
//select minutes
			 
		int minutes=driver.findElements(By.xpath("//td[@class='ui-timepicker-minute-cell']")).size();
			 //System.out.println(minutes);
		 for(int i=0;i<minutes;i++)
		 {
		String text= driver.findElements(By.xpath("//td[@class='ui-timepicker-minute-cell']")).get(i).getText();
		//System.out.println(text);
		if(text.equalsIgnoreCase(m1))
		{
		driver.findElements(By.xpath("//td[@class='ui-timepicker-minute-cell']")).get(i).click();
		}
		 }	
	}		 
	
}	


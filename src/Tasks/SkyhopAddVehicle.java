package Tasks;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SkyhopAddVehicle {

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
		
		driver.get("https://qa-new.skyhop.io/site/vehicle");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("[class='widget-buttons'] [data-slidepanel='panel']")).click();
		Thread.sleep(3000);
	
		
//vehicle items
		
		driver.findElement(By.id("v_in")).sendKeys("2128212821");
		driver.findElement(By.id("v_phone")).sendKeys("8749040360");
		driver.findElement(By.id("v_make")).sendKeys("vehicle21");
		driver.findElement(By.id("v_m_name")).sendKeys("model212");
//select Vehicle Model year		
		Select modelyear=new Select(driver.findElement(By.id("v_m_year")));
		modelyear.selectByVisibleText("2017");
		
		driver.findElement(By.id("v_capacity")).sendKeys("2000");
//select State
		Select state=new Select(driver.findElement(By.id("v_s_reg")));
		state.selectByVisibleText("Pennsylvania");
		
//scroll the page
		scroll("v_l_expiry");
		
//selectAirport
		String[] str= {"dal","bna"};
	    for (int i = 0; i < str.length; i++) 
	    {
//	    	System.out.println("array " + str[i]);
	    	selectAirport(str[i]);
		} 
				
		
		 
		
		
		/*
		driver.findElement(By.id("v_l_plate")).sendKeys("AP21w28");
//expiry date		
		
		driver.findElement(By.id("v_l_expiry")).click();
		date("December","22");
		
		Select epermit=new Select(driver.findElement(By.id("v_e_permit")));
		epermit.selectByValue("1");
		
//Emission permit date
		driver.findElement(By.id("v_ep_expiry")).click();
		date("May","31");
		
		scroll("v_tracker");
				
		Select apermit=new Select(driver.findElement(By.id("v_a_permit")));
		apermit.selectByIndex(1);
		
//Airport expiry date
		driver.findElement(By.id("v_ap_expiry")).click();
		date("November", "12");
		
		driver.findElement(By.id("v_tt")).sendKeys("tag21");
		
		driver.findElement(By.id("v_tid")).sendKeys("tag2128ID");
//vehicle tracker
		Select track=new Select(driver.findElement(By.id("v_tracker")));
		track.selectByValue("GPS");
	*/	
	}
	
	public static void selectAirport(String str)
	{
	driver.findElement(By.xpath("//div[@class='btn-group']")).click();
	int size=driver.findElements(By.xpath("//label[@class='checkbox']")).size();
	System.out.println(size);
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(str);
	System.out.println(str);
//size
	
	for(int i=0;i<size;i++)
	{
		String text=driver.findElements(By.xpath("//label[@class='checkbox']")).get(i).getText();
		System.out.println(text);
		if(text.contains(str))
		{
			driver.findElements(By.xpath("//label[@class='checkbox']")).get(i).click();
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.CONTROL +"a",Keys.DELETE);
			driver.findElement(By.xpath("//div[@class='btn-group']")).click();
		}
	}
}
	
	
	public static void scroll(String id) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element;
		 element = driver.findElement(By.id(id));
		 // now execute query which actually will scroll until that element is not appeared on page.
		 
		je.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
		
	public static void date(String month,String day) 
	{

		//select month		
				while(!driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().contains(month))
				{
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
				
		//select date		
				
				//td[@data-handler='selectDay']
				
				int daycount=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
				System.out.println(daycount);
				
				for(int i=0;i<daycount;i++)
				{
				String text=driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).getText();
				System.out.println(text);
				
				if(text.equalsIgnoreCase(day))
				{
					driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
					break;
				}
				}
				
	}
}













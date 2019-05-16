package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	
	public static void main(String []arg) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		Select s=new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");
	
		Select s1=new Select(driver.findElement(By.id("Childrens")));
		s1.selectByIndex(1);
		
		Select s2=new Select(driver.findElement(By.id("Infants")));
		s2.selectByValue("1");
	
	
	driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
	
//	driver.findElement(By.xpath("//i[@class='blue rArrow']")).click();
	driver.findElement(By.id("MoreOptionsLink")).click();
	Select s3=new Select(driver.findElement(By.id("Class")));
	s3.selectByVisibleText("Business");
	driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo Airlines");
	
	
	driver.findElement(By.id("SearchBtn")).click();
	
	
	//grab the error and print in console
	System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	
	
	
	/*
	 * Instructor example
			Rahul Shetty
			
			Complete the Assignment and Post the code here
			
			import org.openqa.selenium.By;
			import org.openqa.selenium.Keys;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
			import org.openqa.selenium.chrome.ChromeDriver;
			import org.openqa.selenium.support.ui.Select;
		 
		 	public class Assignment {
			public static void main(String[] args) 
			{
								
			System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			
			driver.get("http://www.cleartrip.com/");
			
			//calendar
			
			driver.findElement(By.id("DepartDate")).click();
			
			
			driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
			
			//DD1
			
			WebElement adult=driver.findElement(By.id("Adults"));
			
			
			Select s =new Select(adult);
			
			
			s.selectByIndex(2);
			
			//DD2
			
			
			WebElement ch=driver.findElement(By.id("Childrens"));
			
			
			Select s1 =new Select(ch);
			
			
			s1.selectByIndex(2);
			
			
			driver.findElement(By.xpath("//a[@title='More search options']")).click();
			
			
			driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
			
			
			driver.findElement(By.id("SearchBtn")).click();
			
			//validate error message
			
			System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
			
			
			}
			
			
			}
				 */
				
	
	
	
	}

}

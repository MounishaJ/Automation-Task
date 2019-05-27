package Tasks;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterFormDemoSite {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// 24/5/2019
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mounisha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jeela");
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("gfjgfjhjfg htfhdfgdf5476n Jeela");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mounisha2893@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8749040360");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
//check box
		//
		int size= driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		//System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String text = driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("value");
			//System.out.println(text);
			if(text.equalsIgnoreCase("movies"))
			{
				 driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			}
		}
		
//languages	
		driver.findElement(By.id("msdd")).click();
		int count=driver.findElements(By.xpath("//a[@class='ui-corner-all']")).size();
		for(int i=0;i<count;i++)
		{
			String text = driver.findElements(By.xpath("//a[@class='ui-corner-all']")).get(i).getText();
			//System.out.println(text);
			if(text.equalsIgnoreCase("english"))
			{
				 driver.findElements(By.xpath("//a[@class='ui-corner-all']")).get(i).click();
				 driver.findElement(By.xpath("//div[@class='row ']")).click();
			}
		}
		
//  scroll upto end 
	scroll(driver.findElement(By.id("submitbtn")));	

//select Skills
	Select skills=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
	skills.selectByValue("Java");
	
//select country
	Select country=new Select(driver.findElement(By.id("countries")));
	country.selectByVisibleText("India");
/*	
//select Country
	driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	*/
	
	driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
	int countrycount=driver.findElements(By.xpath("//li[@class='select2-results__option']")).size();
	System.out.println("Size : "+countrycount);

	for(int i=0;i<countrycount;i++)
	{
		String text = driver.findElements(By.xpath("//li[@class='select2-results__option']")).get(i).getText();
		System.out.println(text + "index" + i);
		
		
		if(text.equalsIgnoreCase("India"))
		{
				// run it
				 //driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);	 
			
			driver.findElements(By.xpath("//li[@class='select2-results__option']")).get(i).click();
			//System.out.println(m);
			 //driver.findElement(By.xpath("//div[@class='row ']")).click();
			break;
		}
	}

		
//select Year
	Select s=new Select(driver.findElement(By.id("yearbox")));
	s.selectByValue("1994");
	Select month=new Select(driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")));
	month.selectByVisibleText("April");
	Select day=new Select(driver.findElement(By.id("daybox")));
	day.selectByValue("21");
	
//select password
	driver.findElement(By.id("firstpassword")).sendKeys("mounisha2128");
	driver.findElement(By.id("secondpassword")).sendKeys("mounisha2128");
	
	
	}
	
	
		public static void scroll(WebElement element) 
		{
			JavascriptExecutor je = (JavascriptExecutor) driver;
			// now execute query which actually will scroll until that element is not appeared on page.
			je.executeScript("arguments[0].scrollIntoView(true);",element);
		}

}

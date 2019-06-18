package DateExcercises;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IxigoFlightsdate {

	public static void main(String[] args) throws InterruptedException {
		// 18/6/2019

				System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get(" https://www.makemytrip.com/flights/");
				//url  https://www.makemytrip.com/flights/   "https://www.ixigo.com/flights"
				
			//select from place
				WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
				from.sendKeys("che");
				Thread.sleep(2000);
			from.sendKeys(Keys.ARROW_DOWN);
				from.sendKeys(Keys.ENTER);
			
			//select to place
				WebElement to=driver.findElement(By.xpath("//input[@placeholder='To']"));
				to.sendKeys("mum");
				Thread.sleep(2000);
				to.sendKeys(Keys.ARROW_DOWN);
				to.sendKeys(Keys.ENTER);
				
				
				
			//select month 
			  
				//driver.findElement(By.xpath("(//input[@class='inputSrch curPointFlt '])[1]")).click();
				while(!driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText().contains("December"))
				{
					driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				}
				
				//select date
				//driver.findElement(By.id("fare_20191205")).click();
					
			//hit search icon
				//driver.findElement(By.id("gi_search_btn")).click();
				
				int count=driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).size();
				System.out.println(count);
				
				for(int i=0;i<count;i++)
				{
				String text=driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).getText();
				
				System.out.println(text);
				if(text.startsWith("2"))
				{
					driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).click();
					break;
				}
			}

			}
	

	}



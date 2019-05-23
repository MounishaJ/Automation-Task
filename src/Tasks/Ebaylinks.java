package Tasks;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebaylinks {

	public static void main(String[] args) throws Exception 
	{
		// 5/21/2019
		
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//total link count for entire webpage
		driver.get("https://in.ebay.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//footer total link count
		
		WebElement footerdriver=driver.findElement(By.xpath("//*[@id='gf-BIG']"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		WebElement footerrow=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(footerrow.findElements(By.tagName("a")).size());
	
		
		
		//7 links open in new tab
		for(int i=1;i<footerrow.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerrow.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(2000);
		}
		
		
		//move one by onelink and print title of the page
		Set<String> abc=driver.getWindowHandles();//7 windows
		Iterator<String> it=abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	/*	
		String Beforeclicking = null;
		String Afterclicking;
		for(int i=1;i<footerrow.findElements(By.tagName("a")).size();i++)
		{
		
			
			if(footerrow.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				Beforeclicking = driver.getTitle();
			
				footerdriver.findElements(By.tagName("a")).get(i).click();
				break;
				}
		}
		Afterclicking =driver.getTitle();
		if(Beforeclicking!=Afterclicking)
		{
			if(driver.getPageSource().contains("sitemap"))
		
				System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		} */
			
	}
		      
		
	
	}

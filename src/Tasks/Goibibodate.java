package Tasks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibodate {

	public static void main(String[] args) throws InterruptedException {
		
		// 22/5/2019
				
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		
	//select from place
		WebElement from=driver.findElement(By.id("gosuggest_inputSrc"));
		from.sendKeys("che");
		Thread.sleep(2000);
	    from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
	
	//select to place
		WebElement to=driver.findElement(By.id("gosuggest_inputDest"));
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
			
		
		int count=driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).getAttribute("aria-label");
		//System.out.println(text);
		
	
		String[] splitStr = text.split("\\s+");	
		System.out.println(splitStr[2]);

		
		
		if(splitStr[2].contains("5"))
			{
				driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).click();
				break;
			}
		}
		
		
		
		
/*Note:
	Make it as simple steps and reduce the code length
	Use effective way to achieve the solutions		
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//hit search icon
				//driver.findElement(By.id("gi_search_btn")).click();
			
	}


	}

/*String m=driver.findElements(By.xpath("//span[@class='ico8 db padT2 blue']")).get(i).getText();
System.out.println(m);

String d=text.replace(m,"");
System.out.println(d);*/
//span[@class='ico8 db padT2 blue'] == price xapth only

/*	Map<String,String> map = new HashMap<String,String>();
map.put(text,text);
*/	


/*String[] parts = text.split(" ");
String part1[] = parts[i]; // 900.9
System.out.println(part1);
String part2[] = parts[i]; // 6.00%
System.out.println(part2);
*/
/*List<WebElement> allTime = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));

dateTime = dateTime.split(" ")[1]+" "+dateTime.split(" ")[2];

//select correct time

for (WebElement webElement : allTime) {

    if(webElement.getText().equalsIgnoreCase(dateTime))

    {

        webElement.click();

    }
*/

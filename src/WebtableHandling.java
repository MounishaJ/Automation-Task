import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling {
static WebDriver driver;
	public static void main(String[] args) {
		// 27/5/2019
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22420/irew-vs-wiw-1st-t20i-west-indies-women-tour-of-ireland-2019");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
//	System.out.println(rowcount);
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(7)")).size();
//		System.out.println(count);	
		for(int i=0;i<count;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(7)")).get(i).getText());
		}

	}

}

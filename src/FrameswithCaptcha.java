import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameswithCaptcha {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// 27/5/2019
		
		
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://codecanyon.net/sign_up");
		
		driver.findElement(By.id("sso_sign_up_form_first_name")).sendKeys("mounisha");
		driver.findElement(By.id("sso_sign_up_form_last_name")).sendKeys("2128");
		driver.findElement(By.id("sso_sign_up_form_email")).sendKeys("mounisha.resileo@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("sso_sign_up_form_privacy_agreement")).click();
		driver.findElement(By.id("sso_sign_up_form_terms_agreement")).click();
		driver.findElement(By.xpath("//a[@class='js-sign-up__goto-step2 e-btn--3d -color-primary -size-m -width-full h-my2']")).click();
		
		int num=SwitchToFrame(driver,By.xpath("//span[@role='checkbox']"));
		driver.switchTo().frame(num);
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		driver.switchTo().defaultContent();
		
		int num1=SwitchToFrame(driver,By.xpath("//span[@role='checkbox']"));
		driver.switchTo().frame(num1);
		driver.findElement(By.xpath("//span[@role='checkbox']")).click();
		driver.switchTo().defaultContent();
		
		
//second step
		
		
		
		

	}

	public static int SwitchToFrame(WebDriver driver,By by)
	{
		int i;
		int tagcount=driver.findElements(By.tagName("iframe")).size();
		System.out.println(tagcount);
		for( i=0;i<tagcount;i++)
		{
			driver.switchTo().frame(i);
			int framecount=driver.findElements(by).size();
			System.out.println(framecount);
			if(framecount>0)
			{
				driver.findElement(by).click();
				break;
			}
			else
			{
				System.out.println("continue looping");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}
}

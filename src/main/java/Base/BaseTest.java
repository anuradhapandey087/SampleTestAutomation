package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void initialization()
	{
		String driverPath="C:\\Users\\ANKIT\\Desktop\\WebDriver\\chromedriver_v83.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.automationpractice.com");
		
		
		
		
		
	}

}

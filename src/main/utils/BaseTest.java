package main.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

	public static WebDriver driver = null;
	public BaseTest()
	{
		if(driver == null)
		{
			String exePath = "src\\main\\selenium\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("**Chrome driver initiated**");
		}
		else
		{
			System.out.println("**Chrome driver already instantiated**");
		}
	}
	public static WebDriver getdriver()
	{
		if (driver == null){
			return driver;
		}else{
			return driver;
		}
	}


	@AfterTest()
	public static void closeBrowser(){
		driver.quit();
	}

}

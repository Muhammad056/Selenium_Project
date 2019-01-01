package SeleniumLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	static WebDriver driver; 
	
	public WebDriver  initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Aqib\\Desktop\\Selenium_project\\myMavenProject\\src\\main\\java\\SeleniumLearning\\data.Properties");
		
		prop.load(fis);
		String browerName=prop.getProperty("browser");
		
		if (browerName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqib\\Desktop\\Selenium Lib\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browerName == "firfox")
		{
			
		}
		else if (browerName == "IE")
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	
	}

}

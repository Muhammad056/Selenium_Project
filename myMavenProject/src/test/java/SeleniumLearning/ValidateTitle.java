package SeleniumLearning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class ValidateTitle extends base {
	
	@BeforeTest()
	public void intializaDriver() throws IOException {
		driver=initializeDriver(); 
		driver.get("https://www.facebook.com/");
	}
	
	@Test()
	public void basePageNavigtion() throws IOException, InterruptedException
	{
		LandingPage login= new LandingPage(driver);
		Assert.assertEquals(login.getTtile().getText(), "Sign Up");
		driver.quit();
		
	}
	@AfterTest()
	public void teardown()
	{
		driver.quit();
	}

}

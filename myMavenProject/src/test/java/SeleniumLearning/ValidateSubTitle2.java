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

public class ValidateSubTitle2 extends base {

	@BeforeTest()
	public void intializaDriver() throws IOException {
		driver=initializeDriver(); 
		driver.get(prop.getProperty("url"));
	}
	
	@Test()
	public void basePageNavigtion2() throws IOException, InterruptedException
	{
		LandingPage login= new LandingPage(driver);
		Assert.assertTrue(login.getSubTitle().isDisplayed());
		// pass workv
		
	}
	
	@AfterTest()
	public void teardown()
	{
		driver.quit();
	}
	

}

package SeleniumLearning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class ValidateSubTitle2 extends base {

	
	@Test()
	public void basePageNavigtion() throws IOException, InterruptedException
	{
		driver=initializeDriver(); 
		driver.get("https://www.facebook.com/");
		LandingPage login= new LandingPage(driver);
		Assert.assertTrue(login.getSubTitle().isDisplayed());
		driver.quit();
		
	}
	

}

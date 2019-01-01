package SeleniumLearning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class ValidateTitle extends base {

	
	@Test()
	public void basePageNavigtion() throws IOException, InterruptedException
	{
		driver=initializeDriver(); 
		driver.get("https://www.facebook.com/");
		LandingPage login= new LandingPage(driver);
		Assert.assertEquals(login.getTtile().getText(), "Sign Up0");
		driver.quit();
		
	}
	

}

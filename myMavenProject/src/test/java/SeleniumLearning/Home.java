package SeleniumLearning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class Home extends base {

	
	@Test(dataProvider ="getData")
	public void basePageNavigtion(String username, String password, String text) throws IOException, InterruptedException
	{
		driver=initializeDriver(); 
		driver.get("https://www.facebook.com/");
		LandingPage login= new LandingPage(driver);
		login.getLogin().sendKeys("aqib ");
		LoginPage Enter = new LoginPage(driver);
		LoginPage click = new LoginPage(driver);
		Enter.getEmail().sendKeys(username);
		Enter.getPassword().sendKeys(password);
		Thread.sleep(1000);
		click.loginButton().click();
		
		System.out.println(text);
		driver.quit();
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[6][3];
		
		data[0][0]="aqib002@gmail.com";
		data[0][1]="passowrd";
		data[0][2]="first Run";
//		
//		
		data[1][0]="hussan005@gmail.com";
		data[1][1]="gamer";
		data[1][2]="second Run";
		
		data[2][0]="hussan005@gmail.com";
		data[2][1]="gamer";
		data[1][2]="Third Run";

		data[2][0]="hussan005@gmail.com";
		data[2][1]="gamer";
		data[2][2]="Third Run";

		data[3][0]="hussan005@gmail.com";
		data[3][1]="gamer";
		data[3][2]="Third Run";

		data[4][0]="hussan005@gmail.com";
		data[4][1]="gamer";
		data[4][2]="Third Run";

		data[5][0]="hussan005@gmail.com";
		data[5][1]="gamer";
		data[5][2]="Third Run";
		
		return data;
	}
}

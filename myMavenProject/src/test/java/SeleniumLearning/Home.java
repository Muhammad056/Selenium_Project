package SeleniumLearning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;

public class Home extends base {
	
	@BeforeTest()
	public void intializaDriver() throws IOException {
		driver=initializeDriver(); 
	}
	
	@Test(dataProvider ="getData")
	public void basePageNavigtion(String username, String password, String text) throws IOException, InterruptedException
	{
		  WebDriverWait wait = new WebDriverWait(driver,45);
		driver.get("https://www.facebook.com/");
		LandingPage login= new LandingPage(driver);
		login.getLogin().sendKeys("aqib ");
		LoginPage Enter = new LoginPage(driver);
		LoginPage click = new LoginPage(driver);
		
		Enter.getEmail().sendKeys(username);
		Enter.getPassword().sendKeys(password);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_0_2")));
		click.loginButton().click();
		
		System.out.println(text);
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[15][3];
		
		data[0][0]="aqib002@gmail.com";
		data[0][1]="passowrd";
		data[0][2]="first Run";
	
		data[1][0]="hussan005@gmail.com";
		data[1][1]="gamer";
		data[1][2]="second Run";
		
		data[2][0]="hussan005@gmail.com";
		data[2][1]="gamer";
		data[2][2]="Third Run";
//
		data[3][0]="hussan005@gmail.com";
		data[3][1]="gamer";
		data[3][2]="Third Run";

		data[4][0]="hussan005@gmail.com";
		data[4][1]="gamer";
		data[4][2]="Third Run";
//
		data[5][0]="hussan005@gmail.com";
		data[5][1]="gamer";
		data[5][2]="Third Run";
//
		data[6][0]="hussan005@gmail.com";
		data[6][1]="gamer";
		data[6][2]="Third Run";
//		
		data[7][0]="hussan005@gmail.com";
		data[7][1]="gamer";
		data[7][2]="Third Run";
//		
		data[8][0]="hussan005@gmail.com";
		data[8][1]="gamer";
		data[8][2]="Third Run";
		
		data[9][0]="hussan005@gmail.com";
		data[9][1]="gamer";
		data[9][2]="Third Run";
		
		data[10][0]="hussan005@gmail.com";
		data[10][1]="gamer";
		data[10][2]="Third Run";
		
		data[11][0]="hussan005@gmail.com";
		data[11][1]="gamer";
		data[11][2]="Third Run";
		
		
		data[12][0]="hussan005@gmail.com";
		data[12][1]="gamer";
		data[12][2]="Third Run";
		
		data[13][0]="hussan005@gmail.com";
		data[13][1]="gamer";
		data[13][2]="Third Run";
		
		
		data[14][0]="hussan005@gmail.com";
		data[14][1]="gamer";
		data[14][2]="Third Run";
		
		
		return data;
	}
	
	@AfterTest()
	public void teardown()
	{
		driver.quit();
	}
}

package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signUp=By.id("u_0_u");
	By Title=By.xpath("//h2[@class='mbs _3ma _6n _6s _6v']");
	// test

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver; // new braches aqib test
	}


// test

	public WebElement getLogin()
	{
		return driver.findElement(signUp);
		
	}
	public WebElement getTtile()
	{
		return driver.findElement(Title);
		
	}
}

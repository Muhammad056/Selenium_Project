package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signUp=By.id("u_0_u");
	By Title=By.xpath("//h2[@class='mbs _3ma _6n _6s _6v']");
	By SubTitle = By.xpath("//div[@class='mbl _3m9 _6o _6s _mf']");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver; 
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
	public WebElement getSubTitle()
	{
		return driver.findElement(SubTitle);
		
	}
}

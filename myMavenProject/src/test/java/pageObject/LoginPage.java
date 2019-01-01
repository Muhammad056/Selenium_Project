package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By Email=By.id("email");
	By password=By.id("pass");
	By login=By.id("u_0_2");
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}




	public WebElement getEmail()
	{
		return driver.findElement(Email);
		
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	public WebElement loginButton()
	{
		return driver.findElement(login);
		
	}
}

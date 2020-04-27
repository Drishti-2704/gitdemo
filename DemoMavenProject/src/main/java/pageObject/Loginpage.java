package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;
	private By emailid=By.xpath("//*[@id='user_email']");
	private By password=By.xpath("//*[@id='user_password']");
	private By login=By.xpath("//input[@value='Log In']");
	
	
	
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	
	public WebElement emailid()
	{
		return driver.findElement(emailid);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	
}


package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LandingPage {

	
	public WebDriver driver;
	
	private By signin=By.xpath("//*[@href='http://qaclickacademy.usefedora.com/sign_in']/span[text()='Login']");
	private By title=By.cssSelector(".text-center>h2");
	private By nav=By.xpath("//ul[@class='nav navbar-nav navbar-right']/li/a");
	private By popup=By.xpath("//button[text()='NO THANKS']");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}




	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}

	public WebElement getPopup()
	{
		return driver.findElement(popup);
	}
	public int getpopupSize()
	{
		return driver.findElements(popup).size();
	}
	



	public WebElement getTitle() {
		// TODO Auto-generated method stub
		return driver.findElement(title);
	}
	
	public WebElement getNav() {
		// TODO Auto-generated method stub
		return driver.findElement(nav);
	}
	
}

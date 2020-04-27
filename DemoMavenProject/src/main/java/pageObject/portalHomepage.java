package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomepage {
public WebDriver driver;

public portalHomepage(WebDriver driver)
{
	this.driver=driver;
}
private By search=By.xpath("//input[@id='search-courses']");

public WebElement searchBy()
{
	return driver.findElement(search);
}
}

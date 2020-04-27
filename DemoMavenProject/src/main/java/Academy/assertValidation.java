package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.Base;

public class assertValidation extends Base {
	@BeforeTest
	public void openbrowser() throws IOException
	{
		driver=IntializeBrowser();
		driver.get(p.getProperty("url"));
	}
	@Test
	public void basePageNavigation()
	{
		
		LandingPage l=new LandingPage(driver);
		//Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");
		Assert.assertTrue(l.getNav().isDisplayed());
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}
}

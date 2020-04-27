package StepDefination;


import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.Loginpage;
import pageObject.portalHomepage;
import resources.Base;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {

	@Given("^Intialize the browser with chrome$")
	public void intialize_the_browser_with_chrome() throws IOException  {
		 driver=IntializeBrowser();
	}

	@And("^Navigate to \"(.*?)\" site$")
	public void navigate_to_site(String arg1)  {
		driver.get(arg1);
	    
	}

	@And("^click on Login Link on Homepage to land on Secure Sign Page$")
	public void click_on_Login_Link_on_Homepage_to_land_on_Secure_Sign_Page() throws Throwable {
		LandingPage lp=new LandingPage(driver);
		if(lp.getpopupSize()>0)
		{
			lp.getPopup().click();
		}
		lp.getLogin().click();
	}
	@And("^when user enters (.+) and (.+) and logs in$")
    public void when_user_enters_and_and_logs_in(String username, String password) throws Throwable {
		Loginpage lp1=new Loginpage(driver);
		lp1.emailid().sendKeys(username);
		lp1.password().sendKeys(password);
		lp1.getLogin().click();
    }
	

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		portalHomepage p=new portalHomepage(driver);
		Assert.assertTrue(p.searchBy().isDisplayed());
	}
	@And("^close the browser$")
	public void close_the_browser() throws Throwable {
	    driver.quit();
	}



}
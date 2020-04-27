package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.Loginpage;
import resources.Base;


public class Homepage extends Base {
	
	  @BeforeTest public void openbrowser() throws IOException {
		  driver=IntializeBrowser();
	  }
	 
@Test(dataProvider="getData")
public void basePageNavigation(String username,String password) throws IOException
{
	
	driver.get(p.getProperty("url"));
	
	LandingPage lp=new LandingPage(driver);
	lp.getLogin().click();
	Loginpage lp1=new Loginpage(driver);
	lp1.emailid().sendKeys(username);
	lp1.password().sendKeys(password);
	lp1.getLogin().click();
	
	
}
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[2][2];
	data[0][0]="drishtisahu95@gmail.com";
	data[0][1]="145869";
	
		
		
		 data[1][0]="sdrishti945@gmail.com"; 
		data[1][1]="123456";
		 
		 
	return data;
}



	
	 @AfterTest public void tearDown() { driver.close(); driver=null; }
	 
}

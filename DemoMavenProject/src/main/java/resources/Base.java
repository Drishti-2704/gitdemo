package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;
	public Properties p;
	public WebDriver IntializeBrowser() throws IOException
	{
	
	p=new Properties();
	//C:\\Users\\Dell\\eclipse-workspace\\E2EProject
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	p.load(fis);
	String browser=p.getProperty("browser");
	 
	 
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browser.equals("IE"))
	{
		driver=new InternetExplorerDriver();
		
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
}
	
	/*
	 * public void takeScreenshot(String result) throws IOException {
	 * TakesScreenshot srcshot=(TakesScreenshot)driver; File
	 * src=srcshot.getScreenshotAs(OutputType.FILE); File des=new
	 * File("D:\\selenium\\test\\"+result+"screenshot.png"); FileUtils.copyFile(src,
	 * des);
	 * 
	 * 
	 * }
	 */
}

package Academy;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class Listener implements ITestListener{
	Base b=new Base();
	

	public void onTestFailure(ITestResult result) {
		try {
			//b.takeScreenshot(result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
		
	}


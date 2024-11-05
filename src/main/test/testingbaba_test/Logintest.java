package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbab_pages.Loginpage; 
 
public class Logintest extends BaseLibrary {
	
	Loginpage ob;
	@BeforeTest
	public void getLunchUrl_testingbaba()
	{
		getLaunchUrl("https://testingbaba.com/old/");
		ob = new Loginpage();
	}
	
	@Test(priority=1)
	public void getTitle_testingbaba()
	{
		ob.getTitle();
	}
}

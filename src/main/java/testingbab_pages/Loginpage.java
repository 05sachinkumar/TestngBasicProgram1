package testingbab_pages;

import baselibrary.BaseLibrary;

public class Loginpage extends BaseLibrary{
	
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println("testingbaba title is:"+title);
	}
}

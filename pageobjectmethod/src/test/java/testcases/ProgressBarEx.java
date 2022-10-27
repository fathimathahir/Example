package testcases;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.ProgressBarPage;

public class ProgressBarEx extends BaseClass {
	ProgressBarPage progressbarpage;
	@Test
	public void verifytextofsubmit() {
		ProgressBarPage progressbarpage=new ProgressBarPage(driver);
				progressbarpage.clickprogressbar();
				progressbarpage.textofstartbutton();
				System.out.println("Actual text:"+progressbarpage.textofstartbutton());
			String	expectedtext="Start Download";
			String actualtext=progressbarpage.textofstartbutton();
			assertEquals(expectedtext, actualtext);
				
	}
	
}

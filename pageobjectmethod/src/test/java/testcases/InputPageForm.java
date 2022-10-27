package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.InputFormPage;

public class InputPageForm extends BaseClass{
	InputFormPage inputFormPage;

	@Test
	public void verifyshowmessagetext()
	{
		inputFormPage=new InputFormPage(driver);
		inputFormPage.clickinputformbutton();
		String expectedresult="Show Message";
		String actualresult=inputFormPage.clickshowmessagebutton();
		System.out.println("the text:"+actualresult);
		assertEquals(expectedresult, actualresult);
	}
	@Test
	public void verifysubmitform()
	{
		inputFormPage=new InputFormPage(driver);
		inputFormPage.clickinputformbutton();
		inputFormPage.clicksubmitform();
		
	}
}

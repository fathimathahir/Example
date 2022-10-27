package testcases;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass {

	@Test
	public void verifyHomePage_logo() {
		
		HomePage homePage=new HomePage(driver);
		homePage.get_title();
		
		homePage.isLogoisDisplayed();
		String path=System.getProperty("user.dir");
        System.out.println(path);

	}
}

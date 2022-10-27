package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypackage.UtilityExample;

public class ProgressBarPage {
 WebDriver driver;
	@FindBy (xpath ="//a[@href='jquery-progress-bar.php']")
	WebElement progresbarlink;
	@FindBy(xpath = "//button[text()='Start Download']") 
	WebElement startbutton;
	
	public ProgressBarPage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickprogressbar()
	{
		progresbarlink.click();
	}
	public String textofstartbutton()
	{
		UtilityExample utilityexample=new UtilityExample(driver);
		return utilityexample.getTextofElement(startbutton);
		
	}
	
}

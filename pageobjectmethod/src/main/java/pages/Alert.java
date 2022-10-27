package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilitypackage.UtilityExample;

public class Alert {

	WebDriver driver;
	@FindBy (xpath = "//a[@href='bootstrap-alert.php']")
	WebElement alertandmodalslink;
	@FindBy (xpath = "//button[@id='autoclosable-btn-success']")
	WebElement autoclosablebutton;
	@FindBy (xpath = "//div[@class='alert alert-success alert-autoclosable-success']")
	WebElement alert1;
	
	public Alert(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void click_alert()
	{
		 alertandmodalslink.click();
	}
	public String autoclosealert()
	{
		
		UtilityExample utilityexample=new UtilityExample(driver);
		return utilityexample.getTextofElement(autoclosablebutton);
		
	}
	public String click_autoclosablebutton()
	{
		autoclosablebutton.click();
		UtilityExample utilityexample=new UtilityExample(driver);
		return utilityexample.getTextofElement(alert1);
		
	}
}

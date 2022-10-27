package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	WebDriver driver;
	By inputform=By .xpath("//a[@href='simple-form-demo.php']");
	By showmessage=By .xpath("//button[@id='button-one']");
	By submitform=By.xpath("//a[@href='form-submit.php']");
	By firstname=By.xpath("//input[@id='validationCustom01']");
	public void clickinputformbutton()
	{
		WebElement inputformElement=driver.findElement(inputform);
		inputformElement.click();
	}
	public String clickshowmessagebutton()
	{
		WebElement showmessageElement=driver.findElement(showmessage);
		return showmessageElement.getText();
	}
	public void clicksubmitform()
	{
		WebElement submitformElement=driver.findElement(submitform);
		submitformElement.click();
		WebElement firstnameElement=driver.findElement(firstname);
		firstnameElement.sendKeys("fathi");
	}
	public InputFormPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
}

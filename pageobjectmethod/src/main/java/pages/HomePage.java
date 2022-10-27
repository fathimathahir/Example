package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.This;

public class HomePage {


		WebDriver driver;
		By logoIm=By .xpath("//div[@class='top-logo']//img[@src='images/logo.png']");
		
		public void isLogoisDisplayed() {
			WebElement logoElement=driver.findElement(logoIm);
			
			if(logoElement.isDisplayed())
			{
				System.out.println("displayed");
			}else {

				System.out.println("not displayed");
			}
		}
		public void get_title()
		{
			System.out.println("The title:"+driver.getTitle());
		}
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
		
		}
		
	
}

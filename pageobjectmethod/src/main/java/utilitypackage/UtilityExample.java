package utilitypackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityExample {
	WebDriver driver;

	public String getTextofElement(WebElement element) {
		return element.getText();
	}

	public UtilityExample(WebDriver driver) {
		this.driver = driver;
	}
  
	public List<String> get_Textofelements(String xpath) {
		List<WebElement> elements = driver.findElements(By.xpath(xpath));

		List<String> textelement = new ArrayList<String>();
		for (WebElement E : elements) {
			textelement.add(E.getText());
		}
        return textelement;
        
	}
}

package pages;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypackage.UtilityExample;

public class TablePage {
	
	WebDriver driver;
	@FindBy(xpath="//a[@href='table-pagination.php']")
	WebElement TableLink;
	@FindBy(xpath="//tbody//tr[2]//td[1]")
	WebElement TablePersonName;
	
	public TablePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void click_tabletestButton(){
		TableLink.click();
		
		
	}
	
public String getSecondNamePerson() {
	UtilityExample utilityexample=new UtilityExample(driver);
	return utilityexample.getTextofElement(TablePersonName);
} 
public List <String>  printDetails()
{
	List <String> tabledetails=new ArrayList<String>();  
	UtilityExample utilityexample=new UtilityExample(driver);
 tabledetails=	utilityexample.get_Textofelements("//tbody//tr//td[3]");//for another details change xpath
	//System.out.println(tabledetails);
     return tabledetails;
	}
public String personOffice(String name)
{
	List<String> nameList=new ArrayList<String>();  
	UtilityExample utilityexample=new UtilityExample(driver);
	 nameList=	utilityexample.get_Textofelements("//tbody//tr//td[1]");//get one value from list
	 int i;
	 for( i=0;i<nameList.size();i++)
	 {
		 if(name.equals(nameList.get(i))) {
			 i++;
			 break;
		 }
	 }
	 	WebElement officetext=driver.findElement(By.xpath("//tbody//tr["+i+"]//td[3]"));
	 	String officename=officetext.getText();
	 	return officename;
	}
}

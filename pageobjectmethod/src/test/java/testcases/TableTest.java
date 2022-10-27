package testcases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.util.StringList;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass
{
TablePage tablePage;
@Test
public void verifyfistname() {
	tablePage= new TablePage(driver);
	tablePage.click_tabletestButton();
	String expectedresult="Garrett Winters";
	String actualresult=tablePage.getSecondNamePerson();
	System.out.println("second name:"+tablePage.getSecondNamePerson());
	assertEquals(expectedresult,actualresult);
	
}
@Test
public void verifypersonsoffice()
{
	List <String> tabledetails=new ArrayList<String>();
	
	tablePage= new TablePage(driver);
	tablePage.click_tabletestButton();
	tabledetails=tablePage.printDetails();
	System.out.println(tabledetails);
	}
@Test
public void verifypersonoffice()
{
	tablePage= new TablePage(driver);
	tablePage.click_tabletestButton();
	String officename=tablePage.personOffice("Cedric Kelly");
	System.out.println(officename);
	}
}

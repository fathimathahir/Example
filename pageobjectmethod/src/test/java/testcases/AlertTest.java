package testcases;

import org.apache.poi.ss.formula.ptg.GreaterThanPtg;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.Alert;

public class AlertTest extends BaseClass {
  Alert alert;
  @Test
	public void verify_autoclosablesucess() {
	
	Alert alert=new Alert(driver);
			alert.click_alert();
			alert.autoclosealert();
			System.out.println("Text:"+alert.autoclosealert());
			alert.click_autoclosablebutton();
			System.out.println("ALERT:"+alert.click_autoclosablebutton());
  }           
}
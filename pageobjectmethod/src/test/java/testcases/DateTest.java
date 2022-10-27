package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.DatePickersEx;


public class DateTest extends BaseClass {
	DatePickersEx datepickersex;
	@Test
	public void verifycalender() {
		String date="22-08-2021";
		datepickersex= new DatePickersEx(driver);
		datepickersex.clickdatepicker();
		datepickersex.clickenterdate();
		datepickersex.enterdate(date);
	
	}
	
	}
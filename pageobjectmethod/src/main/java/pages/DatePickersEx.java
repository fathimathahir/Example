package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypackage.UtilityExample;

public class DatePickersEx {
	WebDriver driver;
	@FindBy(xpath="//a[@href='date-picker.php']")
	WebElement DatePicker;
	@FindBy(xpath="//input[@id='single-input-field']")
	WebElement EnterDate;
	public DatePickersEx(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickdatepicker(){
		DatePicker.click();
		
		
	}
	public void clickenterdate(){
		 EnterDate.click();
		
		
	}
	public void enterdate(String date){
		 EnterDate.click();
		 String SplitArrayString[]=date.split("-");
		 String year=SplitArrayString[2];
		 String day=SplitArrayString[0];
		 int m=Integer.parseInt(SplitArrayString[1]);
		 String month="";
		 switch(m)
		 {
		 case 1: month="January";
		 break;
		 case 2: month="February";
		 break;
		 case 3: month="March";
		 break;
		 case 4: month="April";
		 break;
		 case 5: month="May ";
		 break;
		 case 6: month="June";
		 break;
		 case 7: month="July";
		 break;
		 case 8: month="August";
		 break;
		 case 9: month="September";
		 break;
		 case 10: month="October";
		 break;
		 case 11: month="November";
		 break;
		 case 12: month="December";
		 break;
		 }
		 System.out.println(month);
		 WebElement previousbutton=driver.findElement(By.xpath("//th[@class='prev']"));
		 WebElement nxtbutton=driver.findElement(By.xpath("//th[@class='next']"));
		 String month_year=month+" "+year;
		 while (true) {
			 String actualMonthYear=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
        if(actualMonthYear.equals(month_year))
        {
        	break;
        }else if(m>10){
        	nxtbutton.click();
        	
		}else {
			previousbutton.click();
		}
			
		}
		 driver.findElement(By.xpath("//td[text()='"+day+"' and @class='day']")).click();

	}
	
}

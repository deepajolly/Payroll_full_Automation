package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateWorker {
WebDriver driver;

@CacheLookup
@FindBy(xpath="//a[@href=\"/payrollapp/worker\" and text()=\"Workers\"]")
WebElement workertab;

@CacheLookup
@FindBy(xpath="//a[@href=\"/payrollapp/worker/create\" and text()=\"Create Worker\"]")
WebElement createworkertab;

@CacheLookup
@FindBy(name="Worker[title]")
WebElement title;

@CacheLookup
@FindBy(name="Worker[first_name]")
WebElement firstname;

@CacheLookup
@FindBy(name="Worker[last_name]")
WebElement lastname;

@CacheLookup
@FindBy(name="Worker[known]")
WebElement known;

@CacheLookup
@FindBy(name="Worker[phone]")
WebElement phone;

@CacheLookup
@FindBy(name="Worker[mobile]")
WebElement mobile;

@CacheLookup
@FindBy(name="Worker[email]")
WebElement email;

@CacheLookup
@FindBy(name="Worker[gender]")
WebElement gender;

@CacheLookup
@FindBy(name="Worker[middle_name]")
WebElement middlename;

@CacheLookup
@FindBy(id="worker-dob")
WebElement DOB;

@CacheLookup
@FindBy(name="Worker[address1]")
WebElement addline1;

@CacheLookup
@FindBy(name="Worker[address2]")
WebElement addline2;

@CacheLookup
@FindBy(name="Worker[address3]")
WebElement addline3;

@CacheLookup
@FindBy(name="Worker[postcode]")
WebElement postcode;

@CacheLookup
@FindBy(name="Worker[branch_id]")
WebElement branch;

@CacheLookup
@FindBy(name="Worker[division_id]")
WebElement division;

@CacheLookup
@FindBy(name="Worker[employment_type]")
WebElement employtype;

@CacheLookup
@FindBy(name="Worker[payslip_method]")
WebElement payslipmethod;

@CacheLookup
@FindBy(name="Worker[engage_status]")
WebElement enagagestatus;

@CacheLookup
@FindBy(name="Worker[ni_number]")
WebElement ninumber;

@CacheLookup
@FindBy(name="Worker[country]")
WebElement country;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\" and text()=\"Next\"]")
WebElement next;

@CacheLookup
@FindBy(name="Worker[payment_method]")
WebElement paymentmethod;

@CacheLookup
@FindBy(name="Worker[ac_type]")
WebElement accountype;

@CacheLookup
@FindBy(name="Worker[ac_name]")
WebElement accountname;

@CacheLookup
@FindBy(name="Worker[ac_no]")
WebElement accountnumber;

@CacheLookup
@FindBy(name="Worker[sort_code]")
WebElement sortcode;

@CacheLookup
@FindBy(name="Worker[start_date]")
WebElement startdate;

@CacheLookup
@FindBy(name="Worker[roll_no]")
WebElement rollnumber;

@CacheLookup
@FindBy(name="Worker[bank_name]")
WebElement bankname;

@CacheLookup
@FindBy(name="Worker[bank_address]")
WebElement bankaddress;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\" and text()=\"Save\"]")
WebElement save;


public void createWorkerPage() throws InterruptedException
{
	workertab.click();
	Thread.sleep(2000);
	
	createworkertab.click();
	Thread.sleep(2000);
	
	Select s1=new Select(title);
	s1.selectByIndex(1);
	Thread.sleep(1000);
	
	firstname.sendKeys("dave");
	Thread.sleep(2000);
	
	lastname.sendKeys("daniel");
	Thread.sleep(2000);
	
	known.sendKeys("dany");
	Thread.sleep(2000);
	
	phone.sendKeys("2417304");
	Thread.sleep(2000);
	
	mobile.sendKeys("987654321");
	Thread.sleep(2000);
	
	email.sendKeys("dany@gamail.com");
	Thread.sleep(2000);
	
	Select s2=new Select(gender);
	s2.selectByIndex(1);
	Thread.sleep(1000);
	
	middlename.sendKeys("lousie");
	Thread.sleep(2000);
	
	DOB.sendKeys("25/01/1995");
	Thread.sleep(2000);
	
	addline1.sendKeys("Asiatic building");
	Thread.sleep(2000);
	
	addline2.sendKeys("technopark");
	Thread.sleep(2000);
	
	addline3.sendKeys("TVM");
	Thread.sleep(2000);
	
	postcode.sendKeys("695583");
	Thread.sleep(2000);
	
	Select s3=new Select(branch);
	s3.selectByIndex(1);
	Thread.sleep(1000);
	
	Select s4=new Select(division);
	s4.selectByIndex(1);
	Thread.sleep(1000);
	
	Select s5=new Select(employtype);
	s5.selectByIndex(1);
	Thread.sleep(1000);
	
	Select s6=new Select(payslipmethod);
	s6.selectByIndex(1);
	Thread.sleep(1000);
	
	Select s7=new Select(enagagestatus);
	s7.selectByIndex(1);
	Thread.sleep(1000);
	
	ninumber.sendKeys("6955");
	Thread.sleep(2000);
	
	country.clear();
	country.sendKeys("india");
	Thread.sleep(2000);
}
public void nextButton() throws InterruptedException
{
	next.submit();
	Thread.sleep(2000);
}
public void accountDetailed() throws InterruptedException
{
	
	Select s8=new Select(paymentmethod);
	s8.selectByIndex(0);
	Thread.sleep(1000);
	
	Select s9=new Select(accountype);
	s9.selectByIndex(0);
	Thread.sleep(1000);
	
	accountname.sendKeys("sbi");
	Thread.sleep(2000);
	
	accountnumber.sendKeys("12345");
	Thread.sleep(2000);
	
	sortcode.sendKeys("0987");
	Thread.sleep(2000);
	
	startdate.clear();
	startdate.sendKeys("12-01-2020");
	Thread.sleep(2000);
	
	rollnumber.sendKeys("15");
	Thread.sleep(2000);
	
	bankname.sendKeys("hdfc");
	Thread.sleep(2000);
	
	bankaddress.sendKeys("TVM");
	Thread.sleep(2000);
	
	save.submit();
	Thread.sleep(2000);
}
public boolean nextButtonValidation()
{
	boolean j=next.isDisplayed();
	System.out.println("j");
	return j;
}
public String createWorkerPageTitle()
{
	String o=driver.getTitle();
	return o;
}
public CreateWorker(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}

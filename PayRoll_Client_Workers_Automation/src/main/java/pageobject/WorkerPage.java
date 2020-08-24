package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkerPage {
WebDriver driver;

/*@CacheLookup
@FindBy(xpath="//a[text()='Workers']")
WebElement workertab;*/

@CacheLookup
@FindBy(name="WorkerSearch[first_name]")
WebElement Fname;

@CacheLookup
@FindBy(name="WorkerSearch[last_name]")
WebElement Lname;

@CacheLookup
@FindBy(name="WorkerSearch[postcode]")
WebElement postcode;

@CacheLookup
@FindBy(name="WorkerSearch[ni_number]")
WebElement Ninumber;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\" and @class=\"btn btn-primary\"]")
WebElement search;

@CacheLookup
@FindBy(xpath="//a[@href=\"/payrollapp/worker/update?id=1\"]")
WebElement update;

@CacheLookup
@FindBy(name="Worker[middle_name]")
WebElement middlename;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\" and text()=\"Next\"]")
WebElement next;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\" and text()=\"Save\"]")
WebElement save;

public void workerSearch() throws InterruptedException
{
	Thread.sleep(2000);
	WebElement workertab=driver.findElement(By.xpath("//a[@href=\"/payrollapp/worker/index\"]"));
	workertab.click();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	
	Fname.sendKeys("jiya");
	Thread.sleep(3000);
}

public void searchButton() throws InterruptedException
{
	
	search.click();
	Thread.sleep(3000);
	System.out.println("Search test passed");
}

public void updateSearch() throws InterruptedException
{
	Thread.sleep(2000);
	update.click();
	Thread.sleep(2000);
	middlename.clear();
	middlename.sendKeys("janvi");
	Thread.sleep(2000);
	next.submit();
	Thread.sleep(2000);
	save.submit();
	System.out.println("Updated successfully");
	Thread.sleep(3000);
}
public boolean searchbuttonValidation() {
	boolean c=search.isDisplayed();
	System.out.println(c);
	return c;
}
public String validateclientpagetitle() {
	String t=driver.getTitle();
	System.out.println(t);
	return t;
	
}
public WorkerPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}

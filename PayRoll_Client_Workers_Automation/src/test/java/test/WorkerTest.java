package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.LoginPage;
import pageobject.WorkerPage;
import utilities.BaseClass;

public class WorkerTest extends BaseClass {
	//LoginPage l;
	WorkerPage w;
	
	/*@Test(priority=0, dataProvider="dp")
	  public void login(String n, String p) throws InterruptedException {
		  l=new LoginPage(driver);
		  l.username(n);
		  l.password1(p);
		  
		  boolean g=l.loginPageValidation();
		  Assert.assertTrue(g);
		  System.out.println("First Test Pass");
		  
		  l.login();
		  
		  String b=l.validateLoginpagetitle();
		  System.out.println(b);
		  Assert.assertEquals(b, "Payroll Application");
		   
	  }*/
 @Test(priority=0)
 public void workerTest() throws InterruptedException
{
	 w=new WorkerPage(driver);
	 w.workerSearch();
	 
	  boolean c=w.searchbuttonValidation();
	  Assert.assertTrue(c);
	  System.out.println(" search button is displayed successfully");
	  
	  String t=w.validateclientpagetitle();
	  System.out.println(t);
	  Assert.assertEquals(t, "Workers");
	  
	  w.searchButton();
	  w.updateSearch();
}
	
	 
  }


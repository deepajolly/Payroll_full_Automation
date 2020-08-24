package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.ClientPage;

import pageobject.CreateClient;
import pageobject.CreateWorker;
import pageobject.LoginPage;
import pageobject.WorkerPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass{
	LoginPage l;
	ClientPage f;
	CreateClient c;
	WorkerPage w;
	CreateWorker q;
	
  @Test(priority=0, dataProvider="dp")
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
	   
  }
  
  @Test(priority=1)
  public void clientPageTest() throws InterruptedException
  {
	  f=new ClientPage(driver);
	  f.clientExam();
      
	  boolean z=f.searchbuttonValidation();
	  Assert.assertTrue(z);
	  System.out.println("Second Test Pass");
	  
	  String h=f.validateclientpagetitle();
	  System.out.println(h);
	  Assert.assertEquals(h, "Clients");
	  
	  f.searchid();
  }
  
  @Test(priority=2)
  public void createClientTest() throws InterruptedException
  {
	  c=new CreateClient(driver);
	  c.create();
	  	   	  
	  boolean y=c.savebuttonValidation();
	  Assert.assertTrue(y);
	  System.out.println("Third Test Pass");
	  
	  String x=c.createclientTitle();
	  System.out.println(x);
	  Assert.assertEquals(x, "Create Client");
	  
	  c.save();
  }
  @Test(priority=3)
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
 
  @Test(priority=4)
  public void createWorkerTest() throws InterruptedException {
	  q=new CreateWorker(driver);
	  q.createWorkerPage();
	  
	  boolean j=q.nextButtonValidation();
	  Assert.assertTrue(j);
	  System.out.println("Next button is displayed successfully");
	  
	  String o=q.createWorkerPageTitle();
	  System.out.println(o);
	  Assert.assertEquals(o, "Create Worker");
	  
	  q.nextButton();
	  q.accountDetailed();
  } 

}

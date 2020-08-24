package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.CreateWorker;
import utilities.BaseClass;

public class CreateWorkerTest extends BaseClass{
	CreateWorker q;
  @Test(priority=0)
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

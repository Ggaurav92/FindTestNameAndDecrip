package BrowserFirst;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends BrowserFunction{
  @Test
  public void g1() {
	  System.out.println("This is the change for git");
	  System.out.println("This is the second change for git");
	  Assert.assertEquals(true, true);
  }
  
  @Test
  public void g2() {
	  System.out.println("This is the change for git");
	  System.out.println("This is the second change for git");
	  Assert.assertEquals(true, false);
  }
  
  @Test
  public void g3() {
	  Assert.assertEquals(false, false);
  }
  
  @Test
  public void g4() {
	  Assert.assertEquals(false, false);
  }
}

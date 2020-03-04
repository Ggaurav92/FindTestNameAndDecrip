package BrowserFirst;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BrowserFunction extends TestInMethod {
  TestInMethod ts = new TestInMethod();
  static String fileName = "C:\\Users\\P10444427\\Desktop\\Java\\TestWorksheet.xlsx";
  static int i;
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	  String cellContent = this.getClass().getSimpleName();
	  System.out.println(cellContent);
	  String StepName = ts.GetStepName(fileName, cellContent,i,7);
	  String StepDescrip = ts.GetStepName(fileName, cellContent,i,8);
	  String merged = StepName + ": "+ StepDescrip;
	  System.out.println(merged);
	  i++;
	
  }

  @BeforeClass
  public void beforeClass() throws IOException {
	    i = 0;
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  
  
  }

  @AfterSuite
  public void afterSuite() {
	  ts.finish();
  }

}

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
  //path of TestScript excel file
  static String fileName = "C:\\Users\\P10444427\\Desktop\\Java\\TestWorksheet.xlsx";
  static int i;
	
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() throws IOException {
	  
	  //Gets the current TestNG class Name
	  String cellContent = this.getClass().getSimpleName();
	  System.out.println(cellContent);
	  //Searches for the Class name in Excel and return step name
	  String StepName = ts.GetStepName(fileName, cellContent,i,7);
	  //Searches for the Class name in Excel and returns description of step
	  String StepDescrip = ts.GetStepName(fileName, cellContent,i,8);
	  // Here we merge the step and description to be put in word
	  String merged = StepName + ": "+ StepDescrip;
	  System.out.println(merged);
	  i++;
	
  }

  @BeforeClass
  public void beforeClass() throws IOException {
	  //making iterator i=0 before every TestNG class
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
	  //finishing the excel instance
	  ts.finish();
  }

}

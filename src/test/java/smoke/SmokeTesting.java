package smoke;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SmokeTesting {
  @Test
  public void f() {
	  
	  System.out.println("Just for testing ... ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Actions before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Actions after method");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Actions before the test");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("Action after the test");
  }
  @Test
  public void Search() {
	  System.out.println("This is to search ...");
	  
  }
  @Test
  public void login() {
	  System.out.println("This is the login things ... ");
  }

}

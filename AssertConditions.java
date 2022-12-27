package Mav_pkg;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class AssertConditions {
  @Test (priority = 0)
  public void yogeesh() {
	  AssertJUnit.assertEquals("tushar", "aditya");
	  System.out.println("this is first case");
  }
  
 @Test (priority = 1, dependsOnMethods = "yogeesh", alwaysRun = false )
 
 private void pratiksha() {
       System.out.println("this is second case");  
}
 
@Test (priority = 2)

 private void meghna() {
       System.out.println("this is third case");  
}
 
@Test (priority = 3, dependsOnMethods = "pratiksha")

private void prashanth() {
      System.out.println("this is fourth case");  
}
  
}

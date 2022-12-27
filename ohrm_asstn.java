package Mav_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ohrm_asstn {
 
  @BeforeTest
  public void beforeTest() { System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe"); 
  ChromeDriver wd= new ChromeDriver();
  wd.manage().window().maximize();
  wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
             
	  
	  
	  
  }
  
  @Test
  public void f() {
  }

  @AfterTest
  public void afterTest() {
  }

}

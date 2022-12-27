package Mav_pkg;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_report {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver wd;
	
	@BeforeTest
	public void BT() {
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/pooji.html",true); // trying to save the html file in testoutputs in the name of pooji,if it is true
		extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent-config.xml")); // trying to load some config or inputs to that  HTML file by saving it in src/test/java
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
	}
	
  @Test       
  public void login() throws InterruptedException {
	  logger = extent.startTest("Demo"); // this indicates that logger will have a influence on the test
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  logger.log(LogStatus.PASS,"web page has opened");  //in the report we will have a record of the steps performed
	  
	  Thread.sleep(3000);
	  
	  String title = wd.getTitle();
	  logger.log(LogStatus.PASS, title);
	  
	  Assert.assertEquals("pooji", "pooji");
	  logger.log(LogStatus.PASS, "Assert passed");
	  
	  wd.findElement(By.name("username")).sendKeys("Admin");
	  logger.log(LogStatus.PASS, "username is entered");

	  wd.findElement(By.name("password")).sendKeys("admin123");
	  logger.log(LogStatus.PASS, "password is entered");
	  
	  Thread.sleep(3000);

	  wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
	  logger.log(LogStatus.PASS, "login successful");

  }
  
  @Test(dependsOnMethods = "login")
   
  public void logout() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  
	  wd.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']")).click();
	  logger.log(LogStatus.PASS, "clicking on the dropdown");
	   
	  Thread.sleep(2000);
	  
	  wd.findElement(By.linkText("Logout")).click();
	  logger.log(LogStatus.PASS, "logged out");
  
  }
  
  @AfterTest
  
  public void afterTest() {
	  wd.close();
	  extent.endTest(logger); 
	  
	  extent.flush(); //this will flush all the logged data into the HTML report
	  
	  extent.close(); //this will give an end to the report
	  
  }
  
  
  
}
 
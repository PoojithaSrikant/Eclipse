package Mav_pkg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JSE {
	WebDriver wd;
  @Test
  public void tc1() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor)wd; // it is replacing the webdriver with javascript executor
	  Thread.sleep(3000);
	  //js.executeScript("document.getElementsByName('username')[0].value='Admin'");
	  //js.executeScript("history.go(0)");
	  //js.executeScript("window.history.forward(0)");
	  //js.executeScript("document.getElementsByName('password')[0].value='admin123'");
	  //js.executeScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click()");
      js.executeScript("document.getElementById('userName').value='poojitha'");
      js.executeScript("document.getElementById('userEmail').value='pooji123@gmail.com'");
      js.executeScript("document.getElementById('currentAddress').value='Boston'");
      js.executeScript("document.getElementById('permanentAddress').value='Boston'");
      js.executeScript("document.getElementById('submit').click()");
	  js.executeScript("window.scrollBy(0,500)");
	  System.out.println(js.executeScript("return document.title"));
	  System.out.println(js.executeScript("return document.domain"));
	  //System.out.println(js.executeScript("return document.documentelement.innerText")); // complete text will appear
	  //System.out.println(js.executeScript("return document.getElementById('userName').innerText")); //username text will appear
	  System.out.println(js.executeScript("return document.getElementById('submit').innerText")); //submit text will appear


	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.get("https://demoqa.com/text-box");
      
	  
  }

}

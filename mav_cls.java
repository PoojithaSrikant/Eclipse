package Mav_pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class mav_cls {
	WebDriver dr;
  
  @BeforeTest
  public void beforeTest() throws InterruptedException, AWTException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe"); 
	  dr=new ChromeDriver();
	  dr.manage().window().maximize();
	  dr.navigate().to("https://rahulshettyacademy.com/practice-project");
 
  }
  
  
  
  @Test
  public void f() throws InterruptedException, AWTException {
	  WebElement wb=dr.findElement(By.linkText("More"));
	  Actions act=new Actions(dr);
	  Thread.sleep(6000);
	  act.moveToElement(wb).build().perform();
	  
	  Robot rc=new Robot();
	  rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	  rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	  Thread.sleep(3000);
	  rc.keyPress(MenuKeyEvent.VK_PAGE_UP);
	  WebElement wb1=dr.findElement(By.xpath("//*[@class='theme-btn register-btn']"));
	  wb1.click();
	  Thread.sleep(2000);
	  WebElement wb2=dr.findElement(By.xpath("//*[@class='navbar-collapse collapse clearfix']/ul/li[1]"));
	  wb2.click();

	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

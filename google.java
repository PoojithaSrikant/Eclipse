package Mav_pkg;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class google {
	WebDriver dr;
	public String URL1 = "https://www.google.com";
	public String URL2 = "https://www.amazon.in";
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
	  dr= new ChromeDriver();
	  dr.get(URL1);
	  dr.manage().window().maximize();
	  
	  
  }
  @Test
  public void actions() throws InterruptedException, AWTException {
	  WebElement link = dr.findElement(By.xpath("//*[contains(text(),'Gmail')]"));
	 // link.click();
	  Thread.sleep(3000);
	  Actions act = new Actions(dr);
	  act.contextClick(link).build().perform();
	  
	  Robot rc = new Robot();
	  Thread.sleep(3000);
	  rc.keyPress(MenuKeyEvent.VK_DOWN);
	  rc.keyPress(MenuKeyEvent.VK_ENTER);
	  Thread.sleep(2000);
	  rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  rc.keyPress(MenuKeyEvent.VK_TAB);  
	
	  
	  
	           
  }

  @AfterTest
  public void afterTest() {
	  dr.close();
  }

}

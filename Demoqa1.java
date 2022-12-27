package Mav_pkg;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Demoqa1 {
	WebDriver wd;
	public String URL1="https://demoqa.com/upload-download";
	public String URL2="https://demoqa.com/alerts";
	public String URL3="https://demoqa.com/browser-windows";

      
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wd=new ChromeDriver();
	  wd.manage().window().maximize();
  }
  
  
  @Test (enabled = false)
  public void uploading_a_line() {
	  wd.get(URL1);
	  wd.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\91998\\Documents\\Testing\\SW defect.png");//upaload afile 
	  
  }
  
  @Test (enabled = false)
  public void Alerts() throws InterruptedException {
	  wd.get(URL2);
	  wd.findElement(By.id("alertButton")).click();  //clicking on alert button
	  Alert alt = wd.switchTo().alert();//switch to alert popup
	  System.out.println(alt.getText());
	  Thread.sleep(3000);
	  alt.accept();  //accept is for clicking "OK"
	  
	  wd.findElement(By.id("timerAlertButton")).click();
	  wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // telling the browser to hold for given time  IMPLICIT WAIT
	  //System.out.println(alt.getText());
	  //Thread.sleep(2000);
	  WebDriverWait wdw = new WebDriverWait(wd, 180); // explicit wait for 180seconds
	  wdw.until(ExpectedConditions.alertIsPresent()); //you are telling the weddriver to accept or press "OK" after the popup appears
	  alt.accept();  // clicking OK
	  
	  
	  wd.findElement(By.id("confirmButton")).click();
	  Thread.sleep(3000);
	  alt.dismiss();
	  
	  Thread.sleep(3000);
	  
	  
	  wd.findElement(By.id("promtButton")).click();
	  Thread.sleep(3000);
	  alt.sendKeys("pooji");
	  alt.accept();
	  
  }
  
  @Test(enabled = true)
  public void windows() throws InterruptedException, AWTException {
	  wd.get(URL3); 
	  String parentwindow= wd.getWindowHandle(); // this one gets window handle (ID) id of parent window
	  System.out.println(parentwindow);  // print the ID
	  //wd.findElement(By.id("tabButton")).click();
	  //Robot rc = new Robot();
	  //rc.keyPress(MenuKeyEvent.VK_CONTROL);
	  //rc.keyPress(MenuKeyEvent.VK_TAB);
	  
	  //Thread.sleep(2000);
	  
	  for(int i=0; i<3; i++) {
		  wd.findElement(By.id("windowButton")).click();
		  Thread.sleep(2000);
	  }
	  Set<String> allwindow = wd.getWindowHandles(); // storing multiple data
	  System.out.println(allwindow);  // getting all ID's 
	  System.out.println(allwindow.size());  // getting how many ID's
	  String lastwindow ="";
	  
	  for(String handle: allwindow) {  // calling all child windows in a string
		  wd.switchTo().window(handle); // switching to all windows
		  wd.get("https://www.google.com"); // getting google on all child windows
		  Thread.sleep(2000);
		  //wd.close();
		  lastwindow = handle;
		  
	  }
	   Thread.sleep(3000);
	   wd.switchTo().window(parentwindow);
	   wd.get("https://opensource-demo.orangehrmlive.com/");
	   wd.close();
	   wd.switchTo().window(lastwindow); // last opened window
	   wd.get("https://mail.google.com/mail/");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}

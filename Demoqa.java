package Mav_pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoqa {
	public static void main(String[] args ) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		  WebDriver wd =new ChromeDriver();
		  wd.manage().window().maximize();
		  wd.get("https://demoqa.com/text-box");//textbox
		  Thread.sleep(6000);
		  wd.findElement(By.id("userName")).sendKeys("PoojithaSrikant");//Username
		  wd.findElement(By.id("userEmail")).sendKeys("Pooji123@gmail.com");//Useremail
		  wd.findElement(By.id("currentAddress")).sendKeys("Varthur,Bangalore");//Current Address
		  wd.findElement(By.id("permanentAddress")).sendKeys("Varthur,Bangalore");//PermanentAddress
		  Thread.sleep(2000);
		  Robot rc=new Robot();
		  rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(2000);
		  wd.findElement(By.xpath("//*[@class=\'btn btn-primary\']")).click();//SubmitButton	
		  Thread.sleep(2000);
		  wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[2]")).click();//checkbox
		  WebElement wb = wd.findElement(By.xpath("//*[@class='rct-checkbox']"));//checkbutton
		  Actions act=new Actions(wd);
		  act.click(wb).build().perform();
		  Thread.sleep(3000);
		  wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[3]")).click();//radiobuttons
		  WebElement wb1=wd.findElement(By.id("yesRadio"));//yes button
		  act.click(wb1).build().perform();
		  Thread.sleep(2000);
		  wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[4]")).click();//webtables
		  WebElement wb2=wd.findElement(By.id("addNewRecordButton"));//add
		  act.click(wb2).build().perform();
		  Thread.sleep(1000);
		  wd.findElement(By.id("firstName")).sendKeys("Poojitha");//Firstname
		  wd.findElement(By.id("lastName")).sendKeys("Srikant");//Lastname
		  wd.findElement(By.id("userEmail")).sendKeys("pooji1234@example.com");//Useremail
		  wd.findElement(By.id("age")).sendKeys("28");//age
		  wd.findElement(By.id("salary")).sendKeys("50000");//salary
		  wd.findElement(By.id("department")).sendKeys("Testing");//department
		  WebElement wb3=wd.findElement(By.id("submit"));
		  act.click(wb3).build().perform();
		  Thread.sleep(2000);
		  WebElement wb4=wd.findElement(By.id("delete-record-1"));//deleterecord
		  act.click(wb4).build().perform();
		  Thread.sleep(4000);
		  wd.findElement(By.id("edit-record-2")).click();
		  wd.findElement(By.id("firstName")).clear();
		  wd.findElement(By.id("firstName")).sendKeys("shiny");//Firstname
		  wd.findElement(By.id("lastName")).clear();
		  wd.findElement(By.id("lastName")).sendKeys("shetty");//Lastname
		  wd.findElement(By.id("userEmail")).clear();
		  wd.findElement(By.id("userEmail")).sendKeys("shiny@example.com");//Useremail
		  wd.findElement(By.id("age")).clear();
		  wd.findElement(By.id("age")).sendKeys("35");//age
		  wd.findElement(By.id("salary")).clear();
		  wd.findElement(By.id("salary")).sendKeys("500000");//salary
		  wd.findElement(By.id("department")).clear();
		  wd.findElement(By.id("department")).sendKeys("Networking");//department
		  wd.findElement(By.id("submit")).click();
		  Thread.sleep(3000);
		  rc.keyPress(KeyEvent.VK_PAGE_DOWN);
		  //wd.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]")).click();//buttons
		  //Thread.sleep(2000);
		  //WebElement wb5=wd.findElement(By.xpath("//*[@id='doubleClickBtn']"));
          //act.doubleClick(wb5).perform();
          //Thread.sleep(3000);
          //WebElement wb6=wd.findElement(By.xpath("//*[@id='rightClickBtn']"));
          //act.contextClick(wb6).perform();
          //Thread.sleep(2000);
          //WebElement wb7=wd.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]"));
          //act.click(wb7).perform();
		  //wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[6]")).click();//links

		  
         

		  




		  
		  
		  

		  
		  
		 
		  
		  
		  
		  
		  
	}
	
	
	
}

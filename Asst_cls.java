package Mav_pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asst_cls {

	public static void main(String[] args) throws AWTException, InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium-java-4.7.0\\chromedriver.exe");
		  WebDriver wd =new ChromeDriver();
		  wd.manage().window().maximize();
		  wd.navigate().to("https://demoqa.com/");
		  Thread.sleep(6000);
		  WebElement wb=wd.findElement(By.xpath("//*[@class=\'card mt-4 top-card\'][1]"));
		  wb.click();
		  Robot rc=new Robot();
		  rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		  rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		  rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		  //rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(2000);
		  wd.findElement(By.xpath("//*[@class='element-group'][5]")).click();
		  //wb1.click();
		  Thread.sleep(3000);
		  //wd.findElement(By.xpath("//*[@class='header-text'][5]]")).click();
		  
		  //wb2.click();
		  Thread.sleep(2000);
		  wd.findElement(By.xpath("//*[@class='left-pannel']/div[1]/div[5]/div/ul/li[4]/span")).click();//Droppable Button
		  //wb3.click();
		  //rc.keyPress(KeyEvent.VK_PAGE_UP);
	      //rc.keyPress(KeyEvent.VK_PAGE_UP);
		  Thread.sleep(2000);
		 // WebElement a=wd.findElement(By.xpath("//*[@class=\'drag-box mt-4 ui-draggable ui-draggable-handle\']"));//Draggable
		 // WebElement b=wd.findElement(By.xpath("//*[@class=\'drop-box ui-droppable\']"));//Droppable
		  WebElement a=wd.findElement(By.id("draggable"));
		  WebElement b=wd.findElement(By.id("droppable"));
		  Actions act=new Actions(wd);
		  act.dragAndDrop(a,b).build().perform();
          Thread.sleep(4000);
          wd.close();
          
		  
		  


	}

}

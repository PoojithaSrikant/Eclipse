package DD2020;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;

public class Datadriven {
	WebDriver wd;
	public String URL ="https://opensource-demo.orangehrmlive.com/";
	public String username1,password1;
	
  @Test
  public void datadriven1() throws IOException, InterruptedException {
	  File excel = new File("C:/Users/91998/Documents/Datadriven_testng.xlsx/"); //telling eclipse where the file is
	  FileInputStream fis = new FileInputStream(excel); // this is for trying to giving input to program from excel/file
	  XSSFWorkbook book = new XSSFWorkbook(fis); // collection of xcel sheets
	  XSSFSheet sheet = book.getSheet("Sheet1"); // fetching details from sheet1 
	  
	  int row_count = sheet.getLastRowNum(); //fetches till last row
	  
	  for(int i=0; i<=row_count; i++) {
		  
		String username = sheet.getRow(i).getCell(0).getStringCellValue();
		 String password = sheet.getRow(i).getCell(1).getStringCellValue();
		 wd.findElement(By.name("username")).sendKeys(username);
         wd.findElement(By.name("password")).sendKeys(password);
         wd.findElement(By.xpath("//*[@type='submit']")).click();
         Thread.sleep(2000);
         
         
          if (wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) // it compares the             
         {
        	 wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
        	 Thread.sleep(3000);
        	 wd.findElement(By.linkText("Logout")).click();
             Thread.sleep(2000);
    			 
    		 }
         else if(wd.findElement(By.xpath("//*[@class='oxd-alert-content oxd-alert-content--error']")).isDisplayed())
    	 {
    		 for (int j=i+1; j<=row_count; j++)
    		 {
    			 
    			 username1= sheet.getRow(j).getCell(0).getStringCellValue();
    			 password1 = sheet.getRow(j).getCell(1).getStringCellValue();
    			 wd.findElement(By.name("username")).sendKeys(username1);
    	         wd.findElement(By.name("password")).sendKeys(password1);
    	         //Thread.sleep(2000);
    	         wd.findElement(By.xpath("//*[@type='submit']")).click();
                 Thread.sleep(3000);	

         
    		 
    		  if (wd.getCurrentUrl().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
    	         {
    	        	 wd.findElement(By.xpath("//*[@class=\'oxd-userdropdown-name\']")).click();
    	        	 Thread.sleep(3000);
    	        	 wd.findElement(By.linkText("Logout")).click();
    	             Thread.sleep(2000);
    	    			 
    	    		 }
    	 }
    		 break;
        	
         }
          book.close();

	  }
	  
	  
  }

  @BeforeTest
  public void BT() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  wd = new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.get(URL);
	  Thread.sleep(3000);
	  
  }
  
}

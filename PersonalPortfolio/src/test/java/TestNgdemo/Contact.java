package TestNgdemo;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class Contact {
	WebDriver driver;
 
	  @Test
	  public void test() throws InterruptedException {
		  String path1="D:\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path1);
		 driver=new ChromeDriver();
		 driver.get("file:///C:/Users/itctesting34/Downloads/Portfolio-Web_Application-Project-main/Portfolio-WebApplication/Home%20Page/Jaswanthi-portfolio/contact.html");
	
			driver.findElement(By.id("name")).sendKeys("jaswanthi");
			driver.findElement(By.id("email")).sendKeys("jaswanthi1323@gmail.com");
			driver.findElement(By.id("subject")).sendKeys("Your profile is shortlisted");
			driver.findElement(By.id("message")).sendKeys("I'am quite impressed with your portfolio. May I have your resume and contact details");
			driver.findElement(By.id("submit")).click();
			Thread.sleep(500);
			Alert alert=driver.switchTo().alert();
			alert.accept();
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Application is starting");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
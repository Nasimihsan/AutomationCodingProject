package MNI.ExampleONE;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethod.HomePages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Amazon  {
	private static final String Chrome = null;
	public WebDriver driver=null;
	
	
  @Test
  
  public void f() {
	  System.out.println("this is test annotation");
	HomePages it=new HomePages(driver);
	
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(actual, expected);
	  Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  it.Searchboxfieldenter();
	  it.Searchboxclick();
	  WebElement CustomerServiceLink=it.CustomerserviceVarifi();
	  boolean Customer=CustomerServiceLink.isDisplayed();
	  Assert.assertEquals(Customer, true);
	  
	  //String Assert.Actual
	  //Assert.assertEquals(ActualURL, "https://www.amazon.com/s?k=phones&ref=nb_sb_noss_1");
	  
  }
  
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) {
	  System.out.println("This is Before class");
	  
	  browsers(browser);
	  
  }

  //@AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
	  
	  driver.close();
	 
  }
  public void browsers(String Br) {
	  if (Br.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://amazon.com");
			  driver.manage().window().maximize();
		  
	  }else if(Br.equalsIgnoreCase("Firefox")) {

		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://amazon.com");
			  driver.manage().window().maximize();
	  }
  }

}

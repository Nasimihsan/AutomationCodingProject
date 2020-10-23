package MNI.ExampleONE;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      //how to open the site in Chrome browser
		//i) set up Chrome driver (This line has to be there always)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\chromedriver.exe");
// ii) how to call Chrome driver Constructor(This line has to be there always as well)
		WebDriver driver=new ChromeDriver();
		//iii) how to open a website (This line has to be there always too, Than the following functions can be done, either all or each separately)
		driver.get("https://www.facebook.com");
		//v) how to maximize the browser
		driver.manage().window().maximize();
		//iv) how to refresh
		Thread.sleep(5000);
		driver.navigate().refresh();
		//vi)how to go back
		driver.navigate().back();
		//ii) how to go forward
		driver.navigate().forward();
	//how to find locators
		/*i) ID
		/ *ii) linktext
        / * partial linktext
         /* calss name
         /* xpath
          /*tagname
           /* Css selection
            /* name */
           //how to store locator in to a variable 
           
        WebElement createAnAccouElement=driver.findElement(By.id("u_0_2"));
        //how to create click on element 
       createAnAccouElement.click();
       driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        
        WebElement Forgotlink=driver.findElement(By.linkText("Forgot Password?"));
        //Forgotlink.click();
        WebElement Forgotlinkpartial=driver.findElement(By.partialLinkText("Forgot"));
        //Forgotlinkpartial.click();
      
        WebElement FirstNameField=driver.findElement(By.name("firstname"));
        FirstNameField.sendKeys("Mike");
     
        WebElement LastNameField=driver.findElement(By.name("lastnamebb"));
        LastNameField.sendKeys("Tyson");	
      WebElement EmailField=driver.findElement(By.name("reg_email__"));
      EmailField.sendKeys("ihsan.mm@outlook.com");
         

		
		
	}
	

}

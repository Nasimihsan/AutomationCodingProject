package MNI.ExampleONE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.FindsByXPath;

public class Selenuim_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\chromedriver.exe");
				//WebDriver driver=new ChromeDriver();
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.amazon.com");
				
				driver.manage().window().maximize();
				WebElement Ids=driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
				Ids.sendKeys("ihsan.nasim@outlook.com");
				WebElement pass=driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
				pass.sendKeys("123456");
				WebElement loginbutton=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
				loginbutton.click();
	}
	
	

}

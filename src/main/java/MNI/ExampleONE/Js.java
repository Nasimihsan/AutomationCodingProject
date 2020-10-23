package MNI.ExampleONE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
	}

}

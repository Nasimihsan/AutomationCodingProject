package MNI.ExampleONE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sep_28_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.expedia.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='uitk-field has-floatedLabel-label has-icon'])[1]")).click();
		driver.findElement(By.xpath("(//button[@data-day='14'])[1]")).click();
		driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();
	}

}

package MNI.ExampleONE;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SepTSC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Actions MNI=new Actions(driver);
		
		//MNI.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
		//MNI.moveToElement(driver.findElement(By.xpath("//*[text()='Explore Showroom']"))).click().build().perform();
		//MNI.moveToElement(driver.findElement(By.xpath("//*[text()='Discover']"))).click().build().perform();//**
		//MNI.moveToElement(driver.findElement(By.xpath("//*[text()='Best Sellers']"))).click().build().perform();
		//MNI.moveToElement(driver.findElement(By.xpath("//*[text()='Customer Service']"))).click().build().perform();
		driver.switchTo().frame(0);
		Thread.sleep(6000);
		WebElement Drag=driver.findElement(By.id("draggable"));
		WebElement Drop=driver.findElement(By.id("droppable"));
		MNI.dragAndDrop(Drag, Drop).build().perform();
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Sortable")).click();
		WebElement sort= driver.findElement(By.linkText("Sortable"));
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		MNI.keyDown(Keys.SHIFT).click(sort).build().perform();
		
		Set<String> newwindow=driver.getWindowHandles();
		for(String Windows:newwindow) {
			System.out.println(Windows);
			if(Windows.equalsIgnoreCase(windowhandle)) {
			System.out.println("This is Parent Window");
			
			
		} else {
			System.out.println("This is the other window");
			driver.switchTo().window(Windows);
			
			
		}
			String window=driver.findElement(By.xpath("//*[contains(text(),'Reorder elements in')]")).getText();
			System.out.println(window);
			driver.switchTo().window(windowhandle);
			System.out.println(driver.getCurrentUrl());
		
	}
	
	}
}

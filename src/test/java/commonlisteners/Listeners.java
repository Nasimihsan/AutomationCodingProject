package commonlisteners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	public WebDriver driver;
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
		
	}
	public void onTestSuccess(ITestResult result) {
		 Date dt=new Date();
		 String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		
		File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(di,new File("C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\Pictures"+sd));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void onTestFailuer(ITestResult result) throws IOException {
		 Date dt=new Date();
		 String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		
		File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(di,new File("C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\Pictures"+sd));
		
		
	}

}

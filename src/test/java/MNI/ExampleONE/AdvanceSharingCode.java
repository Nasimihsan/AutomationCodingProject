package MNI.ExampleONE;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class AdvanceSharingCode extends Amazon {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  
  public void afterClass() {
  }
 
 public void pictures() throws IOException {
	 Date dt=new Date();
	 String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
	
	File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(di,new File("C:\\Users\\M N Ihsan\\eclipse-workspace\\ExampleONE\\Drivers\\Pictures"+sd));
	
	 
 }
 

}

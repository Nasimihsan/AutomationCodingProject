package commonlisteners;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import MNI.ExampleONE.Amazon;
import PageClassesMethod.HomePages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Provider extends Amazon{
  @Test(dataProvider = "search")
  public void f(String t ) {
	  HomePages it=new HomePages(driver);
		
	  it.AmazonIconClick();
	  String ActualURL=driver.getCurrentUrl();
	  //SoftAssert Confirm=new SoftAssert();
	  //Confirm.assertEquals(actual, expected);
	  //Assert.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  it.Searchboxfieldenter();
	  it.Searchboxclick();
	  WebElement CustomerServiceLink=it.CustomerserviceVarifi();
	  boolean Customer=CustomerServiceLink.isDisplayed();
	  Assert.assertEquals(Customer, true);
  }

  @DataProvider
  public Object[][] search() {
    return new Object[][] {
      new Object[] { "Phone" },
      new Object[] {"cloths" },
      new Object[] {"Shoes"},
      
    };
  }
}

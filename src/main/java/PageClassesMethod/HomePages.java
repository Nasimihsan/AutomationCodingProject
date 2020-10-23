package PageClassesMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
	
	private WebDriver driver=null; 
	@FindBy(xpath = "//*[@class='nav-sprite nav-logo-base']")
	WebElement Amazonicon;
	@FindBy(id = "twotabsearchtextbox")
	WebElement Searchboxfield;
	@FindBy(xpath = "(//*[@class='nav-input'])[2])")
	WebElement SearchiconClick;
	@FindBy(xpath = "//a[text()='Customer Service']")
	WebElement Customer;



	public HomePages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void AmazonIconClick() {
		Amazonicon.click();
		
	}
	public void Searchboxfieldenter() {
		Searchboxfield.sendKeys("Phones");
	}
	public void Searchboxclick() {
		Searchboxfield.click();
	}
	public WebElement CustomerserviceVarifi() {
		return Customer;
	}

	}




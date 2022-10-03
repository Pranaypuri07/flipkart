package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Address {
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement name;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mobileNo;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement pincode;
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement locality;
	@FindBy(xpath="//textarea[@name='addressLine1']")
	private WebElement address;
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement city;
	@FindBy(xpath="//select[@name='state']")
	private WebElement state;
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement landmark;
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement alternatePhoneNo;
	@FindBy(xpath="(//div[@class='_1XFPmK'])[2]")
	private WebElement radio;
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement save;
	
	public Address(WebDriver driver) {
		PageFactory.initElements(driver,this);
		//this.driver=driver;
	}
	
	public void name() throws InterruptedException {
		Thread.sleep(9000);
		name.sendKeys("badal khaparde");
	}
	public void mobileNo() {
		mobileNo.sendKeys("7507072033");
	}
	public void pincode() {
		pincode.sendKeys("440006");
	}
	public void locality() {
		locality.sendKeys("nagpur");
	}
	public void address() {
		address.sendKeys("seminary hills near baludyan road nagpur");
	}
	public void city() {
		city.sendKeys("Nagpur");
	}
	public void state() {
		Select s=new Select(state);
		s.selectByVisibleText("Maharashtra");
	}
	public void landmark() {
		landmark.sendKeys("tvtower");
	}
	public void alternatePhoneNo() {
		alternatePhoneNo.sendKeys("9359126744");
	}
	public void radio() {
		radio.click();
	}
	public void save() throws InterruptedException {
		Thread.sleep(5000);
		save.click();
	}

}


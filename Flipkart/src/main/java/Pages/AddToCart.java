package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	private WebDriver driver;
	private WebDriverWait wait;
//	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
//	private WebElement close;
	
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement search;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement click12;
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement mobile;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCart;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
	private WebElement placeOrder;
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
		//this.driver=driver;
	}
	
//	public void close() {
//		close.click();
//	}
	
	public void search() throws InterruptedException  {
		Thread.sleep(9000);
		search.sendKeys("Realme x7 pro max");
	}
	
	public void click() throws InterruptedException {
		Thread.sleep(9000);
		click12.click();
	}
	
	public void mobile() throws InterruptedException  {
		Thread.sleep(9000);
		mobile.click();
	}
	
	public void addToCart() {
		
		addToCart.click();
	}
	
	public void placeOrder() {
		placeOrder.click();
	}

}

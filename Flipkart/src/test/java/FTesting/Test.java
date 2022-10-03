package FTesting;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddToCart;
import Pages.SignUp;
import Pages.Address;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32  1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://flipkart.com/");
		SignUp sign=new SignUp(driver);
		sign.closeButton();
		sign.login();
		sign.signUp();
		sign.mobileNo();
		sign.continue1();
		sign.password();
		sign.login1();
		AddToCart add=new AddToCart(driver);
//		add.close();
		add.search();
		add.click();
		add.mobile();
		ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		add.addToCart();
		add.placeOrder();
		Address addre=new Address(driver);
		addre.name();
		addre.mobileNo();
		addre.pincode();
		addre.locality();
		addre.address();
		addre.city();
		addre.state();
		addre.landmark();
		addre.alternatePhoneNo();
		addre.radio();
		addre.save();
		
		
	}

}

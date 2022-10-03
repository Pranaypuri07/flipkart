package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	
	 private WebDriver driver;
	    // private Actions act;
	    

		@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
		private WebElement closeButton;
		
		@FindBy(xpath="//a[@class='_1_3w1N']")
		private WebElement login;
		
		@FindBy(xpath="//div[text()='Sign Up']")
		private WebElement signUp;
		
		@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
		private WebElement mobileNo;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement continue1;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		private WebElement login1;
		
		public SignUp(WebDriver driver) {
			PageFactory.initElements(driver,this);
			this.driver=driver;
		    
		}
		
		public void closeButton() {
			closeButton.click();
		}
		
		public void login() {
			Actions act=new Actions(driver);
		    act.moveToElement(login).build().perform();
		}
		
		public void signUp() {
			signUp.click();
		}
		
		public void mobileNo() {
			mobileNo.sendKeys("7507072033");
		}
		
		public void continue1() {
			continue1.click();
		}
		
		public void password() {
			password.sendKeys("Badalkhaparde@26");
		}
		
		public void login1() {
			login1.click();
		}

	}


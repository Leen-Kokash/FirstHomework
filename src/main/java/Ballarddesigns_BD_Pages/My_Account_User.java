package Ballarddesigns_BD_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class My_Account_User {
	WebDriver driver;
	public My_Account_User(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By BD_myAccount = By.xpath("//*[@id=\"myAccount\"]/a/span");
	// Add selectores for welcome statment
	By user_welcome_st = By.cssSelector("div#bdheader > div.headerWrapper >div.topline >"
			+ " div.right > div#welcome");
	
	//Methods
	public String getAccountStatment() {
		return driver.findElement(BD_myAccount).getText();
	}
	public String getUserWelcomingStatment() {
		return driver.findElement(user_welcome_st).getText();
	}
	
}

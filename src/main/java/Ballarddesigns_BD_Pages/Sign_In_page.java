package Ballarddesigns_BD_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_In_page {
	WebDriver driver;

	public Sign_In_page(WebDriver driver) {
		this.driver = driver;
	}
	By BD_welcome_statmnet = By.xpath("//*[@id=\"mainContent\"]/div[3]/p[1]");
	// Add selectores for email filed 
	By The_email = By.cssSelector("input#logonId");
	// Add selectores for password
    By The_password = By.cssSelector("input#logonPassword");
	// Add selectores for signin button
    By BD_SignIn_Button = By.cssSelector("button#logonButton");
	//private string email2;
	
    //Methods
	public String getWelcomingStatmentForUser() {
		return driver.findElement(BD_welcome_statmnet).getText();
	}
	public void enterTheEmail(String email) {
		driver.findElement(The_email).sendKeys(email);
	}
	public void enterThePassword(String password) {
		driver.findElement(The_password).sendKeys(password);
	}
	public void clickOnSignIn() {
		driver.findElement(BD_SignIn_Button).click();
	}
}

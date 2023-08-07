package Ballarddesigns_BD_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_page {
	WebDriver driver;
	public Home_page(WebDriver driver) {
		this.driver = driver;
	}
// added the selectore for Logo and SigninLink
	By BD_logo = By.cssSelector("a.logo-anchor");
// added the selectore SigninLink
    By BD_signInLink = By.cssSelector("div#login > a");

    // Check if the logo is Appears or not?
	public boolean checkTheLogo() {
		return driver.findElement(BD_logo).isDisplayed();
	}
	public void clickTheSignInLink() {
		driver.findElement(BD_signInLink).click();
	}
}

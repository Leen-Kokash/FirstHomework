package com.test.FirstTask_by_Maven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Ballarddesigns_BD_Pages.Home_page;
import Ballarddesigns_BD_Pages.Sign_In_page;
import Ballarddesigns_BD_Pages.My_Account_User;

public class FirstTask_by_Maven {

	String webDriverLink = "C://Users//LeenKokash//Downloads//chromedriver_win32//chromedriver.exe";
	String URL = "https://devwcs2.ballarddesigns.com/";
    WebDriver driver;

	Home_page BDhomePage;
	Sign_In_page BDsignInPage;
	My_Account_User BDuserAccountPage;
	
	public void initiate_test() {
		System.setProperty("webdriver.chrome.driver", webDriverLink);
		System.out.println("Launch the chrome browser..");
		driver = new ChromeDriver();
		driver.get(URL);
  // Adding selctores
		driver.findElement(By.cssSelector("button#details-button")).click();
		driver.findElement(By.cssSelector("a#proceed-link")).click();

		
		
		
		
		BDhomePage = new Home_page(driver);
		BDsignInPage = new Sign_In_page(driver);
		BDuserAccountPage = new My_Account_User(driver);

	}
	//Methods
	public void testTheLogoOfBD() {
		boolean isLogoAppear = BDhomePage.checkTheLogo();
		Assert.assertTrue(isLogoAppear);
	}
	
	public void checkSignInLink() {
		BDhomePage.clickTheSignInLink();
	}

	public void welcomeStatmentTest() {
		String welcomeStatmentDisplayed = "Welcome back! To access your account, "
				+ "please enter your email address and password and click Sign In.";
		String Statemnet = BDsignInPage.getWelcomingStatmentForUser();
		Assert.assertEquals(welcomeStatmentDisplayed, Statemnet, "Statmnet is = " + Statemnet);
	}

	
	//Adding my credentails 
	public void addCredentials() {
		BDsignInPage.enterTheEmail("hs@hs.com");
		BDsignInPage.enterThePassword("123456he");
	}

	public void signIn(){
		BDsignInPage.clickOnSignIn();

	}
	public void myAccount() {
		String StringDisplayed = "My account";
		String Statemnet_1 = BDuserAccountPage.getAccountStatment();
		Assert.assertEquals(StringDisplayed, Statemnet_1);
	}

	public void welcomeTheUserCheck() {

		String welcomeandusername = "Welcome, Hs!";
		String theCurrentWelcome = BDuserAccountPage.getUserWelcomingStatment();
		Assert.assertEquals(theCurrentWelcome, welcomeandusername, "theCurrentWelcome is= " + theCurrentWelcome);
	}
}

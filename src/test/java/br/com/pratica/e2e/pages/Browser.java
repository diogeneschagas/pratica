package br.com.pratica.e2e.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import br.com.pratica.e2e.pages.linkedin.LoginPage;
import br.com.pratica.e2e.pages.facebook.LoginPageFB;

public class Browser {
	private WebDriver driver;

	public Browser() {
		this.driver = new BrowserFactory().createWebDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	protected WebDriver getDriver() {
		return driver;
	}

	public LoginPage getLoginPage() {
		return new LoginPage(driver);
	}
	
	public LoginPageFB getLoginPageFB() {
		return new LoginPageFB(driver);
	}
	
	public void clean() {
		driver.manage().deleteAllCookies();
		driver.close();
	}
}

package br.com.pratica.e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
//  Documentação
//	http://chromedriver.storage.googleapis.com/index.html
//	https://github.com/mozilla/geckodriver/releases	

	public WebDriver createWebDriver() {
//		String webdriver = System.getProperty("browser", "htmlunit");
		String webdriver = System.getProperty("browser", "firefox");
		switch (webdriver) {
			case "chrome":
				return initChromeDriver();
			default:
				return initFirefoxDriver();
		}
	}

	private  WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Windows\\System32\\chromedriver.exe");
		return new ChromeDriver();
	}

	private  WebDriver initFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Windows\\System32\\geckodriver.exe");
		return new FirefoxDriver();
	}
}

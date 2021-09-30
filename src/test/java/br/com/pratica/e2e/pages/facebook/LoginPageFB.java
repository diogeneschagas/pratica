package br.com.pratica.e2e.pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	private WebDriver driver;
	
	private static String URL_LOGIN_PAGE = "https://www.fb.com/";
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public FeedPage realizarLoginComo(String login, String senha) {
		driver.get(URL_LOGIN_PAGE);
		
		/*
		 * WebElement botaologin =
		 * driver.findElement(By.className("nav__button-tertiary")); botaologin.click();
		 */		
		
		WebElement txtlogin = driver.findElement(By.id("username"));
		WebElement txtsenha = driver.findElement(By.id("password"));
//		WebElement showPass = driver.findElement(By.id("password-visibility-toggle"));
		
		txtlogin.sendKeys(login);
	    txtsenha.sendKeys(senha);
//		showPass.click();
	    txtlogin.submit();
		return new FeedPage(driver);
		
	}
	
	public FeedPage realizaLoginComoDiogenes() {
		return realizarLoginComo("diogeneschagas20@gmail.com", "diochagas20");

    }


}

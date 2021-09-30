package br.com.pratica.e2e.pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPageFB {

	private WebDriver driver;
	
	private static String URL_LOGIN_PAGE = "https://www.fb.com/";
	
	public LoginPageFB(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public FeedPageFB realizarLoginComo(String login, String senha) {
		driver.get(URL_LOGIN_PAGE);
		
		/*
		 * WebElement botaologin =
		 * driver.findElement(By.className("nav__button-tertiary")); botaologin.click();
		 */		
		
		WebElement txtlogin = driver.findElement(By.id("email"));
		WebElement txtsenha = driver.findElement(By.id("pass"));
//		WebElement showPass = driver.findElement(By.id("password-visibility-toggle"));
		
		txtlogin.sendKeys(login);
	    txtsenha.sendKeys(senha);
//		showPass.click();
	    txtlogin.submit();
		return new FeedPageFB(driver);
		
	}
	
	public FeedPageFB realizaLoginComoDiogenes() {
		return realizarLoginComo("email", "senha");

    }


}

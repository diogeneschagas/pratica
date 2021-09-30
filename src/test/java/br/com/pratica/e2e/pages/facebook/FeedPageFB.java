package br.com.pratica.e2e.pages.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeedPageFB {

	private WebDriver driver;

	private static String PAGE_URL = "https://www.fb.com/";

	public FeedPageFB(WebDriver driver) {
		this.driver = driver;
	}

	public void visita() {
		driver.get(PAGE_URL);
	}

	public void digitarPost() {

//		mapeandoCampo
		WebElement campoPublicacao = driver.findElement(By.xpath(
				"//div[@class='m9osqain a5q79mjw gy2v8mqq jm1wdb64 k4urcfbm qv66sw1b']"));
		campoPublicacao.click();

//		acessarCampo
		String textoRole = "//div[@class = '_1mf _1mj']";
		WebElement areaTexto = driver.findElement(By.xpath(textoRole));
		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(textoRole)));
		
		areaTexto.sendKeys(
				"Este post foi feito usando Selenium Web Driver e o cenário escrito em Gherkin com o framework Cucumber.");
	}

	public void clicarPublicar() {
		String xPathx = "//div[@class = 'rq0escxv l9j0dhe7 du4w35lb j83agx80 pfnyh3mw taijpn5t bp9cbjyn owycx6da btwxx1t3 kt9q3ron ak7q8e6j isp2s0ed ri5dt5u2 rt8b4zig n8ej3o3l agehan2d sk4xxmp2 d1544ag0 tw6a2znq s1i5eluu tv7at329']";
		WebElement botaoPublicar = driver.findElement(By.xpath(xPathx));
		botaoPublicar.click();
	}
}

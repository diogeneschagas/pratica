package br.com.pratica.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FeedPage {

	private WebDriver driver;

	private static String PAGE_URL = "https://www.linkedin.com/feed/";

	public FeedPage(WebDriver driver) {
		this.driver = driver;
	}

	public void visita() {
		driver.get(PAGE_URL);
	}

	public void digitarPost() {

//		mapeandoCampo
		WebElement campoPublicacao = driver.findElement(By.xpath(
				"//button[@class='artdeco-button artdeco-button--muted artdeco-button--4 artdeco-button--tertiary ember-view share-box-feed-entry__trigger']"));
		campoPublicacao.click();

//		acessarCampo
		String textoRole = "//div[(@role = 'textbox') and (@data-placeholder = 'No que você está pensando?')]";
		WebElement areaTexto = driver.findElement(By.xpath(textoRole));
		WebDriverWait wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(textoRole)));
		
		areaTexto.sendKeys(
				"Este post foi feito usando Selenium Web Driver e o cenário escrito em Gherkin com o framework Cucumber.\r\n"
						+ "\r\n" + "O repositório está em https://github.com/diogeneschagas/pratica");
	}

	public void carregarVideo() {
		
		String xPathx =  "//button[@class = 'artdeco-button artdeco-button--circle artdeco-button--muted artdeco-button--2 artdeco-button--tertiary ember-view']//li-icon[@type = 'video-icon']";
		WebElement botaoCarregarVideo = driver.findElement(By.xpath(xPathx));
		botaoCarregarVideo.click();

		WebElement upload = driver.findElement(By.xpath(xPathx));
		upload.sendKeys("C:\\Users\\diogenes.chagas\\Videos\\Captures\\video.mp4");
	}

	public void clicarPublicar() {
		String xPathx = "//div[@class = 'share-box_actions']";
		WebElement botaoPublicar = driver.findElement(By.xpath(xPathx));
		botaoPublicar.click();
	}
}

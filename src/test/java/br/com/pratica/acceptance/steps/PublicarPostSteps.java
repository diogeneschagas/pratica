package br.com.pratica.acceptance.steps;

import br.com.pratica.e2e.pages.Browser;
import br.com.pratica.e2e.pages.FeedPage;
import br.com.pratica.e2e.pages.LoginPage;

public class PublicarPostSteps implements io.cucumber.java8.Pt {

	private FeedPage feedPage;
	private LoginPage loginPage;
	private Browser browser;
	
	public PublicarPostSteps() {
		
		Dado("que eu acesse o linkedin", () -> {
			this.browser = new Browser();
			loginPage = browser.getLoginPage();
			feedPage = loginPage.realizaLoginComoDiogenes();
		});

		Quando("eu digitar o texto", () -> {
			feedPage.digitarPost();
		});

		// TENTATIVA DE CARREGAR O VÍDEO
		/*
		 * Quando("carregar o video", () -> { //feedPage.carregarVideo(); });
		 */
		Entao("o post deve ser publicado", () -> {
			feedPage.clicarPublicar();
		});

	}
}
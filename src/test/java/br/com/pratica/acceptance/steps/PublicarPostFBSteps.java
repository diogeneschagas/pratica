package br.com.pratica.acceptance.steps;

import br.com.pratica.e2e.pages.Browser;
import br.com.pratica.e2e.pages.facebook.FeedPageFB;
import br.com.pratica.e2e.pages.facebook.LoginPageFB;

public class PublicarPostFBSteps implements io.cucumber.java8.Pt {

	private FeedPageFB feedPage;
	private LoginPageFB loginPage;
	private Browser browser;

	public PublicarPostFBSteps() {
//		Post LinkedIn

		// Facebook
		Dado("que eu acesse o facebook", () -> {
			this.browser = new Browser();
			loginPage = browser.getLoginPageFB();
			feedPage = loginPage.realizaLoginComoDiogenes();

		});
		Quando("eu digitar o post", () -> {
			feedPage.digitarPost();
		});


		Entao("ele deve ser publicado", () -> {
			feedPage.clicarPublicar();
		});

	}
}
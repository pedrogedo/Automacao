package br.com.automacaoIniciantes.Funcionalidade;

import org.openqa.selenium.WebDriver;

import br.com.automacaoIniciantes.PO.HomePO;

public class HomeFunc {

	HomePO homePO = new HomePO();
	
	public void home(WebDriver driver) {
		homePO.homeYaman(driver).click();
		homePO.contato(driver).click();
	}
}

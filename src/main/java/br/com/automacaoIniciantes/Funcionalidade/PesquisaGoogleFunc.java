package br.com.automacaoIniciantes.Funcionalidade;

import org.openqa.selenium.WebDriver;
import br.com.automacaoIniciantes.PO.PesquisaPO;

public class PesquisaGoogleFunc {
	
	PesquisaPO pesquisaPO = new PesquisaPO();
	
	public void realizarPesquisaGoogle(WebDriver driver){
		pesquisaPO.pesquisaGoogle(driver).sendKeys("Yaman");
		pesquisaPO.botaoPesquisaGoogle(driver).click();
	}
}

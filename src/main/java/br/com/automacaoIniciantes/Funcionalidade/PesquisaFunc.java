package br.com.automacaoIniciantes.Funcionalidade;

import org.openqa.selenium.WebDriver;
import br.com.automacaoIniciantes.PO.PesquisaPO;

public class PesquisaFunc {
	
	PesquisaPO pesquisaPO = new PesquisaPO();
	
	public void realizarBusca(WebDriver driver){
		pesquisaPO.campoBusca(driver).sendKeys("Yaman");
		pesquisaPO.pesquisar(driver).click();
	}
}

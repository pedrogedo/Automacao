package br.com.automacaoIniciantes.Funcionalidade;

import org.openqa.selenium.WebDriver;
import br.com.automacaoIniciantes.PO.ContatoPO;

public class ContatoFunc {
	
	ContatoPO contatoPO = new ContatoPO();
	
	/*Função que tem como objetivo inserir os dados no formulário 
	 * da página de contato.*/
	public void contato(WebDriver driver) {

		contatoPO.nomeDoContato(driver).sendKeys("Pedro Henrique");
		contatoPO.emailDoContato(driver).sendKeys("pedro.silva@yaman.com");
		contatoPO.assuntoDoContato(driver).sendKeys("Teste de Automação");
		contatoPO.mensagemDoContato(driver).sendKeys("Teste de Automação realizado com sucesso !!");
		contatoPO.enviarDoContato(driver).click();
	}
}

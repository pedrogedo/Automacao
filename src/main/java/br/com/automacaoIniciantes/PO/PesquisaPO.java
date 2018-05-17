package br.com.automacaoIniciantes.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaPO {
	
	public WebElement campoBusca(WebDriver driver){
		WebElement campo = driver.findElement(By.xpath(".//input[@title='Pesquisar']"));
		return campo;
	}
	
	public WebElement pesquisar(WebDriver driver) {
		WebElement botao = driver.findElement(By.xpath(".//input[@value='Pesquisa Google']"));
		return botao;
	}
}

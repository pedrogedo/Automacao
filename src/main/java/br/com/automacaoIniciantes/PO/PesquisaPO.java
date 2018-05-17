package br.com.automacaoIniciantes.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaPO {
	
	public WebElement pesquisaGoogle(WebDriver driver){
		WebElement campo = driver.findElement(By.xpath(".//input[@title='Pesquisar']"));
		return campo;
	}
	
	public WebElement botaoPesquisaGoogle(WebDriver driver) {
		WebElement botaoPesquisa = driver.findElement(By.xpath(".//input[@value='Pesquisa Google']"));
		return botaoPesquisa;
	}
}

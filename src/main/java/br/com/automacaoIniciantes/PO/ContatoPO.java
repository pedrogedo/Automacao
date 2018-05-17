package br.com.automacaoIniciantes.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContatoPO {

	public WebElement nomeDoContato(WebDriver driver) {
		WebElement nome = driver.findElement(By.xpath(".//input[@name='your-name']"));
		return nome;
	}
	
	public WebElement emailDoContato(WebDriver driver) {
		WebElement email = driver.findElement(By.xpath(".//input[@name='your-email']"));
		return email;
	}
	
	public WebElement assuntoDoContato(WebDriver driver) {
		WebElement assunto = driver.findElement(By.xpath(".//input[@name='your-subject']"));
		return assunto;
	}
	
	public WebElement mensagemDoContato(WebDriver driver) {
		WebElement mensagem = driver.findElement(By.xpath(".//textarea[@name='your-message']"));
		return mensagem;
	}
	
	public WebElement enviarDoContato(WebDriver driver) {
		WebElement enviar = driver.findElement(By.xpath(".//input[@value='Enviar']"));
		return enviar;
	}
}

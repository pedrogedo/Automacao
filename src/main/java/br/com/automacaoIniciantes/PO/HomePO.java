package br.com.automacaoIniciantes.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePO {

	public WebElement homeYaman(WebDriver driver) {
		WebElement home = driver.findElement(By.xpath(".//a[contains(text(),'Yaman | Tecnologia LTDA')]"));
		return home;
	}
	
	public WebElement contato(WebDriver driver) {
		WebElement contato = driver.findElement(By.xpath(".//a[contains(text(),'Contato')]"));
		return contato;
	}
}

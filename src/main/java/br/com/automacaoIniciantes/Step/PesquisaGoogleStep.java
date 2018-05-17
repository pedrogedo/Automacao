package br.com.automacaoIniciantes.Step;

import org.openqa.selenium.WebDriver;

import br.com.automacaoIniciantes.Funcionalidade.ContatoFunc;
import br.com.automacaoIniciantes.Funcionalidade.HomeFunc;
import br.com.automacaoIniciantes.Funcionalidade.PesquisaGoogleFunc;
import br.com.automacaoIniciantes.Inicialização.AbrirBrowser;

public class PesquisaGoogleStep {
	
String siteGoogle = "https://www.google.com"; //Site que será aberto no browser.

public WebDriver driver;

	PesquisaGoogleFunc pesquisaFunc = new PesquisaGoogleFunc();
	AbrirBrowser abrirBrowser = new AbrirBrowser();
	ContatoFunc contatoFunc = new 	ContatoFunc();
	HomeFunc homeFunc = new HomeFunc();

	public void PesquisaGoogle() {
		driver = abrirBrowser.abrirNavegador(siteGoogle); //Função da classe AbrirBrowser
		pesquisaFunc.realizarPesquisaGoogle(driver); //Função da classe PesquisaFunc
		homeFunc.home(driver); //Função da classe HomeFunc
		contatoFunc.contato(driver); //Função da classe ContatoFunc
	}
}

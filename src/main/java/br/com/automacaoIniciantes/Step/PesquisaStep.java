package br.com.automacaoIniciantes.Step;

import org.openqa.selenium.WebDriver;

import br.com.automacaoIniciantes.Funcionalidade.ContatoFunc;
import br.com.automacaoIniciantes.Funcionalidade.HomeFunc;
import br.com.automacaoIniciantes.Funcionalidade.PesquisaFunc;
import br.com.automacaoIniciantes.Inicialização.AbrirBrowser;

public class PesquisaStep {
	
String siteGoogle = "https://www.google.com"; //Site que será aberto no browser.

public WebDriver driver;

	PesquisaFunc pesquisaFunc = new PesquisaFunc();
	AbrirBrowser abrirBrowser = new AbrirBrowser();
	ContatoFunc contatoFunc = new 	ContatoFunc();
	HomeFunc homeFunc = new HomeFunc();

	public void PesquisaGoogle() {
		driver = abrirBrowser.abrirNav(siteGoogle); //Função da classe AbrirBrowser
		pesquisaFunc.realizarBusca(driver); //Função da classe PesquisaFunc
		homeFunc.home(driver); //Função da classe HomeFunc
		contatoFunc.contato(driver); //Função da classe ContatoFunc
	}
}

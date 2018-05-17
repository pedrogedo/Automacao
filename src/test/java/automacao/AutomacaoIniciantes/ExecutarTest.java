package automacao.AutomacaoIniciantes;

import br.com.automacaoIniciantes.Step.PesquisaGoogleStep;

public class ExecutarTest {

	public static void main(String[] args) {
		PesquisaGoogleStep pesquisa = new PesquisaGoogleStep(); //Instanciando a classe PesquisaStep
		pesquisa.PesquisaGoogle(); //Função da classe PesquisaStep
	}
}

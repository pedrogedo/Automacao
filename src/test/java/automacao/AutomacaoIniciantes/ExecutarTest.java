package automacao.AutomacaoIniciantes;

import br.com.automacaoIniciantes.Step.PesquisaStep;

public class ExecutarTest {

	public static void main(String[] args) {
		PesquisaStep pesquisa = new PesquisaStep(); //Instanciando a classe PesquisaStep
		pesquisa.PesquisaGoogle(); //Função da classe PesquisaStep
	}
}

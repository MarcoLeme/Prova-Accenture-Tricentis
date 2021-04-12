package tests;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import elementos.ElementosWeb;
import pages.CotacaoVeiculo;
import pages.Metodos;

public class Steps extends Metodos {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	CotacaoVeiculo cotacao = new CotacaoVeiculo();

	@Dado("^que esteja no site \"([^\"]*)\" para informar dados do veiculo$")
	public void que_esteja_no_site_para_informar_dados_do_veiculo(String site) throws Throwable {
		metodos.abrirNavegador(site, "CHROME", "acessando a tela para realizar cotação");
	}

	@Quando("^informar os dados do veiculo$")
	public void informar_os_dados_do_veiculo() throws Throwable {
	cotacao.preencherDadosVeiculo("Honda", "Motorcycle", "Gas");
	metodos.pausa(4000, "esperando");
		
	}

	@Quando("^informar os dados do seguro$")
	public void informar_os_dados_do_seguro() throws Throwable {
		cotacao.preencherDadosSeguro("Marco", "Aurelio", "08/20/2000");
		metodos.pausa(5000, "esperando");
		
	}

	@Quando("^informar os dados do produto$")
	public void informar_os_dados_do_produto() throws Throwable {
		cotacao.preencherInformacoesProduto("09/10/2021", 10000000,"Bonus 1");
		
	}

	@Quando("^informar dados de price$")
	public void informar_dados_de_price() throws Throwable {
		cotacao.preencherPlano();
		
	}

	@Entao("^cotacao enviada$")
	public void cotacao_enviada() throws Throwable {
		cotacao.enviarCotacao();
		metodos.fecharBrowser("fechar");
		
	}

}

package pages;

import elementos.ElementosWeb;

import java.io.IOException;

public class CotacaoVeiculo {

	Metodos metodos = new Metodos();
	ElementosWeb elemento = new ElementosWeb();

	public void preencherDadosVeiculo(String marca, String model, String fuel) throws IOException {

		metodos.selecionarComboTexto(elemento.getMake(), marca, "selecionando  a marca do veiculo");
		metodos.selecionarComboTexto(elemento.getModel(), model, "selecionando  o modelo do veiculo");
		metodos.preencher(elemento.getCylindercapacity(), "100", "preenchendo o campo Cylindercapacity");
		metodos.preencher(elemento.getEngineperformance(), "100", "preenchendo desempenho do motor");
		metodos.preencher(elemento.getDateofmanufacture(), "01/09/2020", "data de fabricação");
		metodos.selecionarComboTexto(elemento.getNumberofseats(), "2", "selecionando a quantidade de assentos");
		metodos.clicar(elemento.getRighthanddriveyes(), "");
		metodos.selecionarComboTexto(elemento.getNumberofseatsmotorcycle(), "2", "selecionando qtd assentos motor");
		metodos.selecionarComboTexto(elemento.getFuel(), fuel, "selecionando o tipo de combustivel");
		metodos.preencher(elemento.getPayload(), "100", "preenchendo payload");
		metodos.preencher(elemento.getTotalweight(), "400", "preenchendo peso");
		metodos.preencher(elemento.getListprice(), "50000", "preenchendo preço");
		metodos.preencher(elemento.getLicenseplatenumber(), "0123456789", "preenchendo numero matricula");
		metodos.preencher(elemento.getAnnualmileage(), "120", "preenchendo milhagem anual");
		metodos.clicar(elemento.getNextenterinsurantdata(), "clicando em next");
		

	}

	public void preencherDadosSeguro(String firstName, String lastName, String bDay) throws IOException {
		metodos.preencher(elemento.getFirstname(), firstName, "preenchendo nome");
		metodos.preencher(elemento.getLastname(), lastName, "preenchendo sobrenome");
		metodos.preencher(elemento.getBirthdate(), bDay, "preenchendo aniversário");
		metodos.clicar(elemento.getGendermale(), "seleciona o sexo");
		metodos.preencher(elemento.getStreetaddress(), "Avenida Brasil", "preenchendo rua");
		metodos.selecionarComboTexto(elemento.getCountry(), "Brazil", "selecionando o país");
		metodos.preencher(elemento.getZipcode(), "01234567", "preenchendo CEP");
		metodos.preencher(elemento.getCity(), "São Paulo", "preenchendo Cidade");
		metodos.selecionarComboTexto(elemento.getOccupation(), "Employee", "selecionando ocupação profissional");
		metodos.clicar(elemento.getSkydiving(), "seleciona o hobbie");
		metodos.preencher(elemento.getWebsite(), "www.google.com", "preenchendo website");
		metodos.clicar(elemento.getNextenterproductdata(), "clicando em prosseguir");
		

	}
	
	public void preencherInformacoesProduto(String dataInicial, int insurance, String rating) throws IOException {
		metodos.preencher(elemento.getStartdate(), dataInicial, "preenchendo data inicio");
		metodos.selecionarComboPosicao(elemento.getInsurancesum(), 1, "seleciona o valor do seguro");
		metodos.selecionarComboPosicao(elemento.getMeritrating(), 2, "seleciona o rating");
		metodos.selecionarComboPosicao(elemento.getDamageinsurance(), 3, "seleciona seguro a danos");
		metodos.clicar(elemento.getOptionalproduct(), "seleciona opção de produto");
		metodos.selecionarComboPosicao(elemento.getCourtesycar(), 1, "seleciona opção de cortesia de carro");
		metodos.clicar(elemento.getNextselectpriceoption(), "clicando em prosseguir");
		
		
	}
	
	public void preencherPlano() throws IOException {
		metodos.clicar(elemento.getoptiongold(), "seleciona o plano");
		metodos.esperarClicavel(elemento.getNextsendquote(), "");
		metodos.clicar(elemento.getNextsendquote(), "clicando em prosseguir");
		
	}
	
	public void enviarCotacao() throws IOException {
		metodos.preencher(elemento.getEmail(), "marco.aurelio@accenture.com", "preenche o e-mail");
		metodos.preencher(elemento.getPhone(), "11912345678", "preenche o telefone");
		metodos.preencher(elemento.getUsername(), "Marco", "preenche o nome");
		metodos.preencher(elemento.getPassword(), "Marco123456", "preenche password");
		metodos.preencher(elemento.getConfirmpassword(), "Marco123456", "confirma password");
		metodos.preencher(elemento.getComments(), "Obrigado!", "preenche comentário");
		metodos.clicar(elemento.getSendemail(), "clicando no enviar");
		metodos.esperarClicavel(elemento.getValidamsg(), "espera o elemento se tornar clicavel");
		metodos.validarTexto(elemento.getValidamsg(), "Sending e-mail success!", "valida o conteudo da mensagem");
		metodos.screnShoot("evidência do cadastro concluido");
		metodos.clicar(elemento.getOkmsg(), "clica msg final");

	}

}

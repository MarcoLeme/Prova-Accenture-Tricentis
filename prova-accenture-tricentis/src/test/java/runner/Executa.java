package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// mostrar o caminho das features
		features = "src/test/resources/features/",
		// mostrar pacote est�o os steps para execu��o
		glue = "tests",
		//tags para direcionar a execu��o dos testes
		tags = "@allTest",
		// monchrome deixa mais limpo o console, sem trazer caracteres especiais
		monochrome = true,
		// Deixa os m�todos com padr�o da linguagem Java ao inv�s de underline 
		snippets = SnippetType.CAMELCASE,
		// n�o executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padr�o deixar false
		dryRun = false
		)

public class Executa {
	
	


}

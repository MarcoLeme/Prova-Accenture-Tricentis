package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// mostrar o caminho das features
		features = "src/test/resources/features/",
		// mostrar pacote estão os steps para execução
		glue = "tests",
		//tags para direcionar a execução dos testes
		tags = "@allTest",
		// monchrome deixa mais limpo o console, sem trazer caracteres especiais
		monochrome = true,
		// Deixa os métodos com padrão da linguagem Java ao invés de underline 
		snippets = SnippetType.CAMELCASE,
		// não executa o teste ele so valida o mapeamento se falta terminar alguma coisa, padrão deixar false
		dryRun = false
		)

public class Executa {
	
	


}

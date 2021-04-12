#language: pt
#Author: Marco Aurélio
@allTest
Funcionalidade: Cotacao de Carros
  Eu como usuario quero acessar o site para realizar uma cotacao de veiculo 

  Contexto: Acesar o site para cotacao
   Dado que esteja no site "http://sampleapp.tricentis.com/101/app.php" para informar dados do veiculo 
    
    
   @positivos
  Cenario: realizar cotacao de veiculo
    Quando informar os dados do veiculo
		E informar os dados do seguro
		E informar os dados do produto
		E informar dados de price
		Entao cotacao enviada


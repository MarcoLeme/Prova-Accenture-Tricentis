$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cotacao-veiculo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#Author: Marco Aur�lio"
    }
  ],
  "line": 4,
  "name": "Cotacao de Carros",
  "description": "Eu como usuario quero acessar o site para realizar uma cotacao de veiculo",
  "id": "cotacao-de-carros",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@allTest"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "Acesar o site para cotacao",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 8,
  "name": "que esteja no site \"http://sampleapp.tricentis.com/101/app.php\" para informar dados do veiculo",
  "keyword": "Dado "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sampleapp.tricentis.com/101/app.php",
      "offset": 20
    }
  ],
  "location": "Steps.que_esteja_no_site_para_informar_dados_do_veiculo(String)"
});
formatter.result({
  "duration": 6428914900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "realizar cotacao de veiculo",
  "description": "",
  "id": "cotacao-de-carros;realizar-cotacao-de-veiculo",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 11,
      "name": "@positivos"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "informar os dados do veiculo",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "informar os dados do seguro",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "informar os dados do produto",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "informar dados de price",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "cotacao enviada",
  "keyword": "Entao "
});
formatter.match({
  "location": "Steps.informar_os_dados_do_veiculo()"
});
formatter.result({
  "duration": 6531501700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.informar_os_dados_do_seguro()"
});
formatter.result({
  "duration": 7217603600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.informar_os_dados_do_produto()"
});
formatter.result({
  "duration": 1092436000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.informar_dados_de_price()"
});
formatter.result({
  "duration": 857745400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.cotacao_enviada()"
});
formatter.result({
  "duration": 11300377500,
  "status": "passed"
});
});
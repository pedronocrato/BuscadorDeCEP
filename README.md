# Buscador de CEP em Java

Bem-vindo ao meu repositório do **Buscador de CEP em Java**! 🚀 Este projeto é dedicado a demonstrar a construção de uma aplicação de console que consome uma API externa para buscar informações de endereço a partir de um CEP.

## Sobre

O objetivo deste repositório é aplicar e demonstrar conceitos práticos de programação em Java, incluindo:
- Consumo de APIs web (HTTP requests).
- Manipulação de dados no formato JSON (desserialização e serialização).
- Entrada de dados pelo console e interação com o usuário.
- Tratamento de exceções e gravação de arquivos.

A aplicação solicita um CEP, consulta a API [ViaCEP](https://viacep.com.br/), exibe o endereço completo e o salva em um arquivo `.json`.

## Funcionalidades Implementadas

- **Consulta à API ViaCEP**: Realiza uma requisição HTTP GET para obter os dados do endereço correspondente ao CEP informado.
- **Manipulação de JSON com Gson**: Converte a resposta JSON da API em um objeto Java (`record Endereco`) e, em seguida, salva este objeto em um arquivo formatado com `pretty printing`.
- **Persistência de Dados**: Gera um arquivo `.json` nomeado com o número do CEP consultado, contendo os dados do endereço.
- **Interação via Console**: Utiliza a classe `Scanner` para obter a entrada do usuário de forma interativa.

## Ferramentas e Tecnologias

- **Java 17 ou superior**: Linguagem de programação utilizada, aproveitando recursos como `Records` e o cliente HTTP nativo.
- **Gson**: Biblioteca do Google para conversão de objetos Java em JSON e vice-versa.
- **API ViaCEP**: Serviço web gratuito utilizado para a consulta de CEPs.
- **IDEs recomendadas**: [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [Eclipse](https://www.eclipse.org/).

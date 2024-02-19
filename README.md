# Sistema Zumbi

## Descrição do Projeto

O Sistema Zumbi é uma aplicação simples em Java para calcular e gerenciar os pagamentos de soldados e mercenários em uma luta contra zumbis. O sistema permite cadastrar diferentes tipos de combatentes, como fuzileiros, atiradores de elite e mercenários.

## Funcionalidades

- Cadastro de soldados (fuzileiros e atiradores de elite) e mercenários.
- Informação do número de zumbis mortos por soldados e mercenários.
- Cálculo da folha de pagamento total.

## Estrutura do Código

O código está organizado em três classes principais:

### Soldado

Representa um soldado genérico, com atributos como nome, idade, matrícula, tempo de serviço e salário bruto. Contém métodos para calcular a gratificação e o salário total.

#### Métodos:

- `calcularGratificacao()`: Calcula a gratificação do soldado com base no número de zumbis mortos.
- `calcularSalarioFixo()`: Calcula o salário fixo do soldado com base no tempo de serviço.
- `calcularSalarioTotal()`: Calcula o salário total do soldado somando a gratificação ao salário fixo.

### AtiradorDeElite

Herda de Soldado e adiciona um atributo para o ponto de precisão. Sobrescreve o método de calcular gratificação para incluir o adicional de precisão.

#### Métodos (além dos herdados de Soldado):

- `calcularGratificacao()`: Sobrescrito para incluir o adicional de precisão no cálculo da gratificação.

### Mercenario

Representa um mercenário, com o atributo para o número de zumbis mortos e um método para calcular a gratificação.

#### Métodos:

- `calcularGratificacao()`: Calcula a gratificação do mercenário com base no número de zumbis mortos.

### SistemaZumbi

A classe principal que contém o método main. Demonstra como criar instâncias de soldados e mercenários, atribuir o número de zumbis mortos e calcular a folha de pagamento total.

#### Métodos Principais:

- `calcularFolhaPagamento(Soldado... soldados)`: Calcula a folha de pagamento total somando os salários totais de todos os soldados passados como parâmetro.
- `main(String[] args)`: Ponto de entrada do programa, onde são criados soldados e mercenários, atribuídos os números de zumbis mortos e calculada a folha de pagamento total.

## Como Executar

Clone o repositório:

```bash
'git clone https://github.com/seu-usuario/SistemaZumbi.git'
 Abra o projeto em sua IDE favorita.

```Execute a classe SistemaZumbi.

```Veja os resultados no console.

#### Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests

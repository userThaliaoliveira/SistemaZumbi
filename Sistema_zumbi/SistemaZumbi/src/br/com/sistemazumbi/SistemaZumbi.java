package br.com.sistemazumbi;

import br.com.sistemazumbi.soldados.Soldado;
import br.com.sistemazumbi.soldados.AtiradorDeElite;
import br.com.sistemazumbi.mercenarios.Mercenario;

/**
 * Classe principal que simula um sistema de combate contra zumbis.
 */
public class SistemaZumbi {
    public static void main(String[] args) {
        // Criando um Soldado Fuzileiro e definindo alguns atributos
        Soldado fuzileiro = new Soldado("Fuzileiro", 25, 101, 2, 2000.0);
        fuzileiro.zumbisMortos = 20;

        // Criando um Atirador de Elite e definindo alguns atributos
        AtiradorDeElite atiradorElite = new AtiradorDeElite("Atirador Elite", 30, 102, 5, 3000.0, 8);
        atiradorElite.zumbisMortos = 15;

        // Criando um Mercenário e definindo a quantidade de zumbis mortos por ele
        Mercenario mercenario = new Mercenario();
        mercenario.setZumbisMortos(30);

        // Calculando a folha de pagamento total
        double folhaPagamento = calcularFolhaPagamento(fuzileiro, atiradorElite, mercenario);

        // Exibindo o resultado
        System.out.println("Folha de Pagamento Total: R$" + folhaPagamento);
    }

    /**
     * Método para calcular a folha de pagamento total, incluindo salários e gratificações.
     *
     * @param fuzileiro      Soldado Fuzileiro
     * @param atiradorElite  Atirador de Elite
     * @param mercenario     Mercenário
     * @return               Valor total da folha de pagamento
     */
    private static double calcularFolhaPagamento(Soldado fuzileiro, AtiradorDeElite atiradorElite, Mercenario mercenario) {
        double total = 0.0;

        // Calculando e exibindo o pagamento para o Fuzileiro
        double pagamentoFuzileiro = fuzileiro.calcularSalarioTotal();
        System.out.println("Pagamento para o Fuzileiro: R$" + pagamentoFuzileiro);
        total += pagamentoFuzileiro;

        // Calculando e exibindo o pagamento para o Atirador de Elite
        double pagamentoAtiradorElite = atiradorElite.calcularSalarioTotal();
        System.out.println("Pagamento para o Atirador de Elite: R$" + pagamentoAtiradorElite);
        total += pagamentoAtiradorElite;

        // Calculando e exibindo o pagamento para o Mercenário
        double pagamentoMercenario = mercenario.calcularGratificacao();
        System.out.println("Pagamento para o Mercenário: R$" + pagamentoMercenario);
        total += pagamentoMercenario;

        return total;
    }
}

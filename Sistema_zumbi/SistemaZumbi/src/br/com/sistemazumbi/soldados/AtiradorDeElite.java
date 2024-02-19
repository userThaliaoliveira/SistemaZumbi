package br.com.sistemazumbi.soldados;

/**
 * Classe que representa um Atirador de Elite, uma especialização de Soldado, no sistema de combate contra zumbis.
 */
public class AtiradorDeElite extends Soldado {
    private int pontoPrecisao;

    /**
     * Construtor que inicializa os atributos do Atirador de Elite.
     *
     * @param nome            Nome do Atirador de Elite
     * @param idade           Idade do Atirador de Elite
     * @param matricula       Número de matrícula do Atirador de Elite
     * @param tempoServico    Tempo de serviço do Atirador de Elite
     * @param salarioBruto    Salário bruto do Atirador de Elite
     * @param pontoPrecisao   Pontuação de precisão do Atirador de Elite
     */
    public AtiradorDeElite(String nome, int idade, int matricula, int tempoServico, double salarioBruto, int pontoPrecisao) {
        // Chamando o construtor da classe pai (Soldado)
        super(nome, idade, matricula, tempoServico, salarioBruto);
        this.pontoPrecisao = pontoPrecisao;
    }

    /**
     * Calcula a gratificação do Atirador de Elite, considerando a precisão e zumbis mortos.
     *
     * @return Valor da gratificação do Atirador de Elite
     */
    @Override
    public double calcularGratificacao() {
        // Gratificação padrão do Soldado mais 10% dos zumbis mortos e a pontuação de precisão multiplicada por 7.0
        return super.calcularGratificacao() + (45.0 * 0.10 * getZumbisMortos()) + (7.0 * pontoPrecisao);
    }
}

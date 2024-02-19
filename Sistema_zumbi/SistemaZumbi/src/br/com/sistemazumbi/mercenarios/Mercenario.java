package br.com.sistemazumbi.mercenarios;

/**
 * Classe que representa um Mercenário no sistema de combate contra zumbis.
 */
public class Mercenario {
    private int zumbisMortos;

    /**
     * Calcula a gratificação do Mercenário com base na quantidade de zumbis mortos.
     *
     * @return Valor da gratificação
     */
    public double calcularGratificacao() {
        // Gratificação: 10% do valor base (30.0) multiplicado pela quantidade de zumbis mortos multiplicado por 5.0
        return 30.0 * 0.10 * zumbisMortos * 5.0; 
    }

    /**
     * Obtém a quantidade de zumbis mortos pelo Mercenário.
     *
     * @return Quantidade de zumbis mortos
     */
    public int getZumbisMortos() {
        return zumbisMortos;
    }

    /**
     * Define a quantidade de zumbis mortos pelo Mercenário.
     *
     * @param zumbisMortos Quantidade de zumbis mortos
     */
    public void setZumbisMortos(int zumbisMortos) {
        this.zumbisMortos = zumbisMortos;
    }
}

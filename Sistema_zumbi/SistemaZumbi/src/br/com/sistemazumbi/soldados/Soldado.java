package br.com.sistemazumbi.soldados;

/**
 * Classe que representa um Soldado no sistema de combate contra zumbis.
 */
public class Soldado {
    protected String nome;
    protected int idade;
    protected int matricula;
    protected int tempoServico;
    protected double salarioBruto;
    public int zumbisMortos;

    /**
     * Construtor que inicializa os atributos do Soldado.
     *
     * @param nome           Nome do Soldado
     * @param idade          Idade do Soldado
     * @param matricula      Número de matrícula do Soldado
     * @param tempoServico   Tempo de serviço do Soldado
     * @param salarioBruto   Salário bruto do Soldado
     */
    public Soldado(String nome, int idade, int matricula, int tempoServico, double salarioBruto) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.tempoServico = tempoServico;
        this.salarioBruto = salarioBruto;
    }

    /**
     * Calcula a gratificação baseada na quantidade de zumbis mortos.
     *
     * @return Valor da gratificação
     */
    public double calcularGratificacao() {
        // Gratificação: 10% do valor base (45.0) multiplicado pela quantidade de zumbis mortos
        return 45.0 * 0.10 * getZumbisMortos();
    }

    /**
     * Calcula o salário fixo considerando o tempo de serviço.
     *
     * @return Valor do salário fixo
     */
    public double calcularSalarioFixo() {
        // Salário fixo: Salário bruto mais 3% do salário bruto por ano de serviço
        return salarioBruto + (tempoServico * 0.03 * salarioBruto);
    }

    /**
     * Calcula o salário total somando o salário fixo e a gratificação.
     *
     * @return Valor do salário total
     */
    public double calcularSalarioTotal() {
        return calcularSalarioFixo() + calcularGratificacao();
    }

    /**
     * Obtém a quantidade de zumbis mortos pelo Soldado.
     *
     * @return Quantidade de zumbis mortos
     */
    public int getZumbisMortos() {
        return zumbisMortos;
    }

    /**
     * Define a quantidade de zumbis mortos pelo Soldado.
     *
     * @param zumbisMortos Quantidade de zumbis mortos
     */
    public void setZumbisMortos(int zumbisMortos) {
        this.zumbisMortos = zumbisMortos;
    }
}

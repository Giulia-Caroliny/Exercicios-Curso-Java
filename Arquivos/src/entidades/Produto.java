/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author giuli
 */
public class Produto {

    private String nome;
    private double valor;
    private int quantidade;

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public Produto() {
    }

    /**
     * Construtor sobrecarregado - parâmetros: String, double e int
     *
     * @param nome String - nome do produto
     * @param valor double - valor do produto
     * @param quantidade int - quantidade de produtos
     */
    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    /**
     * Método get do atributo nome
     *
     * @return String - nome do proguto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método set do atributo nome
     *
     * @param nome String - nome a ser atribuido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método get do atributo valor
     *
     * @return double - valor do produto
     */
    public double getValor() {
        return valor;
    }

    /**
     * Método set do atributo valor
     *
     * @param valor double - valor a ser atribuido
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Método get do atributo quantidade
     *
     * @return int - quantidade do produto
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Método set do atributo quantidade
     *
     * @param quantidade int - quantidade a ser atribuida
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Método para pegar o montante do produto
     *
     * @return double - montante do produto
     */
    public double getValorTotal() {
        return valor * quantidade;
    }

}

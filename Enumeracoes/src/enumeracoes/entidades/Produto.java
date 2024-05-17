/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracoes.entidades;

/**
 *
 * @author giuli
 */
public class Produto {

    private String nome;
    private Double preco;

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public Produto() {
    }

    /**
     * Construtor sobrecarregado - Parâmetros: String e Double
     *
     * @param nome String - nome do produto
     * @param preco Double - preço unitário do produto
     */
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Método get do atributo nome
     *
     * @return String - nome do produto
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
     * Método get do atributo preço
     *
     * @return Double - preço do produto
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Método set do atributo preço
     *
     * @param preco Double - preço unitário a ser atribuido
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

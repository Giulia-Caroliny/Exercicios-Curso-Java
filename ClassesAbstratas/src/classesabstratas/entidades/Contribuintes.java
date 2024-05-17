/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstratas.entidades;

/**
 *
 * @author giuli
 */
public abstract class Contribuintes {

    private String nome;
    private Double renda;

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public Contribuintes() {
    }

    /**
     * Construtor sobrecarregado - Parâmetros: String e Double
     *
     * @param nome String - nome do contribuinte
     * @param renda Double - renda do contribuinte
     */
    public Contribuintes(String nome, Double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    /**
     * Método get do atributo nome
     *
     * @return String - nome do contribuinte
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
     * Método get do atributo renda
     *
     * @return Double - renda do contribuinte
     */
    public Double getRenda() {
        return renda;
    }

    /**
     * Método set do atributo renda
     *
     * @param renda Double - renda a ser atribuida
     */
    public void setRenda(Double renda) {
        this.renda = renda;
    }

    /**
     * Método abstrato - calcular imposto pago pelo contribuinte
     *
     * @return Double - imposto pago
     */
    public abstract Double imposto();

    @Override
    public String toString() {
        return nome + ": $ " + String.format("%.2f", imposto());
    }

}

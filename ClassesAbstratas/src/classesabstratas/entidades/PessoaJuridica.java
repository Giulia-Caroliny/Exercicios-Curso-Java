/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstratas.entidades;

/**
 *
 * @author giuli
 */
public class PessoaJuridica extends Contribuintes {

    private int numFuncionarios;

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public PessoaJuridica() {
    }

    /**
     * Construtor sobrecarregado - Parâmetros: int, String e Double
     *
     * @param numFuncionarios int - número de funcionários
     * @param nome String - nome da empresa
     * @param renda Double - renda da empresa
     */
    public PessoaJuridica(int numFuncionarios, String nome, Double renda) {
        super(nome, renda);
        this.numFuncionarios = numFuncionarios;
    }

    /**
     * Método get do atributo numFuncionários
     *
     * @return int - número de funcionário
     */
    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    /**
     * Método set do atributo numFuncionários
     *
     * @param numFuncionarios int - número de funcionários a ser atribuido
     */
    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    /**
     * Método sobrescrito - calcular o imposto pago pelo contribuinte
     *
     * @return Double - imposto pago pelo contribuinte
     */
    @Override
    public Double imposto() {
        if (numFuncionarios > 10) {
            return super.getRenda() * 0.14;
        }
        return super.getRenda() * 0.16;
    }

}

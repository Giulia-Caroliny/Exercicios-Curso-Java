/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstratas.entidades;

/**
 *
 * @author giuli
 */
public class PessoaFisica extends Contribuintes {

    private Double gastosSaude;

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public PessoaFisica() {
    }

    /**
     * Construtor sobrecarregado - Parâmetros: Double, String e Double
     *
     * @param gastosSaude Double - gastos despreendidos para a saúde
     * @param nome String - nome do contribuinte
     * @param renda Double - renda do contribuinte
     */
    public PessoaFisica(Double gastosSaude, String nome, Double renda) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }

    /**
     * Método get do atributo gastosSaúde
     *
     * @return Double - gastos despreendidos para a saúde
     */
    public Double getGastosSaude() {
        return gastosSaude;
    }

    /**
     * Método ser do atributo gastosSaúde
     *
     * @param gastosSaude Double - gastos a serem atribuidos
     */
    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    /**
     * Método sobrescrito - calcular imposto pago
     *
     * @return Double - imposto pago pelo contribuinte
     */
    @Override
    public Double imposto() {
        if (super.getRenda() < 20000) {
            return super.getRenda() * 0.15 - gastosSaude / 2;
        }
        return super.getRenda() * 0.25 - gastosSaude / 2;
    }
}

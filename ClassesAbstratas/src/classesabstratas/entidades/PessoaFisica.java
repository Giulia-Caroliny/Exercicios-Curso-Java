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

    public PessoaFisica() {
    }

    public PessoaFisica(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica(Double gastosSaude, String nome, Double renda) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        if (super.getRenda() < 20000) {
            return super.getRenda() * 0.15 - gastosSaude / 2;
        }
        return super.getRenda() * 0.25 - gastosSaude / 2;
    }
}

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

    public PessoaJuridica() {
    }

    public PessoaJuridica(int numFuncionarios, String nome, Double renda) {
        super(nome, renda);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double imposto() {
        if (numFuncionarios > 10) {
            return super.getRenda() * 0.14;
        }
        return super.getRenda() * 0.16;
    }

}

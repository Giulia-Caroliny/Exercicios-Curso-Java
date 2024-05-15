/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes2;

/**
 *
 * @author giuli
 */
public class Empregado {

    private String nome;
    private double salarioBruto;
    private double imposto;

    /**
     * Construtor
     *
     * @param nome
     * @param salarioBruto
     * @param imposto
     */
    public Empregado(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    /**
     * Método get do atributo nome
     *
     * @return String - nome do empregado
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método get do atributo salarioBruto
     *
     * @return double - salario bruto do empregado
     */
    public double getSalarioBruto() {
        return salarioBruto;
    }

    /**
     * Método get do atributo imposto
     *
     * @return double - imposto descontado do salário bruto
     */
    public double getImposto() {
        return imposto;
    }

    /**
     * Método para calcular o salario líquido
     *
     * @return double - salário líquido
     */
    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    /**
     * Método para aumentar o salário do empregado
     *
     * @param percentual Double - percentual de acréssimo ao salário
     */
    public void aumentarSalario(Double percentual) {
        salarioBruto += (salarioBruto * percentual / 100);
    }

    @Override
    public String toString() {
        return nome + ", $" + salarioLiquido();
    }

}

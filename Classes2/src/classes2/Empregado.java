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

    public Empregado(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }
    
    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    
    public void aumentarSalario(Double percentual){
        salarioBruto += (salarioBruto * percentual / 100);
    }

    @Override
    public String toString() {
        return nome + ", $" + salarioLiquido();
    }

    
}

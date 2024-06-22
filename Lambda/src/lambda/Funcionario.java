/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambda;

/**
 *
 * @author giuli
 */
class Funcionario implements Comparable<Funcionario> {

    private String nome;
    private String email;
    private double salario;

    public Funcionario(String nome, String email, double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public int compareTo(Funcionario outro) {
        return this.email.compareTo(outro.email);
    }
}

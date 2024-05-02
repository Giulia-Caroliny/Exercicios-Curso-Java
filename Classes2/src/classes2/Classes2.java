/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes2;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Classes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Salário bruto: ");
        double salario = sc.nextDouble();

        System.out.println("Imposto: ");
        double imposto = sc.nextDouble();

        Empregado empregado = new Empregado(nome, salario, imposto);

        System.out.println("Empregado: "
                + empregado);

        System.out.println("Portentagem de aumento do salário: ");
        empregado.aumentarSalario(sc.nextDouble());

        System.out.println("Salário atualizado: "
                + empregado);

        sc.close();
    }

}

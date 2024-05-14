/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesabstratas;

import classesabstratas.entidades.Contribuintes;
import classesabstratas.entidades.PessoaFisica;
import classesabstratas.entidades.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class ClassesAbstratas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contribuintes> lista = new ArrayList<>();

        System.out.println("Entre com o número de contribuintes: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            sc.nextLine();

            System.out.println("Dados do "
                    + i
                    + " contribuinte: ");

            System.out.println("Individual ou Compania (i/c): ");
            String op = sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Renda: ");
            Double renda = sc.nextDouble();

            if (op.equals("i")) {
                System.out.println("Gastos com saúde: ");
                Double gastos = sc.nextDouble();

                lista.add(new PessoaFisica(gastos, nome, renda));
            } else if (op.equals("c")) {
                System.out.println("Número de funcionários: ");
                int funcionarios = sc.nextInt();

                lista.add(new PessoaJuridica(funcionarios, nome, renda));
            }
        }

        Double total = 0.0;
        System.out.println("Imposto pago: ");
        for (Contribuintes cont : lista) {
            System.out.println(cont);
            total += cont.imposto();
        }

        System.out.println("Total: "
                + total);

        sc.close();
    }

}

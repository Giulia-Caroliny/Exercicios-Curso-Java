/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores2;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Vetores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar?");
        float[] vetor = new float[sc.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextFloat();
        }

        System.out.print("Valores: ");

        for (float i : vetor) {
            System.out.print(i + "  ");
        }
        
        System.out.println("");
        System.out.print("Soma: ");
        float soma = 0;
        for (float i : vetor) {
            soma += i;
        }
        System.out.println(soma);
        
        System.out.println("Média: "
                + soma/vetor.length);
        
        sc.close();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores3;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Vetores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter nos vetores:");
        int[] vetor1 = new int[sc.nextInt()];
        int[] vetor2 = new int[vetor1.length];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextInt();
        }

        System.out.println("Valor resultante: ");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i] + vetor2[i]);
        }
        sc.close();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores1;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Vetores1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números você vai digitar?");
        int[] vetor = new int[sc.nextInt()];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("Números negativos: ");
        
        for (int i : vetor) {
            if (i < 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
    
}

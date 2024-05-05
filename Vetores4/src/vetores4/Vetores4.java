/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores4;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Vetores4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        String[] nomes = new String[sc.nextInt()];
        int[] idades = new int[nomes.length];

        for (int i = 0; i < nomes.length; i++) {
            sc.nextLine();
            System.out.println("Insira os dados da "
                    + (i + 1)
                    + " pessoa: ");
            nomes[i] = sc.nextLine();
            idades[i] = sc.nextInt();
        }

        System.out.print("Pessoa mais velha: ");
        int pos = 0;
        int maior = 0;
        
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                pos = i;
            }
        }

        System.out.print(nomes[pos]);
        sc.close();
    }

}

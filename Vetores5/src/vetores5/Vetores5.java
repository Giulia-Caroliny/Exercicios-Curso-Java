/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores5;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Vetores5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas passoas você vai digitar? ");
        String[] genero = new String[sc.nextInt()];
        float[] altura = new float[genero.length];

        for (int i = 0; i < genero.length; i++) {
            System.out.print("Altura da "
                    + (i + 1)
                    + " pessoa: ");
            altura[i] = sc.nextFloat();

            sc.nextLine();

            System.out.print("Gênero da "
                    + (i + 1)
                    + " pessoa: ");
            genero[i] = sc.nextLine();
            System.out.println("");
        }

        float maior = 0;
        for (int i = 0; i < altura.length; i++) {
            maior = (altura[i] > maior) ? maior = altura[i] : maior;
        }

        float menor = altura[0];
        for (int i = 0; i < altura.length; i++) {
            menor = (altura[i] < menor) ? menor = altura[i] : menor;
        }
        
        float soma = 0;
        int f = 0;
        for (int i = 0; i < genero.length; i++) {
            if (genero[i].equals("F")) {
                System.out.println("entrou F");
                soma += altura[i];
                f++;
            }
        }
        
        int m = 0;
        for (int i = 0; i < genero.length; i++) {
            if (genero[i].equals("M")) {
                System.out.println("entrou M");
                m++;
            }
        }

        System.out.println("Menor altura: "
                + menor);
        System.out.println("Maior altura: "
                + maior);
        System.out.printf("Média das alturas das mulheres: %.2f", soma/f);
        System.out.println("\nNúmero de homens: "
                + m);
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Matrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número de linhas: ");
        int l = sc.nextInt();

        System.out.print("Insira o número de colunas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        System.out.println("Preencha a matriz:");

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = sc.nextInt();
            }
        }

        System.out.print("Insira um número: ");
        int pesq = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == pesq) {
                    System.out.println("Posição: " + i + ", " + j);
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}

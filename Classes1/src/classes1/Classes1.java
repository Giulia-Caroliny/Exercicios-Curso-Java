/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes1;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Classes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Largura:");
        double largura = sc.nextDouble();

        System.out.println("Altura:");
        double altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Área: "
                + retangulo.calcularArea());
        System.out.println("Área: "
                + retangulo.calcularPerimetro());
        System.out.println("Área: "
                + retangulo.calcularDiagonal());

        sc.close();
    }

}

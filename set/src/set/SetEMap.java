/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class SetEMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> usuarios = new HashSet<>();
        
        System.out.println("Quantidade de estudantes no curso A:");
        int quant = sc.nextInt();
        
        for (int i = 0; i < quant; i++) {
            usuarios.add(sc.nextInt());
        }
        
        System.out.println("Quantidade de estudantes no curso B:");
        quant = sc.nextInt();
        
        for (int i = 0; i < quant; i++) {
            usuarios.add(sc.nextInt());
        }
        
        System.out.println("Quantidade de estudantes no curso C:");
        quant = sc.nextInt();
        
        for (int i = 0; i < quant; i++) {
            usuarios.add(sc.nextInt());
        }
        
        System.out.println("Total de estudantes: "
                + usuarios.size());
        
        sc.close();
    }
    
}

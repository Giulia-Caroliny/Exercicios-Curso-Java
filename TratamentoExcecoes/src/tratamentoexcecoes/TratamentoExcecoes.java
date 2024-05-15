/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecoes;

import entidades.Conta;
import exceptions.ContaException;
import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class TratamentoExcecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com os dados da conta: ");
        System.out.println("Número: ");
        int num = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Titular: ");
        String titular = sc.nextLine();
        
        System.out.println("Saldo inicial: ");
        double saldo = sc.nextDouble();
        
        System.out.println("Limite de saque: ");
        double limite = sc.nextDouble();
        
        Conta conta = new Conta(num, titular, saldo, limite);
        
        System.out.println("");
        System.out.println("Valor de saque: ");
        double saque = sc.nextDouble();
        
        try {
            conta.saque(saque);
            System.out.println("Novo saldo: "
                    + conta.getSaldo());
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import programa.entidades.Contrato;
import programa.entidades.Parcelas;
import programa.servicos.ContratoServico;
import programa.servicos.PayPalService;

/**
 *
 * @author giuli
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                
        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy):");
        LocalDate dia = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor contrato: ");
        double valor = sc.nextDouble();
        System.out.print("Número de parcelas: ");
        int parcelas = sc.nextInt();
        
        Contrato contrato = new Contrato(num, dia, valor);
        ContratoServico cs = new ContratoServico(new PayPalService());
        
        cs.processarContrato(contrato, parcelas);
        
        System.out.println("Parcelas: ");
        contrato.getParcelas().forEach(System.out::println);
    }

}

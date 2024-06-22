/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salarioCorte = scanner.nextDouble();
        scanner.close();

        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                String nome = partes[0];
                String email = partes[1];
                double salario = Double.parseDouble(partes[2]);
                funcionarios.add(new Funcionario(nome, email, salario));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        List<String> emails = new ArrayList<>();
        double somaSalariosM = 0.0;

        for (Funcionario f : funcionarios) {
            if (f.getSalario() > salarioCorte) {
                emails.add(f.getEmail());
            }
            if (f.getNome().startsWith("M")) {
                somaSalariosM += f.getSalario();
            }
        }

        Collections.sort(emails);

        System.out.println("Email of people whose salary is more than " + salarioCorte + ":");
        for (String email : emails) {
            System.out.println(email);
        }

        System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", somaSalariosM));
    }

}

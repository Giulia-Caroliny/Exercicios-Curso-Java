/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arquivos;

import entidades.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     * @see Produto
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Produto> prod = new ArrayList<>();

        System.out.println("Entre com o caminho do arquivo: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            String line = br.readLine();

            while (line != null) {
                String[] produtos = line.split(",");
                String nome = produtos[0];
                double valor = Double.parseDouble(produtos[1]);
                int quantidade = Integer.parseInt(produtos[2]);

                prod.add(new Produto(nome, valor, quantidade));

                line = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Produto produto : prod) {
                    bw.write(produto.getNome() + ","
                            + String.format("%.2f", produto.getValorTotal()));
                    bw.newLine();
                }

                System.out.println("Arquivo Criado!");

            } catch (IOException e) {
                System.out.println("Erro ao criar o arquivo: " + e.getMessage());

            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herancaepolimorfismo;

import entidades.ProdutoUsado;
import entidades.ProdutoImportado;
import entidades.Produto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class HerancaEPolimorfismo {

    /**
     * @param args the command line arguments
     * @see Produto
     * @see ProdutoImportado
     * @see ProdutoUsado
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com o número de produtos: ");
        int num = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= num; i++) {
            System.out.println("Dados do "
                    + i
                    + " produto: ");
            System.out.println("Comum, usado ou importado (c/u/i): ");
            String op = sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Preço: ");
            Double preco = sc.nextDouble();

            switch (op) {
                case "c":
                    lista.add(new Produto(nome, preco));
                    break;
                case "u":
                    sc.nextLine();
                    System.out.println("Data de frabicação: ");
                    String data = sc.nextLine();

                    lista.add(new ProdutoUsado(LocalDate.parse(data, fmt), nome, preco));
                    break;
                case "i":
                    System.out.println("Taxa de alfândega: ");
                    Double taxa = sc.nextDouble();

                    lista.add(new ProdutoImportado(nome, preco, taxa));
                    break;
            }
        }

        System.out.println("Etiquetas: ");
        for (Produto produto : lista) {
            System.out.println(produto.etiqueta());
        }

        sc.close();
    }

}

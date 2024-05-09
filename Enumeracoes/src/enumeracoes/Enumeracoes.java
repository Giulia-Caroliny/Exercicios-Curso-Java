/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumeracoes;

import enumeracoes.entidades.Cliente;
import enumeracoes.entidades.Pedido;
import enumeracoes.entidades.PedidoItem;
import enumeracoes.entidades.Produto;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Enumeracoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente:");
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("E-mail: ");
        String email = sc.nextLine();

        Cliente c1 = new Cliente(nome, email);
        Pedido pedido = new Pedido(new Date(), c1);

        System.out.println("Entre com os dados do pedido:");
        System.out.println("Quantos itens serão pedidos:");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            sc.nextLine();

            System.out.println("Entre com os dados do "
                    + (i + 1)
                    + " pedido:");
            System.out.println("Nome do produto:");
            String nomeProd = sc.nextLine();

            System.out.println("Preço do produto:");
            double preco = sc.nextDouble();

            System.out.println("Quantidade:");
            int quant = sc.nextInt();

            pedido.addItem(new PedidoItem(quant, new Produto(nomeProd, preco)));
        }

        System.out.println("Resumo do pedido:");
        System.out.println("Instante do pedido: "
                + pedido.getMomento());
        System.out.println("Status do pedido: "
                + pedido.getStatus());
        System.out.println("Cliente: "
                + pedido.getCliente());
        System.out.println("Itens do pedido: ");
        for (PedidoItem x : pedido.getItens()) {
            System.out.println(x);
        }
        System.out.println("Preço total: "
                + pedido.total());

        sc.close();
    }

}

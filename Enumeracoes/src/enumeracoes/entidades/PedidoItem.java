/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracoes.entidades;

/**
 *
 * @author giuli
 */
public class PedidoItem {

    private Integer quantidade;
    private Double preco;

    private Produto produto;

    public PedidoItem() {
    }

    public PedidoItem(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.preco = produto.getPreco();
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "" + produto.getNome() + ", " + preco + ", quantidade: " + quantidade + ", subtotal: " + subTotal();
    }

}

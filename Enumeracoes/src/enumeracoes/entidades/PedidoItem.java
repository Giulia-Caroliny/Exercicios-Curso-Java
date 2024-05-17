/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracoes.entidades;

/**
 *
 * @author giuli
 * @see Produto
 */
public class PedidoItem {

    private Integer quantidade;
    private Double preco;

    private Produto produto;

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public PedidoItem() {
    }

    /**
     * Construtor sobrecarregado - Parâmetros: Integer e Produto
     *
     * @param quantidade Integer - quantidade de produtos
     * @param produto Produto - é um produto
     */
    public PedidoItem(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.preco = produto.getPreco();
        this.produto = produto;
    }

    /**
     * Método get do atributo quantidade
     *
     * @return Integer - quantidade do item de pedido
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * Método set do atributo quantidade
     *
     * @param quantidade Integer - quantidade do item pedido a ser atribuido
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Método get do atributo preço
     *
     * @return Double - preço do item unitário
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * Método set do atributo preço
     *
     * @param preco Double - preço do item pedido a ser atribuido
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    /**
     * Método get do atributo produtoo
     *
     * @return Produto - produto do item pedido
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Método set do atributo produto
     *
     * @param produto Produto - produto a ser atribuido
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * Método para calcular o subtotal do pedido, total do item pedido
     *
     * @return Double - subtotal do pedido
     */
    public Double subTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "" + produto.getNome() + ", " + preco + ", quantidade: " + quantidade + ", subtotal: " + subTotal();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author giuli
 */
public class ProdutoImportado extends Produto {

    private Double taxaAlfandega;

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public ProdutoImportado() {
    }

    /**
     * Construtor sobrecarregado - parâmetros: String, Double e Double
     *
     * @param nome String - nome do produto
     * @param preco Double - preço do produto
     * @param taxaAlfandega Double - taxa/imposto da alfândega
     */
    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    /**
     * Método get do atributo taxaAlfandega
     *
     * @return Double - taxa/imposto da alfândega
     */
    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    /**
     * Método set do atributo taxaAlfandega
     *
     * @param taxaAlfandega Double - taxa/imposto da alfândega a ser atribuido
     */
    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    /**
     * Método para calcular o preço total do Produto Importado
     *
     * @return Double - preço do produto acrescido da taxa/imposto da alfândega
     */
    public Double precoTotal() {
        return super.getPreco() + taxaAlfandega;
    }

    /**
     * Método sobrescrito - Método para imprimir a etiqueta do produto
     *
     * @return String - nome, preço total e taxa da alfândega
     */
    @Override
    public String etiqueta() {
        return super.getNome() + " $ " + precoTotal() + "(Taxa da alfândega: $ " + taxaAlfandega + ")";
    }
}

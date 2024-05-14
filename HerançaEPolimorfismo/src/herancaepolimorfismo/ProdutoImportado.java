/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaepolimorfismo;

/**
 *
 * @author giuli
 */
public class ProdutoImportado extends Produto {
    
    private Double taxaAlfandega;

    public ProdutoImportado() {
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
    
    public Double precoTotal(){
        return super.getPreco() + taxaAlfandega;
    }
    
    @Override
    public String etiqueta(){
        return super.getNome() + " $ " + precoTotal() + "(Taxa da alfândega: $ " + taxaAlfandega + ")";
    }
}

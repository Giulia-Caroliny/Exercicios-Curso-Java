/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author giuli
 */
public class ProdutoUsado extends Produto {

    private LocalDate dataFabricacao;

    /**
     * Contrutor sobrecarregado sem parâmetros
     */
    public ProdutoUsado() {
    }

    /**
     * Construtor sobrecarregado - parâmetros: LocalDate, String e Double
     *
     * @param dataFabricacao LocalDate - data de fabricação do produto usado
     * @param nome String - nome do produto
     * @param preco Double - preço do produto
     */
    public ProdutoUsado(LocalDate dataFabricacao, String nome, Double preco) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    /**
     * Método get do atributo dataFabricacao
     *
     * @return LocalDate - data de fabricação do produto
     */
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    /**
     * Método set do atributo dataFabricacao
     *
     * @param dataFabricacao LocalDate - data de fabricação a ser atribuida
     */
    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    /**
     * Método sobrescrito - Método para imprimir a etiqueta do produto
     *
     * @return String - nome, preço e data de fabricação
     */
    @Override
    public String etiqueta() {
        return super.getNome() + " (Usado) $ " + super.getPreco() + " (Data de fabricação: " + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}

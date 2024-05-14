/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herancaepolimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author giuli
 */
public class ProdutoUsado extends Produto {

    private LocalDate dataFabricacao;

    public ProdutoUsado() {
    }

    public ProdutoUsado(LocalDate dataFabricacao, String nome, Double preco) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiqueta() {
        return super.getNome() + " (Usado) $ " + super.getPreco() + " (Data de fabricação: " + dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}

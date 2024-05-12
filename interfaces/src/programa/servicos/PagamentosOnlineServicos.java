/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package programa.servicos;

/**
 *
 * @author giuli
 */
public interface PagamentosOnlineServicos {

    public Double jurosMensal(Double montante, int meses);

    public Double taxaPagamento(Double montante);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.servicos;

import java.time.LocalDate;
import programa.entidades.Contrato;
import programa.entidades.Parcelas;

/**
 *
 * @author giuli
 * @see PagamentosOnlineServicos
 * @see Contrato
 */
public class ContratoServico {

    private PagamentosOnlineServicos servicos;

    /**
     * Construtor - Parâmetros: PagamentosOnlineServicos
     *
     * @param servicos PagamentosOnlineServicos - interface para serviços de
     * pagamentos online
     */
    public ContratoServico(PagamentosOnlineServicos servicos) {
        this.servicos = servicos;
    }

    /**
     * Método para processar o contrato calculando suas parcelas
     *
     * @param contrato Contrato - contrato a ser processado
     * @param numParcelas int - número de parcelas a serem criadas
     */
    public void processarContrato(Contrato contrato, Integer numParcelas) {

        for (int i = 1; i <= numParcelas; i++) {
            Double comJuros = servicos.jurosMensal(contrato.getValorTotal() / numParcelas, i);
            Double comTaxaPagamento = servicos.taxaPagamento(comJuros);
            LocalDate vencimento = contrato.getData().plusMonths(i);
            contrato.getParcelas().add(new Parcelas(vencimento, comTaxaPagamento));
        }
    }
}

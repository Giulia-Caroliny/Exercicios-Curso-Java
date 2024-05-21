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

    /**
     * Método para aplicar o juros mensal na parcela
     * @param montante Double - valor do montante do contrato
     * @param meses int - mês da parcela
     * @return Double - juros da parcela do mês
     */
    public Double jurosMensal(Double montante, int meses);

    /**
     * Método para aplicar a taxa pelo serviço de pagamento
     * @param montante Double - valor do montante do contrato
     * @return Double - valor do montante acrescido da taxa de pagamento
     */
    public Double taxaPagamento(Double montante);
}

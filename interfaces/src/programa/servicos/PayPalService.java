/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.servicos;

/**
 *
 * @author giuli
 */
public class PayPalService implements PagamentosOnlineServicos{

    @Override
    public Double jurosMensal(Double montante, int meses) {
        return (montante + (montante * 0.01 * meses));
    }

    @Override
    public Double taxaPagamento(Double montante) {
        return montante + (montante * 0.02);
    }
    
}

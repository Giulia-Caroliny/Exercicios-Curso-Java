/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author giuli
 */
public class Parcelas {
    
    private LocalDate vencimento;
    private Double montante;

    public Parcelas(LocalDate vencimento, Double montante) {
        this.vencimento = vencimento;
        this.montante = montante;
    }

    public LocalDate getData() {
        return vencimento;
    }

    public void setData(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public Double getMontante() {
        return montante;
    }

    public void setMontante(Double montante) {
        this.montante = montante;
    }

    @Override
    public String toString() {
        return "" + vencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + montante;
    }
    
    
}

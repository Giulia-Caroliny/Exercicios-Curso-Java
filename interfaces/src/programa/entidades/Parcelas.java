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

    /**
     * Construtor - parâmetros: LocalDate e Double
     *
     * @param vencimento LocalDate - data de vencimento da parcela
     * @param montante Double - valor do montante
     */
    public Parcelas(LocalDate vencimento, Double montante) {
        this.vencimento = vencimento;
        this.montante = montante;
    }

    /**
     * Método get do atributo Data
     *
     * @return LocalDate - data de vencimento da parcela
     */
    public LocalDate getData() {
        return vencimento;
    }

    /**
     * Método set do atributo Data
     *
     * @param vencimento LocalDate - data a ser atribuída
     */
    public void setData(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    /**
     * Método get do atributo montante
     *
     * @return Double - valor do montante
     */
    public Double getMontante() {
        return montante;
    }

    /**
     * Método set do atributo montante
     *
     * @param montante Double - valor do montante a ser atribuído
     */
    public void setMontante(Double montante) {
        this.montante = montante;
    }

    @Override
    public String toString() {
        return "" + vencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + montante;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giuli
 * @see Parcelas
 */
public class Contrato {

    private Integer numContrato;
    private LocalDate data;
    private Double valorTotal;

    private List<Parcelas> parcelas = new ArrayList<Parcelas>();

    /**
     * Construtor - Parâmetros: int, LocalDate e Double
     *
     * @param numContrato int - número do contrato
     * @param data LocalDate - data do contrato
     * @param valorTotal Double - valor total do contrato
     */
    public Contrato(int numContrato, LocalDate data, Double valorTotal) {
        this.numContrato = numContrato;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    /**
     * Método get do atributo numParcelas
     *
     * @return int - número de parcelas
     */
    public int getNumParcelas() {
        return numContrato;
    }

    /**
     * Método get do atributo data
     *
     * @return LocalDate - data do contrato
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Método get do atributo valorTotal
     *
     * @return Double - valor total do contrato
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * Método get do atributo parcelas
     *
     * @return List (parcelas) - parcelas do contrato
     */
    public List<Parcelas> getParcelas() {
        return parcelas;
    }

}

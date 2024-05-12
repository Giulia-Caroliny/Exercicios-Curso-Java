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
 */
public class Contrato {

    private Integer numContrato;
    private LocalDate data;
    private Double valorTotal;

    private List<Parcelas> parcelas = new ArrayList<Parcelas>();

    public Contrato(int numContrato, LocalDate data, Double valorTotal) {
        this.numContrato = numContrato;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public int getNumParcelas() {
        return numContrato;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

}

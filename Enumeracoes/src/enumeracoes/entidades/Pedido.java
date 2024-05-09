/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracoes.entidades;

import enumeracoes.enums.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author giuli
 */
public class Pedido {

    private Date momento;
    private Status status;

    private Cliente cliente;

    private List<PedidoItem> itens = new ArrayList<PedidoItem>();

    public Pedido() {
    }

    public Pedido(Date momento, Cliente cliente) {
        this.momento = momento;
        this.status = Status.PROCESSANDO;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void addItem(PedidoItem item) {
        itens.add(item);
    }

    public void removerItem(PedidoItem item) {
        if (itens.contains(item)) {
            itens.remove(item);
        }
    }

    public Double total() {
        double soma = 0.0;
        for (PedidoItem x : itens) {
            soma += x.subTotal();
        }
        return soma;
    }
}

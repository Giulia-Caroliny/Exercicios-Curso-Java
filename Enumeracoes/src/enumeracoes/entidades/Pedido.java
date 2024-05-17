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
 * @see Cliente
 * @see PedidoItem
 */
public class Pedido {

    private Date momento;
    private Status status;

    private Cliente cliente;

    private List<PedidoItem> itens = new ArrayList<PedidoItem>();

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public Pedido() {
    }

    /**
     * Construtor sobrecarregado - Parâmetros: Date e Cliente
     *
     * @param momento Date - data da realização do pedido
     * @param cliente Cliente - cliente que realizou o pedido
     */
    public Pedido(Date momento, Cliente cliente) {
        this.momento = momento;
        this.status = Status.PROCESSANDO;
        this.cliente = cliente;
    }

    /**
     * Método get do atributo momento
     *
     * @return Date - data da realização do pedido
     */
    public Date getMomento() {
        return momento;
    }

    /**
     * Método set do atributo momento
     *
     * @param momento Date - data do pedido a ser atribuida
     */
    public void setMomento(Date momento) {
        this.momento = momento;
    }

    /**
     * Método get do atributo status
     *
     * @return Status (Enum) - status do pedido
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Método set do atributo status
     *
     * @param status Status (Enum) - status a ser atribuido
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Método get do atributo cliente
     *
     * @return Cliente - cliente que realizou o pedido
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método set do atributo cliente
     *
     * @param cliente Cliente - cliente a ser atribuido
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método get do atributo itens
     *
     * @return List PedidoItem - lista com os itens do pedido
     */
    public List<PedidoItem> getItens() {
        return itens;
    }

    /**
     * Método para adicionar um item à lista de itens do pedido
     *
     * @param item PedidoItem - item do pedido a ser adicionado
     */
    public void addItem(PedidoItem item) {
        itens.add(item);
    }

    /**
     * Método para remover um item da lista de intes do pedido
     *
     * @param item PedidoItem - item do pedido a ser removido
     */
    public void removerItem(PedidoItem item) {
        if (itens.contains(item)) {
            itens.remove(item);
        }
    }

    /**
     * Método para calcular o valor total do pedido
     *
     * @return Double - valor total do pedido
     */
    public Double total() {
        double soma = 0.0;
        for (PedidoItem x : itens) {
            soma += x.subTotal();
        }
        return soma;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import exceptions.ContaException;

/**
 *
 * @author giuli
 * @see ContaException
 */
public class Conta {

    private Integer conta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    /**
     * Construtor sobrecarregado sem parâmetros
     */
    public Conta() {
    }

    /**
     * Construtor sobrecarregado - Parâmetros: Integer, String, Double e Double
     *
     * @param conta Integer - número da conta
     * @param titular String - nome do titular da conta
     * @param saldo Double - saldo da conta
     * @param limiteSaque Double - limite disponível para saque
     */
    public Conta(Integer conta, String titular, Double saldo, Double limiteSaque) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    /**
     * Método get do atributo Conta
     *
     * @return Integer - número da conta
     */
    public Integer getConta() {
        return conta;
    }

    /**
     * Método set do atributo conta
     *
     * @param conta Integer - número da conta a ser atribuída
     */
    public void setConta(Integer conta) {
        this.conta = conta;
    }

    /**
     * Método get do atributo titular
     *
     * @return String - nome do titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Método set do atributo titular
     *
     * @param titular String - nome a ser atribuído
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Método get do atributo saldo
     *
     * @return Double - saldo da conta
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * Método set do atributo
     *
     * @param saldo Double - saldo a ser atribuído
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método get do atributo limiteSaque
     *
     * @return Double - limite de saque disponível da conta
     */
    public Double getLimiteSaque() {
        return limiteSaque;
    }

    /**
     * Método set do atributo limiteSaque
     *
     * @param limiteSaque Double - limite de saque a ser atribuído
     */
    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    /**
     * Método para fazer o depósito na conta
     *
     * @param valor Double - valor do depósito
     */
    public void deposito(Double valor) {
        saldo += valor;
    }

    /**
     * Método para fazer o saque na conta
     *
     * @param valor Double - valor do saque
     */
    public void saque(Double valor) {
        if (valor > getLimiteSaque()) {
            throw new ContaException("Erro ao realizar o saque: o valor excede ao limite de saque.");
        }
        if (valor > getSaldo()) {
            throw new ContaException("Erro ao realizar o saque: sem saldo disponível.");
        }
        saldo -= valor;
    }

}

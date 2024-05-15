/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import exceptions.ContaException;

/**
 *
 * @author giuli
 */
public class Conta {
    
    private Integer conta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer conta, String titular, Double saldo, Double limiteSaque) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }
    
    public void deposito(Double valor){
        saldo += valor;
    }
    
    public void saque(Double valor){
        if (valor > getLimiteSaque()) {
            throw new ContaException("Erro ao realizar o saque: o valor excede ao limite de saque.");
        }
        if (valor > getSaldo()) {
            throw new ContaException("Erro ao realizar o saque: sem saldo disponível.");
        }
        saldo -= valor;
    }
    
}

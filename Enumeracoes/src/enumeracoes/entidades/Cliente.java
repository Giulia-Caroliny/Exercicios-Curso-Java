/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracoes.entidades;

/**
 *
 * @author giuli
 */
public class Cliente {

    private String nome;
    private String email;

    /**
     * Construtor sobbrecarregado sem parâmetros
     */
    public Cliente() {
    }

    /**
     * Construtor sobrecarregado - Parâmetros: String e String
     *
     * @param nome String - nome do cliente
     * @param email String - e-mail do cliente
     */
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    /**
     * Método get do atributo nome
     *
     * @return String - nome do cliente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método set do atributo nome
     *
     * @param nome String - nome a ser atribuido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método get do atributo email
     *
     * @return String - email do cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método set do atributo email
     *
     * @param email String - email a ser atribuido
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + " " + email;
    }

}

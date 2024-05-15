/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes1;

/**
 * Classe Retângulo
 *
 * @author giuli
 *
 */
public class Retangulo {

    private double largura;
    private double altura;

    /**
     * Construtor
     *
     * @param largura
     * @param altura
     */
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    /**
     * Método get do atributo largura
     *
     * @return double - largura do triangulo
     */
    public double getLargura() {
        return largura;
    }

    /**
     * Método set do atriburo largura
     *
     * @param largura double - largura a ser atribuida
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * Método get do atributo altura
     *
     * @return double - altura do triangulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método set do atriburo altura
     *
     * @param altura double - altura a ser atribuida
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula a área do retângulo
     *
     * @return double - área do retângulo
     */
    public double calcularArea() {
        return largura * altura;
    }

    /**
     * Calcular a área do perímetro
     *
     * @return double - Perímetro do retângulo
     */
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    /**
     * Calcular a diagonal
     *
     * @return double - diagonal do retângulo
     */
    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }

}

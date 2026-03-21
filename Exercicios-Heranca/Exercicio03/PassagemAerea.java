/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author lucas
 */
public class PassagemAerea {
    private double preco;
    
    public PassagemAerea(){
        preco=1000;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void imprimeValor(){
        System.out.println("\nValor da passagen: " + preco);
    }
    
}

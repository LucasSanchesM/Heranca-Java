package main;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    
    public ContaBancaria(){
        saldo = 0;
    }
    
    
    //Metodos a mais, controle de conta...
    public void setNumero(int entraNumero){
        this.numero = entraNumero;
    }
    public int getNumero(){
        return this.numero;
    }
    
    public void setTitular(String entraTitular){
        this.titular = entraTitular;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    
    //metodo principais: sacar, depositar e ver saldo 
    public void depositar(double entraSaldo){
        if(entraSaldo<0){
            //para evitar vslores de deposito negativo
            System.out.println("Valor de deposito invalido");
        }
        else{
            this.saldo += entraSaldo;
        }
    }
    public void sacar(double saiSaldo){
        this.saldo -= saiSaldo;
    }
    public double verSaldo(){
        return this.saldo;
    }
    
}

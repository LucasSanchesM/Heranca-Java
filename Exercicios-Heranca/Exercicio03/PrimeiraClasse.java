package main;

public class PrimeiraClasse extends PassagemAerea{
    private double adicional;
    
    public PrimeiraClasse(){
        adicional = 1000;
    }
    public double passagemPrimeiraClasse(){
         return adicional+super.getPreco();
    }
    
}

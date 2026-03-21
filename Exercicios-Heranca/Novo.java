package main;
public class Novo extends Carro{
    private double adicional;
    
    public void setAdicional(double entraAdd){
        this.adicional= entraAdd;
    }
    public double getAdicional(){
        return this.adicional;
    }
    
    public void imprimirPrecoFinal(){
        System.out.printf("\nO preço com o adicional(seguro) ficará: %.2f", super.getPreco()+adicional);
    }
}

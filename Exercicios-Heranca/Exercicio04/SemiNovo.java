package main;

public class SemiNovo extends Carro{
    private double desconto;
    
    public void setDesconto(double entraDesconto){
        this.desconto= entraDesconto;
    }
    private double getDesconto(){
        return this.desconto;
    }
    
    public void impressaoPrecoFinal(){
        System.out.printf("\nO carro SemiNovo custará o seguinte valor (desconto devido ipva): %.2f", super.getPreco()-desconto);
    }
}

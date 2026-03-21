package main;

public class ClasseExecutiva extends PassagemAerea {
    private int poltrona;
    
    public void setPoltrona(int entraPoltrona){
        this.poltrona = entraPoltrona;
    }
    
    public void classeExecutiva(){
        System.out.printf("\nTipo:Classe Executiva\nValor: %.2f\nPoltrona: %d\n", super.getPreco(), poltrona);
    }
}

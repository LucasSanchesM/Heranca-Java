package main;
public class ClasseEconomica extends PassagemAerea{

    public void classeEconomica(){
        System.out.printf("\nTipo: Classe economica\nValor: %.2f\nPoltrona: 12 (Disponivel apenas para Classe Executiva)", super.getPreco());
    }
}

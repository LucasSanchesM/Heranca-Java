package main;

public class Pessoa {
    private String nome;
    private int idade;
    
    public void setNome(String entraNome){
        this.nome = entraNome;
    }
    
    public String getNome(){
        return this.nome;
        
    }
    
    public void setIdade(int entraIdade){
        this.idade = entraIdade;
        
    }
    
    public int getIdade(){
        return this.idade;
    }
}

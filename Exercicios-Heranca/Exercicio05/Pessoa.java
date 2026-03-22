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
    
    public void falar(){
        System.out.printf("\nOi meu nome eh %s e eu tenho %d anos", this.nome, this.idade);
    }
}

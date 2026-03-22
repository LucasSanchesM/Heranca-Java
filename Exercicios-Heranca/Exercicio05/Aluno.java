package main;

public class Aluno extends Pessoa {
    private String curso;
    
    public void setCurso(String entraCurso){
        this.curso = entraCurso;
    }
    public String getCurso(){
        return this.curso;
    }
    //Override como boa pratica
    @Override
    public void falar(){
        System.out.printf("\nOla, meu nome e %s, sou do curso de %s e tenho  %d anos", super.getNome(), this.curso, super.getIdade());
        
    }
}

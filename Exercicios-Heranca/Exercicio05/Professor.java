package main;

public class Professor extends Pessoa{
    private String disciplina;
    
    public void setDisciplina(String entraDisciplina){
        this.disciplina= entraDisciplina;
    }
    public String getDisciplina(){
        return this.disciplina;
    }
    //Override como boa pratica
    @Override
    public void falar(){
        System.out.printf("\nOla, meu nome eh %s, tenho  %d anos e leciono %s", super.getNome(), super.getIdade(), this.disciplina);
    }
}

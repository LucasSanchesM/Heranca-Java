package main;

public class Programador extends Funcionario{
    private String linguagem;
    
    public void setLinguagem(String entraLinguagem){
        this.linguagem = entraLinguagem;
    }
    
    public String getLinguagem(){
        return this.linguagem;
    }
    @Override
    public double calcular_salario(){
        return super.getSalarioB()+(super.getSalarioB()*0.20);
    }
    
}

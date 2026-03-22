package main;

public class Gerente extends Funcionario{
    private String departamento;
    
    public void setDepartamento(String entraDepartamento){
        this.departamento= entraDepartamento;
    }
    public String getDepartamento(){
        return this.departamento;
    }
    
    @Override
    public double calcular_salario(){
        return super.getSalarioB()+(super.getSalarioB()*0.10);
    }
}

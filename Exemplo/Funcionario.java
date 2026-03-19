package heranca;

public class Funcionario {
    //definição de atributo
    private String nome;
    private double salario;
    
    
    public void setNome(String entraNome){
        //metodo para definir nome
        this.nome=entraNome;
    }
    
    public String getNome(){
        //metodo para obter nome
        return this.nome;
    }
    
    public void setSalario(int entraSalario){
        //metodo para definir salario
        this.salario= entraSalario;
    }
    public double getSalario(){
        //metodo para obter salario
        return this.salario;
    }
    public double calculeBeneficio(){
        //metodo de calculo de beneficio
        return this.salario * 0.1;
    }
}

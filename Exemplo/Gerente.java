package heranca;
//irá herdar atributos e metodos de funcionario
public class Gerente extends Funcionario{
    //declaração de atributos
    private String usuario;
    private String senha;    
    
    public void setUsuario(String entraUsuario){
        //metodo para definir usuario
        this.usuario = entraUsuario;
    }
    public String getUsuario(){
        //metodo para obter dado de usuario
        return this.usuario;
    }
    
    public void setSenha(String entraSenha){
        //metodo para definir senha
        this.senha = entraSenha;
    }
    public String getSenha(){
        //metodo para obter senha
        return this.senha;
    }
    
}

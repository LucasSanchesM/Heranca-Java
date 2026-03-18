package heranca;

//irá herdar atributos e metodos de funcionaio
public class Secretaria extends Funcionario {
    //definir atributos
    private int ramal;
    
    public void setRamal(int entraRamal){
        //metodo para definir ramal
        this.ramal = entraRamal;
    }
    public int getRamal(){
        //metodo para obter ramal
        return this.ramal;
    }
}

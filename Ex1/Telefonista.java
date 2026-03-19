package heranca;

//irá herdar atributos e metodos de secretario
public class Telefonista extends Secretaria {
    private int estacaoTrabalho;   
    
    public void setestacaoTrabalho(int entraEstacaoTrabalho){
        this.estacaoTrabalho = entraEstacaoTrabalho;
    }
    public int getestacaoTrabalho(){
        return estacaoTrabalho;
    }

}

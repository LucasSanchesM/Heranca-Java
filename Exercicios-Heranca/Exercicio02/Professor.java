package main;

public class Professor extends Pessoa {
    private int nota;
    
    public Professor(){
        nota = 0;
    }
    
    public void setNota(int entraNota){
        this.nota = entraNota;
    }
    public int getNota(){
        return this.nota;
    }
    
}

package main;
public class Transporte {
    private String marca;
    private String modelo;
    
    public void setmarca(String entramarca){
        this.marca = entramarca;
    }
    public String getmarca(){
        return this.marca;
    }
    
   public void setmodelo(String entramodelo){
       this.modelo = entramodelo;
   }
    
   public String getmodelo(){
       return this.modelo;
   }
   
    public void movimento(String instrucao){
        System.out.printf("Transporte %s...", instrucao);
    }
    
    public void ligarmotor(){
        System.out.println("Transporte ligado, vruuuum...");
    }
    
}   

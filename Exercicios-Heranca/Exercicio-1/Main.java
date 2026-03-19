package main;

public class Main {

    public static void main(String[] args) {
        Carro novoCarro = new Carro();
        novoCarro.setmarca("Mitsubishi");
        novoCarro.setmodelo("Eclipse");
        novoCarro.abrirPortaMalas();
        novoCarro.ligarRadio();
        
        Moto novaMoto = new Moto();
        novaMoto.setmarca("Honda");
        novaMoto.setmodelo("Twister");
        novaMoto.baixarDescanso();
        
        novaMoto.ligarmotor();
        novoCarro.ligarmotor();
        
        novoCarro.movimento("ir pra frente");
        novaMoto.movimento("Ir pra frente");
        
        
    }
    
}

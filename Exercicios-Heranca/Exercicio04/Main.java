package main;
    import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nDigite a opção de carro desejada:\n1-Novo\n2-SemiNovo\n");
        int escolha=0;
        while(true){
            escolha= s.nextInt();
            if(escolha==1){
                Novo carro1 = new Novo();
                carro1.setAdicional(3000);
                carro1.imprimirPrecoFinal();
                break;
            }
            else if(escolha==2){
                SemiNovo carro2 = new SemiNovo();
                carro2.setDesconto(2000);
                carro2.impressaoPrecoFinal();
            break;    
            }
            else{
                System.out.println("\nEntrada, invalida\n");
            }   
        }
        s.close();
    }
}

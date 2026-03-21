/*
Crie uma classe chamada Passagem Aérea que possui um valor em reais e um método imprimeValor(). 
a. crie uma classe intitulada “Primeira Classe”, que herda Passagem Aérea e possui um
valor adicional. Crie um método que retorne o valor da passagem de “Primeira Classe” (com o adicional incluído). 
b. crie uma classe intitulada “Classe Econômica”, que herda Passagem Aérea e possui um método que imprime: "Classe Econômica". 
c. crie uma classe intitulada “Classe Executiva”, que herda Passagem Aérea e possui um 
método para retornar o valor da passagem como a posição da poltrona.
Teste: Simule a compra de uma Passagem Aérea.  Peça para o usuário digitar 1 para “Primeira Classe”, 
2 para “Classe Econômica” e 3 para “Classe Executiva”. Conforme a escolha do usuário, diga qual é o tipo da Passagem Aérea, 
valores e posição de poltrona conforme a escolha.  


irei seguir estritamente o exercicio, porem em caso de liberdade definiria poltrona como atributo da classe pai, e nao apenas da classe
executiva como o exercicio implicitamente define
*/
package main;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nDigite a opção correspondente.\n1-Primeira Classe\n2-Classe Executiva\n3-Classe economica\n");
        int escolha=0;
        while(true){
            escolha= s.nextInt();
            if (escolha==1){
                PrimeiraClasse novapass1 = new PrimeiraClasse();
                System.out.printf("\nTipo: Primeira Classe\nValor: %.2f\nPoltrona: 12(Escolha disponivel apenas para executiva)", novapass1.passagemPrimeiraClasse());
                break;
            }
            else if(escolha==2){
                ClasseExecutiva novapass2 = new ClasseExecutiva();
                System.out.println("Informe a poltrona desejada: ");
                novapass2.setPoltrona(s.nextInt());
                novapass2.classeExecutiva();
                break;
            }
            else if (escolha==3){
                ClasseEconomica novapass3 = new ClasseEconomica();
                novapass3.classeEconomica();
                break;
            }
            else{
                System.out.println("\nEntrada invalida\n");
            }
        }
        s.close();
    }
    
}

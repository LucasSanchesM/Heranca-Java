package main;

public class Main {

    public static void main(String[] args) {
        ContaBancaria novaContaB = new ContaBancaria();
        novaContaB.setNumero(123456);
        novaContaB.setTitular("Jairo");
        
        ContaCorrente novaContaC = new ContaCorrente();
        novaContaC.setNumero(9876);
        novaContaC.setTitular("Alice");
        novaContaC.setLimite(3000);
        
        ContaPoupanca novaContaP = new ContaPoupanca();
        novaContaP.setNumero(12468);
        novaContaP.setTitular("Ramos");
        novaContaP.setRendimento(0.25);

        //coloquei um saldo padrao para testes nas contas
        novaContaB.depositar(5000);
        novaContaC.depositar(5000);
        novaContaP.depositar(5000);

        
        //teste conta bancaria
        novaContaB.sacar(1000);
        System.out.printf("\nContaBancaria\nSaldo depois do saque: %.2f", novaContaB.verSaldo());
        novaContaB.depositar(10000);
        System.out.printf("\nSaldo depois do deposito: %.2f\n", novaContaB.verSaldo());
     
        
        //teste conta Corrente, ira negar a tentaiva de saque devido ao limite
        System.out.printf("\nConta Conrrente\nSaldo antes do saque: %.2f", novaContaC.verSaldo());
        novaContaC.sacar(20000);
        System.out.printf("\nSaldo depois da tentativa de saque saque: %.2f\n", novaContaC.verSaldo());
        
        //teste conta Poupança, irá negar a tentativa de saque superior ao saldo atual
        System.out.printf("\nContaPoupança\nSaldo antes do saque: %.2f", novaContaP.verSaldo());
        novaContaP.sacar(20000);
        System.out.printf("\nSaldo depois da tentaiva de saque: %.2f\n", novaContaP.verSaldo());

        
    }
    
}

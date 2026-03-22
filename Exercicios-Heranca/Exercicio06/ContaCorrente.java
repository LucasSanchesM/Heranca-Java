package main;

public class ContaCorrente extends ContaBancaria{
    private double limite;
    
    public void setLimite(double entraLimite){
        this.limite = entraLimite;
    }
    public double getLimite(){
        return this.limite;
    }
    //override para boas praticas
    @Override
    public void sacar(double saiSaldo){
        //segundo a regra de negocios de bancos o limite de saque é limite + saldo
        if (saiSaldo>limite+super.verSaldo()){
            System.out.printf("\nErro, limite ultrapassado...");
        }
        else{
            super.sacar(saiSaldo);
        }
    }
}

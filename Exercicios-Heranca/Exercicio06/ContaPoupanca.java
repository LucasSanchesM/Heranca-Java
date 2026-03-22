package main;

public class ContaPoupanca extends ContaBancaria{
    private double rendimento;
    
    public void setRendimento(double entraRendimento){
        this.rendimento= entraRendimento;
    }
    public double getRendimento(){
        return this.rendimento;
    }
    
    @Override
    public void sacar(double saiSaldo){
        if ((super.verSaldo()-saiSaldo)<0){
            System.out.println("\nO valor informado de saque é maior que o disponivel na conta!");
        }
        else{
            super.setSaldo(super.verSaldo()-saiSaldo);
        }
    }
    
    //metodo que adiciona o rendimento na conta
    public void atualizar(){
        super.setSaldo(super.verSaldo()+(super.verSaldo()*this.rendimento));
    }
    
    
}

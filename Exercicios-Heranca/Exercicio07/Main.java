package main;

public class Main {

    public static void main(String[] args) {
        //Criação e teste da classe funcionario
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setNome("Pedro");
        novoFuncionario.setIdade(19);
        novoFuncionario.setSalarioB(2000);
        System.out.printf("**Funcionario**\nNome: %s\nIdade: %d\nSalario Base: %.2f\nSalario Final: %.2f\n", novoFuncionario.getNome(),
                novoFuncionario.getIdade(), novoFuncionario.getSalarioB(), novoFuncionario.calcular_salario());
        
        //Criação e teste da classe Gerente
        Gerente novoGerente = new Gerente();
        novoGerente.setNome("Wagner");
        novoGerente.setIdade(52);
        novoGerente.setSalarioB(2000);
        novoGerente.setDepartamento("Contabilidade");
        System.out.printf("\n**Gerente**\nNome: %s\nIdade: %d\nDepartamento: %s\nSalario Base: %.2f\nSalario Final: %.2f\n", novoGerente.getNome(),
            novoGerente.getIdade(), novoGerente.getDepartamento(), novoGerente.getSalarioB(), novoGerente.calcular_salario());
        
        //Criação e teste da classe Programador
        Programador novoProgramador= new Programador();
        novoProgramador.setNome("Roberto");
        novoProgramador.setIdade(29);
        novoProgramador.setSalarioB(2000);
        novoProgramador.setLinguagem("Java");
        System.out.printf("\n**Programador**\nNome: %s\nIdade: %d\nLinguagem: %s\nSalario Base: %.2f\nSalario Final: %.2f\n", novoProgramador.getNome(),
                novoProgramador.getIdade(), novoProgramador.getLinguagem(), novoProgramador.getSalarioB(), novoProgramador.calcular_salario());
    }
    
}

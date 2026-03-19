package heranca;


public class Heranca {

    public static void main(String[] args) {
        
        //nova instancia de classe Funcionario
        Funcionario novoFuncionario = new Funcionario();
        
        //definição de atributos
        novoFuncionario.setNome("Jairo Jaime");
        novoFuncionario.setSalario(2000);
        //exibir valores de objeto novoFuncionario
        System.out.printf("**Funcionario**\nNome: %s\nSalario: %.2f\nBeneficio: %.2f\n", novoFuncionario.getNome(), novoFuncionario.getSalario(), novoFuncionario.calculeBeneficio());
    
        //nova instancia de Secretaria
        Secretaria novaSecretaria = new Secretaria();
        //definição de atributos
        novaSecretaria.setNome("Nilce");
        novaSecretaria.setSalario(20000);
        novaSecretaria.setRamal(123);
        
        //exibir valores de objeto novaFuncionario
        System.out.printf("\n**Secretaria**\nNome: %s\nSalario: %.2f\nBeneficio: %.2f\nRamal: %d\n", novaSecretaria.getNome(), novaSecretaria.getSalario(), novaSecretaria.calculeBeneficio(),novaSecretaria.getRamal());
        
        //nova instancia de Telefonista
        Telefonista novaTelefonista = new Telefonista();
        //definição de atributos
        novaTelefonista.setNome("Gisele");
        novaTelefonista.setSalario(1500);
        novaTelefonista.setRamal(4321);
        novaTelefonista.setestacaoTrabalho(21);
    
        //exibir valores de objeto novaTelefonista
        System.out.printf("\n**Telefonista**\nNome: %s\nSalario: %.2f\nBeneficio %.2f\nRamal: %d\nEstacacao de Trabalho: %d\n", novaTelefonista.getNome(), novaTelefonista.getSalario(), novaTelefonista.calculeBeneficio(), novaTelefonista.getRamal(), novaTelefonista.getestacaoTrabalho());
        
        //nova instancia de Gerente
        Gerente novoGerenciador = new Gerente();
        //definição de atributos
        novoGerenciador.setNome("Amir");
        novoGerenciador.setSalario(2500);
        novoGerenciador.setUsuario("amir.thegoat@gmail.com");
        novoGerenciador.setSenha("123456789");
        
        
        //exibir valores do objeto novoGerenciador
        System.out.printf("\n**Gerente**\nNome: %s\nSalario: %.2f\nBeneficio: %.2f\nUsuario: %s\nSenha: %s\n", novoGerenciador.getNome(), novoGerenciador.getSalario(), novoGerenciador.calculeBeneficio(), novoGerenciador.getUsuario(), novoGerenciador.getSenha());
        
    }
    
}

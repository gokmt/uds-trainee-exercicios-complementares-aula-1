package br.com.uds.exercicio04;

public class Main {

    public static void main(String[] args){
        ContaCorrente contaGerente = new ContaCorrente();
        Gerente gerente = new Gerente("Ronaldo","200", contaGerente);

        gerente.depositar(100.00);
        gerente.irEmbora();

        ContaCorrente contaFuncionario = new ContaCorrente();
        Funcionario funcionario = new Funcionario("SemNome", "007", contaFuncionario);

        funcionario.irEmbora();
    }
}

package br.com.uds.exercicio04;

public class Gerente extends Funcionario{

    private String usuario;
    private String senha;

    public Gerente(String nome, String numeroConta, ContaCorrente conta) {
        super(nome, numeroConta, conta);
    }

    @Override
    public void irEmbora() {
        System.out.println("Indo embora de carrão!");
    }
}

package br.com.uds.exercicio04;

public class Funcionario {

    private String nome;
    private String numeroConta;
    private ContaCorrente conta = new ContaCorrente();

    public Funcionario(String nome, String numeroConta, ContaCorrente conta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void sacar(double valor){
        if (valor > conta.getSaldo()){
            System.out.println("Saldo insuficiente!");
        }else{
            conta.subtrairValor(valor);
        }
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Impossível depositar esse valor!");
        }else{
            conta.adicionarValor(valor);
        }
    }

    public void irEmbora(){
        System.out.println("Indo embora de ônibus");
    }
}

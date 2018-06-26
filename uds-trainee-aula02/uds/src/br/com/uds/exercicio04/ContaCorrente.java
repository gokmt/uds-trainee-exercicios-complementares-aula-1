package br.com.uds.exercicio04;

public class ContaCorrente implements Conta {
    private double saldo = 0.0;

    @Override
    public void sacar(double valorSacar) {
        if (this.saldo > valorSacar){
            this.saldo -= valorSacar;
        }else{
            System.out.println("saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valorDepositar) {
        if (valorDepositar <= 0){
            System.out.println("Impossível depositar nesse valor!");
        }else{
            this.saldo += valorDepositar;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void subtrairValor(double valor){
        this.saldo -= valor;
        System.out.println("Seu saldo agora é: R$" + this.saldo);
    }

    public void adicionarValor(double valor){
        this.saldo += valor;
        System.out.println("Seu saldo agora é: R$" + this.saldo);
    }
}

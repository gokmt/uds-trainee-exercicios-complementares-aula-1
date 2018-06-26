package br.com.uds.exercicio02;

import java.util.ArrayList;

public class Pedido {

    private double total;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
        this.total += produto.getValor();
    }

    public void calcularTotal(){
        System.out.println("Valor total dos produtos " + this.total);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "total=" + total +
                ", produtos=" + produtos.toString() +
                '}';
    }
}

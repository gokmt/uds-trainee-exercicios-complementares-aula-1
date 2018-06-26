package br.com.uds.exercicio02;

public class Main {
    public static void main(String[] args){

        Produto produto01 = new Produto("produto01", 100.00);
        Produto produto02 = new Produto("produto02", 200.00);
        Produto produto03 = new Produto("produto03", 300.00);
        Produto produto04 = new Produto("produto04", 400.00);
        Produto produto05 = new Produto("produto05", 500.00);
        Pedido pedido = new Pedido();

        pedido.adicionarProduto(produto01);
        pedido.adicionarProduto(produto02);
        pedido.adicionarProduto(produto03);
        pedido.adicionarProduto(produto04);
        pedido.adicionarProduto(produto05);
        pedido.calcularTotal();

        System.out.println(pedido.toString());
    }
}

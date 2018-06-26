package br.com.uds.exercicio05;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    private int numeroAleatorio = 0;
    private Usuario usuario = new Usuario();

    public Jogo(){

    }

    public void abrirJogo(){
        System.out.println("--------------------------------------------");
        System.out.println("\n[1] Par"
                + "\n[2] Impar"
                + "\nSeus pontos: " + usuario.getPontosDeVida()
                + "\nEscolha uma opção: ");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                verificarNumeroPar();
                break;
            case 2:
                verificarNumeroImpar();
                break;
                default:
                    System.out.println("Essa opção não existe!");
                    break;
        }
    }

    public void gerarNumeroAleatorio(){
        int auxiliar;
        Random gerarNumero = new Random();
        this.numeroAleatorio = gerarNumero.nextInt(99);
        System.out.println(this.numeroAleatorio);
    }

    public void verificarNumeroPar(){
        int auxiliar;
        Random gerarNumero = new Random();
        auxiliar = gerarNumero.nextInt(99);
        this.numeroAleatorio = auxiliar;
        if (this.numeroAleatorio%2 == 0){
            System.out.println("O número " + this.numeroAleatorio + " é par, parabéns você acertou!");
            this.usuario.adicionarPontos(10);
        }else{
            System.out.println("O número " + this.numeroAleatorio + " é impar, você errou!");
            this.usuario.subtrairPontos(10);
        }
        continuar();
    }

    public void verificarNumeroImpar(){
        gerarNumeroAleatorio();
        if (this.numeroAleatorio%2 == 0){
            System.out.println("O número " + this.numeroAleatorio + " é par, você errou!");
            this.usuario.subtrairPontos(10);
        }else{
            System.out.println("O número " + this.numeroAleatorio + " é impar, parabéns você acertou!");
            this.usuario.adicionarPontos(10);
        }
        continuar();
    }

    public void continuar(){
        System.out.println("Deseja continuar?" +
                "\n 1 - Sim" +
                "\n 2 - Não");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Ótimo! Vamos continuar com o jogo");
                abrirJogo();
                break;
            case 2:
                System.out.println("Que pena! Você terminou com " + usuario.getPontosDeVida() + " ponto(s)");
                break;
                default:
                    System.out.println("Por favor escolha 1 ou 2 como opção.");
                    break;
        }
    }
}

package br.com.uds.exercicio05;

public class Usuario {
    private int pontosDeVida = 100;

    public Usuario() {

    }

    public void abrirJogo(Jogo jogo){
        jogo.abrirJogo();
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void adicionarPontos(int pontos){
        this.pontosDeVida += pontos;
        System.out.println("Seus pontos: " + this.pontosDeVida);
    }

    public void subtrairPontos(int pontos){
        this.pontosDeVida -= pontos;
        System.out.println("Seus pontos: " + this.pontosDeVida);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "pontosDeVida=" + pontosDeVida +
                '}';
    }
}

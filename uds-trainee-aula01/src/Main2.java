import java.util.Scanner;

public class Main2 {

    private static double saldo = 1500;

    public static void main(String[] args){
        abrirLoja();
    }

    public static void abrirLoja(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seu saldo: " + saldo
                + "\nCategorias:"
                + "\n1 - Metralhadoras"
                + "\n2 - Pistolas"
                + "\n3 - Sub-Metralhadoras"
                + "\n4 - Trabalhar!"
                + "\n5 - Coisas Ninjas!"
                + "\n6 - Faquinhas!"
                + "\n0 - Sair" );
        System.out.println("Digite um numero: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                abrirMetralhadora();
                break;
            case 2:
                abrirPistola();
                break;
            case 3:
                abrirSubMetralhadora();
                break;
            case 4:
                saldo += 100.00;
                System.out.println("Agora seu saldo é: " + saldo);
                abrirLoja();
                break;
            case 5:
                abrirNinja();
                break;
            case 6:
                abrirFaquinhas();
                break;
            case 0:
                System.out.println("Você saiu do sistema! Até mais o/ !");
                break;
            default:
                System.out.println("Valor inválido! Tente novamente!");
                break;
        }

    }

    public static void abrirMetralhadora(){
        String item1 = "AK-47";
        String item2 = "M4A1";
        String item3 = "Tratratra";
        String item4 = "Rápido demais";
        String item5 = "Metranca do rambo";

        Double valor1 = 150.00;
        Double valor2 = 200.00;
        Double valor3 = 350.00;
        Double valor4 = 400.00;
        Double valor5 = 550.00;


        System.out.println("Metralhadoras: "
                + "\n1 - " + item1 + " " + "R$" + valor1
                + "\n2 - " + item2 + " " + "R$" + valor2
                + "\n3 - " + item1 + " " + "R$" + valor3
                + "\n4 - " + item2 + " " + "R$" + valor4
                + "\n5 - " + item1 + " " + "R$" + valor5
                + "\n0 - Voltar para o menu principal");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                if (saldo < valor1){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor1;
                    System.out.println(item1 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 2:
                if (saldo < valor2){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor2;
                    System.out.println(item2 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 3:
                if (saldo < valor3){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor3;
                    System.out.println(item3 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 4:
                if (saldo < valor4){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor4;
                    System.out.println(item4 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 5:
                if (saldo < valor5){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor5;
                    System.out.println(item5 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 0:
                abrirLoja();
                break;
            default:
                System.out.println("Valor inválido! Tente novamente!");
        }
    }

    public static void abrirPistola(){
        String item1 = "Pistola Taurus";
        String item2 = "Pistola Smith";
        String item3 = "Pistola Diabetes";
        String item4 = "Pistola Vacinas";
        String item5 = "Pistola Da morteee";

        Double valor1 = 150.00;
        Double valor2 = 2000.00;
        Double valor3 = 350.00;
        Double valor4 = 4000.00;
        Double valor5 = 250.00;

        System.out.println("Pistolas: "
                + "\n1 - " + item1 + " " + "R$" + valor1
                + "\n2 - " + item2 + " " + "R$" + valor2
                + "\n3 - " + item1 + " " + "R$" + valor3
                + "\n4 - " + item2 + " " + "R$" + valor4
                + "\n5 - " + item1 + " " + "R$" + valor5
                + "\n0 - Voltar para o menu principal");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                if (saldo < valor1){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor1;
                    System.out.println(item1 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 2:
                if (saldo < valor2){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor2;
                    System.out.println(item2 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
             case 3:
                if (saldo < valor3){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor3;
                    System.out.println(item3 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 4:
                if (saldo < valor4){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor4;
                    System.out.println(item4 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 5:
                if (saldo < valor5){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor5;
                    System.out.println(item5 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 0:
                abrirLoja();
                break;
            default:
                System.out.println("Valor inválido! Tente novamente!");
        }
    }

    public static void abrirSubMetralhadora(){
        String item1 = "MP18";
        String item2 = "MP40";
        String item3 = "MP78";
        String item4 = "MP90";
        String item5 = "MP16";

        Double valor1 = 150.00;
        Double valor2 = 200.00;
        Double valor3 = 350.00;
        Double valor4 = 400.00;
        Double valor5 = 550.00;

        System.out.println("Sub-Metralhadoras: "
                + "\n1 - " + item1 + " " + "R$" + valor1
                + "\n2 - " + item2 + " " + "R$" + valor2
                + "\n3 - " + item1 + " " + "R$" + valor3
                + "\n4 - " + item2 + " " + "R$" + valor4
                + "\n5 - " + item1 + " " + "R$" + valor5
                + "\n0 - Voltar para o menu principal");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                if (saldo < valor1){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor1;
                    System.out.println(item1 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 2:
                if (saldo < valor2){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor2;
                    System.out.println(item2 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 3:
                if (saldo < valor3){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor3;
                    System.out.println(item3 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 4:
                if (saldo < valor4){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor4;
                    System.out.println(item4 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 5:
                if (saldo < valor5){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor5;
                    System.out.println(item5 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 0:
                abrirLoja();
                break;
            default:
                System.out.println("Valor inválido! Tente novamente!");
        }
    }

    public static void abrirNinja(){
        String item1 = "Ninjão das sombras";
        String item2 = "Kunai";
        String item3 = "Shuriken";
        String item4 = "Sushi";
        String item5 = "Katana";

        Double valor1 = 150.00;
        Double valor2 = 200.00;
        Double valor3 = 350.00;
        Double valor4 = 400.00;
        Double valor5 = 550.00;

        System.out.println("Coisas Ninjas: "
                + "\n1 - " + item1 + " " + "R$" + valor1
                + "\n2 - " + item2 + " " + "R$" + valor2
                + "\n3 - " + item1 + " " + "R$" + valor3
                + "\n4 - " + item2 + " " + "R$" + valor4
                + "\n5 - " + item1 + " " + "R$" + valor5
                + "\n0 - Voltar para o menu principal");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                if (saldo < valor1){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor1;
                    System.out.println(item1 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 2:
                if (saldo < valor2){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor2;
                    System.out.println(item2 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 3:
                if (saldo < valor3){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor3;
                    System.out.println(item3 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 4:
                if (saldo < valor4){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor4;
                    System.out.println(item4 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 5:
                if (saldo < valor5){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor5;
                    System.out.println(item5 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 0:
                abrirLoja();
                break;
            default:
                System.out.println("Valor inválido! Tente novamente!");
        }
    }

    public static void abrirFaquinhas(){
        String item1 = "Cutelo";
        String item2 = "Facão";
        String item3 = "Peixeira";
        String item4 = "Faca com serra cega";
        String item5 = "Faca com serrote";

        Double valor1 = 150.00;
        Double valor2 = 200.00;
        Double valor3 = 350.00;
        Double valor4 = 400.00;
        Double valor5 = 550.00;

        System.out.println("Faquinhas: "
                + "\n1 - " + item1 + " " + "R$" + valor1
                + "\n2 - " + item2 + " " + "R$" + valor2
                + "\n3 - " + item1 + " " + "R$" + valor3
                + "\n4 - " + item2 + " " + "R$" + valor4
                + "\n5 - " + item1 + " " + "R$" + valor5
                + "\n0 - Voltar para o menu principal");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                if (saldo < valor1){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor1;
                    System.out.println(item1 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 2:
                if (saldo < valor2){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor2;
                    System.out.println(item2 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 3:
                if (saldo < valor3){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else {
                    saldo = saldo - valor3;
                    System.out.println(item3 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 4:
                if (saldo < valor4){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor4;
                    System.out.println(item4 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 5:
                if (saldo < valor5){
                    System.out.println("Saldo insuficiente!");
                    abrirLoja();
                }else{
                    saldo = saldo - valor5;
                    System.out.println(item5 + " " + "Comprado!" + " Agora seu saldo é " + "R$" + saldo);
                }
                break;
            case 0:
                abrirLoja();
                break;
            default:
                System.out.println("Valor inválido! Tente novamente!");
        }
    }

}
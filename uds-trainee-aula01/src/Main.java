import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer dia = 1;
        String nome = "Gustavo";
        Integer idade = 14;
        Boolean sexoMasculino = true;
        Boolean sexo = true;
        Double peso = 60.0;
        System.out.println("Helloooooooooooooooooooooooo");
        System.out.println("Nome: " + nome + "\nsexo Masculino: " + sexoMasculino + "\nIdade: " + idade + "\nPeso:" + peso);


//        System.out.println(sexoop());

        //System.out.println("Olá meu nome é " + nome + ", tenho " + idade + "anos de idade!");

        if (idade <= 18) {
            System.out.println("Novinho(a)");
        } else if (idade > 18 && idade <= 30) {
            System.out.println("Tiozinho(a)");
        } else if (idade > 30) {
            System.out.println("Tiozão(ona)");
        }

        switch (dia) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Escreva um número de 0 a 6");
                break;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita um numero para transformar em romano");
        numeroRomano(scanner.nextInt());

        romanos10for();
        romanos10while();
        
    }
    Boolean sexo = true;

    public String sexoop(){
        if (sexo == true){
            return "masculino";
        }else {
            return "feminino";
        }
    }


    public static void numeroRomano(Integer numero){
        switch (numero){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Escreva um número de 1 a 10");
        }
    }

    public static void romanos10for(){
        System.out.println("Números romanos de 1 a 10 com while: ");
        for(int x = 1; x <= 10; x++){
            numeroRomano(x);
        }
    }

    public static void romanos10while(){
        int i = 1;
        System.out.println("Números romanos de 1 a 10 com while: ");
        while (i < 11){
            numeroRomano(i);
            i++;
        }
    }



}

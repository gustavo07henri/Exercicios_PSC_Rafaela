import java.util.Scanner;

public class Main {


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int insersao;
    System.out.println("""
        Digite uma das opções desejadas.
        1 -- Exercício 01
        2 -- Exercício 02
        3 -- Exercício 03
        4 -- Exercício 04
        0 -- para sair.
            """);
        System.out.print("Insira a opção: ");
        insersao = input.nextInt();

        switch (insersao) {
            case 1:
                Ex01(input);
                break;
            case 2:
                Ex02(input);
                break;
            case 3:
                Ex03(input);
                break;
            case 4: 
                Ex04(input);
                break; 
            case 0:
                System.out.println("Obrigado por utilizar");
            default:
                System.out.println("Opção inválida.");
                break;
        } 
    input.close();
    }

    public static void Ex01 (Scanner input){

    }
    public static void Ex02 (Scanner input){

    }
    public static void Ex03 (Scanner input){

    }
    public static void Ex04 (Scanner input){

    }
}
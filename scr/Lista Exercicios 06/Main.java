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
        int[] vetor = new int[9];
        int contador;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Escreva um valor para o incluir no vetor: ");
            vetor [i] = input.nextInt();
        }
        for (int j = 0; j < vetor.length; j++) {
            contador = 0;
            for(int i = 1; i < vetor.length; i++){
                if(vetor[j] % i == 0){
                    contador ++;
                }
            }
            if (contador <= 2) {
                System.out.print("O número " + vetor[j] + " de posição " + j + " é primo.");
            }
        }
      
           
        
    }
    public static void Ex02 (Scanner input){
        int[] vetorUm = new int[10];
        int[] vetorDois = new int[10];
        int[] intercalado = new int[20];

        for (int i = 0; i < vetorUm.length; i++) {
            System.out.print("Insira o "+i+"° valor para o 1° Vetor.");
            vetorUm[i] = input.nextInt();
        }
        for (int i = 0; i < vetorDois.length; i++) {
            System.out.print("Insira o "+i+"° valor para o 2° Vetor.");
            vetorDois[i] = input.nextInt();
        }
       
        for (int i : vetorUm) {
            int j = 0;
            intercalado[j] = i;
            j += 2;
        }    
        for (int i : vetorDois) {
            int a = 1;
            intercalado[a] = i;
            a += 2;
        }    
        for (int i = 0; i < intercalado.length; i++) {
            System.out.println(intercalado[i]);
        }
    }
    
    public static void Ex03 (Scanner input){

    }
    public static void Ex04 (Scanner input){
        
    }
}

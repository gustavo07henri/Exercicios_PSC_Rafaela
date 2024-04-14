import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int insersao;
        System.out.println("""
            Digite uma das opções desejadas.
            1 -- Exercício 01
            2 -- Exercício 02
            3 -- Exercício 03
            4 -- Exercício 04
            5 -- Exercício 05
            6 -- Exercício 06
            7 -- Exercício 07
            8 -- Exercício 08
            9 -- Exercício 09
            10 -- Exercício 10
            11 -- Exercício 11
            12 -- Exercício 12
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
                case 5:
                    Ex05(input);
                    break;
                case 6:
                    Ex06(input);
                    break;
                case 7:
                    Ex07(input);
                    break;
                case 8:
                    Ex08(input);
                    break;
                case 9:
                    Ex09(input);
                    break;
                case 10:
                    Ex10(input);
                    break;
                case 11:
                    Ex11(input);
                    break;
                case 12:
                    Ex12(input);
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar");
                default:
                    System.out.println("Opção inválida.");
                    break;
            } 
        input.close();
    }
    public static void Ex01(Scanner input){
        int num1, produto = 1, impar, soma = 0;
        System.out.println("Para fechar o programa insira um número negativo.");
       
        while(true){

            System.out.print("Insira um número: ");
            num1 = input.nextInt();

            impar = num1%2;

            if (num1 < 0){
                break;
            }else if (impar == 1) {
                produto *= num1;
            }else{
                soma += num1;
            }
        }
        System.out.println("O produto dos numero é : "+produto);
        System.out.println("A soma dos numero é : "+soma);
    }
    public static void Ex02 (Scanner input){
        double numero, quadrado, cubo, raiz;

        System.out.println("""
            Este programa irá calcular o quadrado, cubo e raiz de um valor inserido.
            O programa se encerrar quando houver insersão de um valor menor ou igual a zero.""");
       while (true) {
        System.out.print("Insira um valor: ");
        numero = input.nextInt();

        if(numero <= 0 )
            break;

        quadrado = Math.pow(numero, 2);
        cubo = Math.pow(numero, 3);
        raiz = Math.sqrt(numero);

        System.out.printf("Numero: %.0f | Quadrado: %.0f | Cubo: %.0f | Raiz: %.2f \n", numero, quadrado, cubo, raiz);

       }
    }
    public static void Ex03(Scanner input){
        int idade , altura, peso, soma_idade = 0, soma_altura = 0, soma_peso = 0, media_altura, porcentagem_peso, contador_altura= 0;

        for(int i = 1; i < 11 ; i ++){

            System.out.print("Insira a idade da "+i+"° pessoa: ");
            idade = input.nextInt();
            System.out.print("Insira a altura em cm da "+i+"° pessoa: " );
            altura = input.nextInt();
            System.out.print("Insira o peso em Kg da "+i+"° pessoa: ");
            peso = input.nextInt();
            
            if(idade > 50){
                soma_idade ++;
            }
            if(idade >= 10 && idade <= 20){
                soma_altura += altura;
                contador_altura ++;
            }
            if( peso < 40){
                soma_peso ++;
            }
        }
        media_altura = soma_altura / contador_altura;
        porcentagem_peso = ((soma_peso * 100) / 10);
        System.out.println("Neste grupo de pessoas existem "+soma_idade+" pessoas com menos de 50 anos.");
        System.out.println("A média de altura das deste grupo das pessoas entre 10 e 20 anos é : "+media_altura+" Cm.");
        System.out.printf("A porcentagem de pessoas co peso abaixo de 40Kg é de %d%%.", porcentagem_peso);
    }
    public static void Ex04(Scanner input){
        boolean vencedor = true;
        int kills, deaths, assists, kill_total = 0, deaths_total = 0, assists_total = 0;
        String verification;

        do{
            int i = 1;
            System.out.println("Houveram quantas Kills na "+i+"° partida? ");
            kills = input.nextInt();
            System.out.println("Houveram quantas deaths nessa partida? ");
            deaths = input.nextInt();
            System.out.println("Houveram quantas assists nessa partida? ");
            assists = input.nextInt();
            System.out.println("Houve vencedor nessa partida? Use S/N para responder.");
            verification = input.next();

            System.out.print((kills <= 5) ? "noob\n" : "\n");
            System.out.print((kills >= 20) ? "master\n" : "\n");
            System.out.print((deaths >= 20) ? "Houston, we have a problem\n" : "\n");
            System.out.print((assists >= 20) ? "team work\n" : "\n");

            kill_total += kills;
            deaths_total += deaths;
            assists_total += assists;

            verification = verification.toUpperCase();
            i ++;

            if(Objects.equals(verification, "S"))
                vencedor = false;
        }while (vencedor);

        System.out.println("Nesta rodada houveram "+kill_total+" kills totais.");
        System.out.println("Também houveram "+deaths_total+" deaths totais.");
        System.out.println("E um total de "+assists_total+" assists totais.");
    }
    public static void Ex05(Scanner input){
        int palpite, numero;
        boolean validacao = true;

        System.out.println("""
                Bem-vindo ao Jogo de Adivinhação!
                Estou pensando em um número entre 1 e 100...
                Tente adivinhar qual é!
                """);

        Random gerador = new Random();
        numero = gerador.nextInt(1, 100);
        int i = 0;
        while (validacao){

            i++;
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();



            if (palpite == numero){
                System.out.println("Parabéns! você acertou o número em "+i+" tentativas.");
                validacao = false;
            } else if (palpite < numero) {
                System.out.println("Muito baixo. tente novamente.");
            }else {
                System.out.println("Muito alto. tente novamente.");
            }
        }
    }
    public static void Ex06(Scanner input){
        int palpite, numero, i = 0;
        boolean key = true;
        String validacao;

        System.out.println("""
                Bem-vindo ao Jogo de Adivinhação!
                Estou pensando em um número entre 1 e 100...
                Tente adivinhar qual é!
                """);

        Random gerador = new Random();
        numero = gerador.nextInt(1, 100);
        while (key){

            i++;
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();



            if (palpite == numero){
                System.out.println("Parabéns! você acertou o número em "+i+" tentativas.");
                System.out.print("Deseja continuar jogando? Responda com S/N: ");
                validacao = input.next();
                validacao = validacao.toUpperCase();

                if(Objects.equals(validacao, "N")) {
                    System.out.println("Obrigado por jogar.");
                    key = false;
                } else if (Objects.equals(validacao, "S")) {
                    System.out.println("Jogue novamente!");
                    i = 0;
                    numero = gerador.nextInt(1, 100);
                }else {
                    System.out.println("Opção inválida.");
                }

            } else if (palpite < numero) {
                System.out.println("Muito baixo. tente novamente.");
            }else {
                System.out.println("Muito alto. tente novamente.");
            }
        }
    }
    public static void Ex07(Scanner input){
        int entrada, coluna;
        boolean key = true;
        System.out.println("""
                Este programa irá mostrar formas geométricas escolhidas pelo usuário.
                Escolha uma das opções abaixo.
                [1]--> RETÂNGULO.
                [2]--> DIAGONAL SUPERIOR DIREITA.
                [3]--> DIAGONAL SUPERIOR ESQUERDA.
                [4]--> DIAGONAL INFERIOR DIREITA.
                [5]--> DIAGONAL INFERIOR ESQUERDA.""");
        entrada = input.nextInt();
        System.out.print("Insira o numero de colunas desejada: ");
        coluna = input.nextInt();

        switch (entrada){
            case 1:
                for (int i = 0; i < coluna; i++) {
                    for(int j = 0; j < coluna; j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                while (key) {
                    for (int i = 0; i < coluna; i++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                coluna --;
                if (coluna == 0) 
                    key = false;
                }
                break;
            case 3:
                int a = 1;
                while (key) {
                    int r = coluna;
                    for (int i = 0; i < coluna; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    coluna --;

                    if (r > coluna) {
                        if( coluna == 4)
                            a++;
                        for(int j = 0 ; j < a; j++){
                            System.out.print(" ");
                        }
                        if (a != coluna) {
                            a++;
                        }
                    }
                    if (coluna == 0) 
                        key = false;
                }
            break;

            
                
            case 4:
                int r = 1;
                int p = coluna;
                while (key) {
                    
                    for(int i = 0; i < r; i++){
                        System.out.print("* ");
                        
                    }
                    System.out.println(" ");
                    coluna --;

                    if(r < p)
                        r++;
                    if(coluna == 0)
                        key = false;
                }
                break;
            case 5:
                int teste = coluna -1;
                int colunaAb = coluna, um = 1;

                while (key) {
                    for (int i = 0; i < teste; i++){
                        System.out.print("  ");
                    }
                    teste --;   
                    for ( int j = 0; j < um; j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");

                    if (um < colunaAb)
                        um ++;
                    if(teste == 0)
                        key = false;
                }
                
                break;
        }
    }
    public static void Ex08(Scanner input){
        int n1;
        double n2, produto = 0;

        System.out.println("Este programa irá fazer a multiplicação de dois números através de somas sucessivas. ");
        System.out.print("Insira o primeiro número: ");
        n1 = input.nextInt();
        System.out.print("Insira o valor do segundo número: ");
        n2 = input.nextInt();

        for (int i = 0; i < n2; i++) {
            produto +=n1;
        }
        System.out.printf("O resultado da multiplicação de %d x %.2f é %.2f", n1, n2, produto);
    }
    
    public static void Ex09(Scanner input){
        int pais_A = 5_000_000, pais_B = 7_000_000, i = 0;
        double pais_A_final, pais_B_final;

        pais_A_final = pais_A;
        pais_B_final = pais_B;

        while (pais_A_final < pais_B_final){
            i ++;
            pais_A_final *= 1.03;
            pais_B_final *= 1.02;
        }
        System.out.printf("levara %d anos para a população do Pais A ultrapassar o do pais B\n", i);
        System.out.printf("População pais A: %.0f habitantes\n", pais_A_final);
        System.out.printf("População pais B: %.0f habitantes", pais_B_final);
    }

    public static void Ex10(Scanner input) {
        
        int matricula, nota, menorNota = 100_000_000, maiorNota = 0, maiorMatricula = 0, menorMatricula = 0 ;
        
        ArrayList<Integer> conjuntoNota = new ArrayList<>();
        for(int i = 1; i <= 100; i++){
            
            while (true){
                System.out.print("Insira a matricula do aluno: ");
                matricula = input.nextInt();
                System.out.print("Insira a nota do aluno: ");
                nota = input.nextInt();
                
                if(conjuntoNota.contains(nota)){
                    System.out.println("Não se pode colocar notas repetidas.");
                }else{
                    conjuntoNota.add(nota);
                    if (nota > maiorNota){
                        maiorNota = nota;
                        maiorMatricula = matricula;
                    }
                    if (nota < menorNota){
                        menorNota = nota;
                        menorMatricula = matricula;
                    }
                break;    
                }        
            }          
        } 
        System.out.printf("O aluno com a matricula: %d obteve a maior nota. Que foi %d.\n", maiorMatricula, maiorNota);
        System.out.printf("O aluno com a matricula: %d obteve a menor nota. Que foi %d.\n", menorMatricula, menorNota);
        
    }
    public static void Ex11(Scanner input){
        double massa, tempo, massa_final;
        String key;
        boolean validacao = true;


        System.out.println("Este programa irá calcular o tempo necessário para a massa do reator ser menor que 0,10 gramas.");
        System.out.print("Insira o valor da massa em gramas: ");
        massa = input.nextDouble();



        while (validacao){
            System.out.print("Deseja continuar o a calcular? Digite S/N como resposta.");
            key = input.next();
            key = key.toUpperCase();

            if (Objects.equals(key,"S")){
                tempo = tempo(massa);
                massa_final = massa(massa);
                System.out.printf("Após %.0f segundos, a massa do material radioativo sera de %.2f gramas\n", tempo, massa_final);
                System.out.print("Insira o valor da massa em gramas: ");
                massa = input.nextDouble();


            } else if (Objects.equals(key, "N")) {
                tempo = tempo(massa);
                massa_final = massa(massa);
                System.out.printf("Após %.0f segundos, a massa do material radioativo sera  %.2f gramas\n", tempo, massa_final);
                System.out.println("Obrigado por utilizar o programa");
                validacao = false;

            }else {
                System.out.println("Inserção inválida, o programa será interrompido");
                break;
            }
        }

        input.close();
    }
    static double tempo(double massa) {
        double massa_final, i = 0;
        massa_final = massa;
        while (massa_final > 0.1) {
            i++;
            massa_final *= 0.75;
        }
        i *= 30;
        return i;
    }
    static double massa (double massa){
        double massa_final;
        massa_final = massa;
        while (massa_final > 0.1) {
            massa_final *= 0.75;
        }
        return massa_final;
    }
    public static void Ex12(Scanner input){

    }
}

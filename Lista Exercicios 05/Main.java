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
            5 -- Exercício 05
            6 -- Exercício 06
            7 -- Exercício 07
            8 -- Exercício 08
            9 -- Exercício 09
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
                case 0:
                    System.out.println("Obrigado por utilizar");
                default:
                    System.out.println("Opção inválida.");
                    break;
            } 
    input.close();
}
    public static void Ex01 (Scanner input){
        System.out.println("Este programa irá calcular a média das idades inseridas.\nPara finalizar o programa digite 0.");
            int idade, media = 0, i = 0;
            
            while (true) {
                System.out.print("Insira a a idade: ");
                idade = input.nextInt();
                
                if(idade == 0){
                    break;
                }else if(idade > 0){
                    media += idade;
                    i ++;
                }
    
            }
            media = media / i;
            System.out.println("A média de idade de todos os participantes é: " + media);
            input.close();
        }


    public static void Ex02 (Scanner input){
        int canal, pessoas, tv;
        int pessoasCanal5 = 0, pessoasCanal4 = 0, pessoasCanal7 = 0, pessoasCanal12 = 0, contPessoas = 0;
        boolean key = true;
        System.out.println("Este programa ira calcular o audiencia da TV em diversas casas.");

        while (key) {
            System.out.print("""
                    Insira uma das opções desejadas.
                    [1] -- Tv está ligada.
                    [2] -- Tv está desligada.
                    [0] -- Para fechar o programa.
                    Insira opção --> 
                    """);
            tv = input.nextInt();
            switch (tv) {
                case 2:
                    System.out.println("Tv`s desligadas não entram na pesquisa.");
                    break;
                case 1:
                    System.out.print("""
                    Qual canal você(s) estão assistindo?
                    [1] -- para canal (4).
                    [2] -- para canal (5).
                    [3] -- para canal (7).
                    [4] -- para canal (12).
                        
                    """);
                    canal = input.nextInt();

                    System.out.print("Digite o número de pessoas que estão assistindo com você: ");
                    pessoas = input.nextInt();

                    contPessoas += pessoas;
                    // Switch para somar o número de pessoa assistindo cada canal
                    switch (canal) {
                        case 1:
                            pessoasCanal4 =+ pessoas;
                            break;
                        case 2:
                            pessoasCanal5 += pessoas;
                            break;
                        case 3:
                            pessoasCanal7 += pessoas;
                            break;
                        case 4:
                            pessoasCanal12 += pessoas;
                            break;
                        default:
                            break;
                    }
                    break;
                case 0:
                    key = false;
                    break;
                default:
                    break;
            }

        }
        System.out.println(contPessoas);
        System.out.println("Porcentagem de pessoas assistindo Canal 4 é " + ((pessoasCanal4 * 100) / contPessoas) + " %");
        System.out.println("Porcentagem de pessoas assistindo Canal 5 é " + ((pessoasCanal5 * 100) / contPessoas) + " %");
        System.out.println("Porcentagem de pessoas assistindo Canal 7 é "+ ((pessoasCanal7 * 100) / contPessoas) + " %");
        System.out.println("Porcentagem de pessoas assistindo Canal 12 é "+ ((pessoasCanal12 * 100) / contPessoas) + " %");
        input.close();
    }

    public static void Ex03 (Scanner input){
        int opcao;
        int nota, notaPeso = 0, somaNotaPeso = 0, somaNota = 0;
        int peso, somaPeso = 0, media, mediaPonderada;
        System.out.println("""
            Menu de opções:
            1. Média aritmética
            2. Média ponderada
            3. Sair
                """);
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                for (int i = 1; i <= 2; i++){
                    System.out.print("Insira a "+i+"° nota: ");
                    nota = input.nextInt();
                    somaNota += nota;
                }
                media = somaNota / 2;
                System.out.println("Sua média nas duas matérias é: " + media);
                break;
            
            case 2:
                for(int i = 1; i <= 3; i++){
                    System.out.print("Insira a "+i+"° nota: ");
                    nota = input.nextInt();
                    System.out.print("Insira o peso da "+i+"° nota (entre 1 e 4): ");
                    peso = input.nextInt();

                    somaPeso += peso;
                    notaPeso = peso * nota;
                    somaNotaPeso += notaPeso;
                }
                mediaPonderada = somaNotaPeso / somaPeso;
                System.out.println("Sua média ponderada é: " + mediaPonderada);
                break;

            case 3: 
                System.out.println("Obrigado por utilizar");
                break;

            default:
                System.out.println("Opção inválida inserida. ");
                break;
        }

        input.close();
        
    }

    public static void Ex04 (Scanner input){
        int idade, peso, media = 0;
        double altura;
        int cond_2 = 0; // var par contar a quantidade de pessoas na condição 2
        int cond_1 = 0; // var par contar a quantidade de pessoas na condição 1

        for (int i = 1; i >= 10; i ++){
            System.out.print("Insira o peso do "+i+"° participante: ");
            peso = input.nextInt();
            System.out.print("Insira a idade do "+i+"° participante: ");
            idade = input.nextInt();
            System.out.print("Insira a altura do "+i+"° participante em metros: ");
            altura = input.nextInt();

            media += idade;

            if(peso > 90 && altura < 1.5){

                cond_1 ++;
            }else if((idade >= 10 && idade <= 30) && altura > 1.9 ){

                cond_2 ++;
            }
        }
        media = media/10;
        System.out.println("A média de idade entre os 10 participantes é "+ media);
        System.out.println("A quantidade de pessoas com menos de 1,50 de altura e mais de 90Kg é: "+ cond_1);
        System.out.println("A quantidade de pessoas entre 10 e 30 anos e mais de 1,90 de altura é: "+ cond_2);

        input.close();
    }

    public static void Ex05 (Scanner input){
        int totalM = 0;
        int resp_S_F = 0, resp_N_F = 0; // contador de respostas feminino
        int resp_S_M = 0, resp_N_M = 0; // contador de respostas masculino
        char sexo, resposta;

        for (int i = 1; i <= 10; i++){

            while (true) {
                System.out.printf("Insira o sexo do %d° participante (Use M/F): ", i);
                sexo = input.next().charAt(0);
                System.out.printf("Informe se gostou do produto (Use S/N): ", i);
                resposta = input.next().charAt(0);

                sexo = Character.toUpperCase(sexo); 
                resposta = Character.toUpperCase(resposta);
    
                if((sexo == 'M' || sexo == 'F') && (resposta == 'S' || resposta == 'N')){
                    break;
                }else{
                    System.out.println("\nInformações inseridas incorretamente.");
                    System.out.println("Insira as informações novamente.\n");
                }

            }

          

            switch (sexo) {
                case 'M':
                    totalM ++;
                    if (resposta == 'S') 
                        resp_S_M ++;
                    if (resposta == 'N')
                        resp_N_M ++;
                    break;
                
                case 'F':
                    if (resposta == 'S') 
                        resp_S_F ++;
                    if (resposta == 'N')
                        resp_N_F ++;

                default:
                    break;
            }

        }

        System.out.println("O total de pessoas que responderam \"Sim\" foi de " +(resp_S_F + resp_S_M)+ " pessoas");
        System.out.println("O total de pessoas que responderam \"Não\" foi de " +(resp_N_F + resp_N_M)+ " pessoas");
        System.out.println(resp_S_F +" Mulheres reponderam \"Sim\" para pesquisa.");
        System.out.println(((resp_N_M * 100) / totalM)+"% dos Homens responderam \"Não\"");
        input.close();
    }

    public static void Ex06 (Scanner input){
        int opcao;
        double salario, imposto5 = 0, imposto10 = 0, imposto15 = 0, impostoTotal = 0;
        double novoSalario, aumento1 = 0, aumento2 = 0, aumento3 = 0, aumento4 = 0;
        boolean key = true;

        while (key) {
            System.out.println("""
                Menu de opções:
                1. Imposto
                2. Novo salário
                3. Classificação
                4. Finalizar o programa
                Digite a opção desejada.
                    """);
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o seu salário para o calculo de imposto: R$ ");
                    salario = input.nextInt();
                    if (salario < 1400) 
                        imposto5 = salario * 0.05;
                    if (salario > 1400 && salario < 2500)
                        imposto10 = (1400 * 0.05) + (salario - 1400) * 0.1;
                    if (salario > 2500)
                        imposto15 = (1400 * 0.5) + (1100 * 0.1) + ((salario - 2500) * 0.15);
                    
                    impostoTotal = (imposto10 + imposto5 + imposto15);
                    System.out.printf("O total de imposto pago com base em seu sálario é R$ %.2f", impostoTotal);
                    System.out.println("");    
                    break;
                case 2:
                    System.out.print("Insira o seu salário para o calculo de seu aumento: R$ ");
                    salario = input.nextInt();
                    if (salario < 1400) 
                        aumento1 = salario + 100;
                    if (salario > 1400 && salario < 2500)
                        aumento2 = salario + 175;
                    if (salario > 2500 && salario < 5000)
                        aumento3 = salario + 225;
                    if (salario > 5000)
                        aumento4 = salario +250;
                    novoSalario = (aumento1 + aumento2 + aumento3 + aumento4);
                    System.out.printf("O seu novo sálario com os aumentos é R$ %.2f", novoSalario);  
                    System.out.println("");      
                    break;
                case 3:

                    System.out.print("Insira o seu salário: R$ ");
                    salario = input.nextInt();

                    if(salario > 1400){
                        System.out.println("Você é bem remunerado.");
                        System.out.println("");    
                    }else{
                        System.out.println("Você é mau remunerado.");
                        System.out.println("");    
                    }
                    break;

                case 4:

                    System.out.println("Obrigado por utilizar o programa. ");
                    System.out.println("");    
                    key = false;
                    break;

                default:
                
                    System.out.println("Opçao inválida inserida.");
                    System.out.println("");    
                    break;
            }
        }
        input.close();
    }

    public static void Ex07 (Scanner input){
        String cidade;
        int carros, acidentes, mediaCarros = 0 ;
        int  maiorIndiceAcidentes = -100_000_000, menorIndiceAcidentes = 100_000_000;
        String maiorIndiceCidade = "", menorIndiceCidade = "";

        for(int i = 1; i <= 5; i++){
            System.out.printf("Insira o nome da %d° cidade: ", i);
            cidade = input.nextLine();
            System.out.print("Há quantos carros nesta cidade: ");
            carros = input.nextInt();
            System.out.print("Houveram quantos acidentes de transito com vitimas no ultimo ano? ");
            acidentes = input.nextInt();
            System.out.println();
            input.nextLine();
            mediaCarros += carros;

            if (acidentes > maiorIndiceAcidentes){
                maiorIndiceAcidentes = Math.max(maiorIndiceAcidentes, acidentes);
                maiorIndiceCidade = cidade;
            }
            if (acidentes < menorIndiceAcidentes){
                menorIndiceAcidentes = Math.min(menorIndiceAcidentes, acidentes);
                menorIndiceCidade = cidade;
            }

        }
        System.out.printf("O maior indice de transito pertence a %s com %d acidentes.\n", maiorIndiceCidade, maiorIndiceAcidentes);
        System.out.printf("O menor indice de acidentes de transito pertence a %s com %d acidentes.\n",menorIndiceCidade, menorIndiceAcidentes);
        System.out.println("A média de carros por cidade é de " +(mediaCarros/ 5.0)+ " carros por cidade");
        input.close();
    }

    public static void Ex08 (Scanner input){

        int  n;
        double soma = 1;
        System.out.print("Insira um valor: ");
        n = input.nextInt();

        for (double i = 2; i <= n; i++){
            soma += 1/i;
        }
        System.out.printf("O resultado da soma é %.2f", soma);
        input.close();
    }

    public static void Ex09 (Scanner input){
        int s = 1000, soma = 0;
        System.out.println("s= "+s);
        for (int i = 1; i <= 50; i++){
            s -= 3;
            if((i % 2) == 1){
                soma =  i - s;
            }else{
                soma =  i + s;
            }
        }
        System.out.println("A soma da sequencia é"+soma);
        input.close();
    }
}
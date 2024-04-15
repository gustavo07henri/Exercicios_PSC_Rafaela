import java.util.Scanner;

public class Main {

    public static void main(String[] args){
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
                case 0:
                    System.out.println("Obrigado por utilizar");
                default:
                    System.out.println("Opção inválida.");
                    break;
            } 
        input.close();

    }
    public static void Ex01(Scanner input){
        double num1, num2, resultado;
        
        System.out.println("Este programa irá fazer a divisão de dois números.");
        System.out.print("Insira o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Insira o segundo número: ");
        num2 = input.nextDouble();
        
        while (num2 == 0){
            if(num2 == 0){
                System.out.println("Não se pode fazer uma divisão com denominador (0)");
                System.out.println("Insira o segundo número novamente: ");
                num2 = input.nextDouble();   
            }else if(num2 != 0){
               resultado = num1 / num2;
               System.out.printf("O resultado da divisão de %.2f por %.2f é igual á %.2f", num1, num2, resultado);
            }
        }
        
        resultado = num1 / num2;
        System.out.printf("O resultado da divisão de %.2f por %.2f é igual á %.2f", num1, num2, resultado);
    }
    public static void Ex02(Scanner input){
        int nota1, nota2, nota3, media;
        
        System.out.println("Este programa irá calcular sua média nas três primeiras avaliações");
        System.out.print("Insira sua nota na primeira avalição: ");
        nota1 = input.nextInt();
        System.out.print("Insira sua nota na segunda avalição: ");
        nota2 = input.nextInt();
        System.out.print("Insira sua nota na terceira avalição: ");
        nota3 = input.nextInt();
        
        media = (nota1 + nota2 + nota3)/ 3;
        
        if (media > 7){
            System.out.println("Parabéns você esta aprovado.");
            System.out.printf("Sua média é %d o minimo seria 7.", media);
        }else if(media < 7){
            System.out.println("Infelizmente você esta reprovado.");
            System.out.printf("Sua média é %d o minimo seria 7.", media);
        }
    }
    public static void Ex03(Scanner input){
        double eleitores, brancos, nulos, validos;
        double brancos_porcentagem, nulos_porcentagem, validos_porcentagem;
        
        System.out.println("Este programa ira calcular a porcentagem de votos em um municipio");
        System.out.print("Insira a quantidade de eleitores no seu municipio: ");
        eleitores = input.nextInt();
        System.out.print("Isira a quantidade de votos brancos: ");
        brancos = input.nextInt();
        System.out.print("Insira a quantidade de votos nulos: ");
        nulos = input.nextInt();
        System.out.print("Insira a quantidade de votos validos: ");
        validos = input.nextInt();
        
        
        while((brancos + nulos + validos) != (eleitores)){
            System.out.println("Quantidade de votos totais difere da quantidade de eleitores. \n Insira novamente.");
            System.out.print("Isira a quantidade de votos brancos: ");
            brancos = input.nextInt();
            System.out.print("Insira a quantidade de votos nulos: ");
            nulos = input.nextInt();
            System.out.print("Insira a quantidade de votos validos: ");
            validos = input.nextInt();
        }
        
        brancos_porcentagem = (brancos * 100)/ eleitores;
        nulos_porcentagem = (nulos * 100) / eleitores;
        validos_porcentagem = (validos * 100) / eleitores;
        
        System.out.printf("Serão %.2f%% votos brancos\n ", brancos_porcentagem);
        System.out.printf("Serão %.2f%% votos nulos\n ", nulos_porcentagem);
        System.out.printf("Serão %.2f%% votos validos\n ", validos_porcentagem);
    }
    public static void Ex04(Scanner input){
        double salario, taxaAumento1 = 1.1, taxaAumento2 = 1.2, taxaAumento3 = 1.3;
        
        // Não é necessário dar um valor inicial ao salário
        
        System.out.print("Por favor, Informe o valor do salário atual: ");
        salario = input.nextDouble();
        
        // No exemplo ele utilizava apenas o if, utilizante tambem o else-if e else fica melhor.
        
        if(salario <= 1000){
            salario *= taxaAumento1;
        }else if (salario <= 2000){
            salario *= taxaAumento2;
        }else if (salario <= 3000){
            salario *= taxaAumento3;
        }else{
            salario = (salario * taxaAumento1) + 200;
        }
        
        System.out.printf("Novo salário: R$ %.2f\n\n", salario);
    }
    public static void Ex05(Scanner input){
        double peso, altura, imc;

        System.out.println("Este programa ira calcular o seu IMC (índice de massa corpórea).");
        System.out.print("Informe o seu peso em Kg: ");
        peso = input.nextDouble();
        System.out.print("Informe sua altura em cm: ");
        altura = input.nextDouble();

        imc = (peso / Math.pow(altura, 2) * 10000);

        if (imc < 20){
            System.out.printf("O seu IMC é %.0f .Você esta abaixo do peso.", imc);
        } else if (imc >= 20 && imc < 25) {
            System.out.printf("O seu IMC é %.0f .Você esta no peso normal.", imc);
        } else if (imc >= 25 && imc < 30) {
            System.out.printf("O seu IMC é %.0f .Você esta em sobrepeso.", imc);
        } else if (imc >= 30 && imc < 40) {
            System.out.printf("O seu IMC é %.0f .Você esta obeso.", imc);
        } else{
            System.out.printf("O seu IMC é %.0f .Você esta em obesidade mórbida.", imc);
        }

    }
    public static void Ex06(Scanner input){
        int escolha;
        System.out.println("""
                              Insira a opção correspondente a estação desejada
                              [1] - Primavera.
                              [2] - Verão.
                              [3] - Outono.
                              [4] - Inverno.
                              """);
        escolha = input.nextInt();

        switch (escolha){
            case 1:
                System.out.println("""
                        Primavera: Apresenta temperaturas amenas e agradáveis e aumento dos índices pluviométricos.
                        Os dias começam a ficar mais longos, e as noites passam a ser mais curtas.
                        A característica principal dessa estação é reflorescimento da flora terrestre.""" );
                break;
            case 2:
                System.out.println("""
                       Verão: Apresenta temperaturas elevadas e dias mais longos que as noites.
                       Nesse período, há aumento dos índices pluviométricos.
                       Essa estação do ano sucede a primavera e antecede o outono.
                       """ );
                break;
            case 3:
                System.out.println("""
                        Outono: É considerado um período de transição e caracteriza-se pelo declínio das temperaturas,
                        com exceção das regiões que se localizam próximo ao Equador. Nesse período,
                        as folhas das árvores apresentam tons amarelados e costumam cair, indicando mudança de estação.""" );
                break;
            case 4:
                System.out.println("""
                        Inverno: Caracteriza-se pela queda das temperaturas e, em alguns lugares do Hemisfério Sul,
                        pela ocorrência de geadas e nevascas. Apresenta dias mais curtos e noite mais longas em
                        decorrência da menor incidência solar. Nesse período, ocorrem migrações de diversas
                        espécies de animais para áreas com temperaturas mais elevadas.""");
            default:
                System.out.println("Você inseriu uma opção inválida.");
                break;
        }
        
        }
        public static void Ex07(Scanner input){
            String produto;
            double preco, valor_total, total_com_desconto;
            double quantidade;
    
            System.out.println("Este programa irá calcular o desconto e o valor final de sua compra.");
            System.out.print("Insira o produto desejado: ");
            produto = input.nextLine();
            System.out.print("Insira o valor do produto R$: ");
            preco = input.nextDouble();
            System.out.print("Insira a quantidade do produto: ");
            quantidade = input.nextInt();
    
            if (quantidade <= 5){
                valor_total = quantidade * preco;
                total_com_desconto = valor_total * 0.98;
                System.out.printf("O valor total de sua compra é R$ %.2f , com desconto de 2%% você pagara R$ %.2f", valor_total, total_com_desconto);
            } else if (quantidade >= 6 && quantidade <= 10) {
                valor_total = quantidade * preco;
                total_com_desconto = valor_total * 0.97;
                System.out.printf("O valor total de sua compra é R$ %.2f , com desconto de  3%% você pagara R$ %.2f", valor_total, total_com_desconto);
            } else if (quantidade >= 11 && quantidade < 30) {
                valor_total = quantidade * preco;
                total_com_desconto = valor_total * 0.95;
                System.out.printf("O valor total de sua compra é R$ %.2f , com desconto de  5%% você pagara R$ %.2f", valor_total, total_com_desconto);
            }else {
                valor_total = quantidade * preco;
                total_com_desconto = valor_total * 0.90;
                System.out.printf("O valor total de sua compra é R$ %.2f , com desconto de  10%% você pagara R$ %.2f", valor_total, total_com_desconto);
            }
    }
    public static void Ex08(Scanner input){
        double lado_a , lado_b , lado_c;
        boolean equilatero, isoceles, escaleno, verificacao = true;

        System.out.println("Este programa ira te dizer o tipo de triangulo a partir da medida de seus lados.");
        System.out.println("Lembrando que o comprimento de um lado deve ser menor que a soma dos outros dois.");
        System.out.print("Insira a medida do lado (A): ");
        lado_a = input.nextDouble();
        System.out.print("Insira a medida do lado (B): ");
        lado_b = input.nextDouble();
        System.out.print("Insira a medida do lado (C): ");
        lado_c = input.nextDouble();

        // While utilizado apenas para verificação das entradas
        while (verificacao) {
            equilatero = ((lado_a + lado_b + lado_c) / 3) == lado_a;
            isoceles = ((lado_a == lado_b) || (lado_a == lado_c) || (lado_b == lado_c)) && ((lado_a != lado_b) || (lado_a != lado_c) || (lado_b != lado_c));
            escaleno = (lado_a != lado_b) && (lado_a != lado_c) && (lado_b != lado_c);

            if (lado_a > (lado_b + lado_c)) {
                System.out.println("A medida de (A) está incorreta.");
                System.out.print("Insira a medida de (A) novamente: ");
                lado_a = input.nextDouble();
            } else if (lado_b > (lado_a + lado_c)) {
                System.out.println("A medida de (B) está incorreta.");
                System.out.print("Insira a medida de (B) novamente: ");
                lado_b = input.nextDouble();
            } else if (lado_c > (lado_b + lado_a)) {
                System.out.println("A medida de (C) está incorreta.");
                System.out.print("Insira a medida de (C) novamente: ");
                lado_c = input.nextDouble();
            } else {
                verificacao = false;
                if (equilatero) {
                    System.out.println("Este é um triângulo equilátero.");
                    break;
                } else if (isoceles) {
                    System.out.println("Este é um triângulo isósceles.");
                    break;
                } else if (escaleno) {
                    System.out.println("Este é um triângulo escaleno.");
                    break;
                }
            }
        }
    }
    public static void Ex09(Scanner input){
        int idade;

        System.out.println("Este programa ira dizer se você precisa, pode ou deve votar a partir de sua idade.");
        System.out.print("Informe sua idade por favor: ");
        idade = input.nextInt();

        if(idade < 16){
            System.out.println("Você ainda não pode votar.");
        }else if ((idade >= 16) && (idade < 18)){
            System.out.println("Você é um eleitor facultativo.");
        }else if ((idade >= 18) && (idade <= 65)){
            System.out.println("Você é um eleitor obrigatório.");
        }else if (idade < 0){
            System.out.println("Idade inserida inválida.");
        }else {
            System.out.println("Você é um eleitor facultativo.");
        }
    }
    public static void Ex10(Scanner input){
        double valor, valor_final;

        System.out.println("Lojinha do Sr. Aboo");
        System.out.print("Insira o valor da compra no fornecedor R$ ");
        valor = input.nextDouble();
        if (valor <= 0){
            System.out.println("Valor inválido inserido.");
        }else if (valor < 10){
            valor_final = valor * 1.7;
            System.out.println("Este produto deve ter 70%% de lucro. Deve ser vendido a R$ "+valor_final+" .");
        }else if ((valor >= 10) && (valor < 30)){
            valor_final = valor * 1.5;
            System.out.println("Este produto deve ter 50%% de lucro. Deve ser vendido a R$ "+valor_final+" .");
        }else if ((valor >= 30)&& (valor < 50)) {
            valor_final = valor * 1.4;
            System.out.println("Este produto deve ter 40%% de lucro. Deve ser vendido a R$ "+valor_final+" .");
        }else {
            valor_final = valor * 1.3;
            System.out.println("Este produto deve ter 30%% de lucro. Deve ser vendido a R$ "+valor_final+" .");
        }
    }
    public static void Ex11(Scanner input){
        int entrada_usuario;
        double deposito, saque;

        System.out.println("""
                Bem vindo ao banco XXXX-XXXX
                    DIGITE UM NÚMERO CORRESPONDENTE A UMA DAS OPÇÕES ABAIXO.
                    [1] -- EXIBIR SALDO
                    [2] -- EXIBIR EXTRATO
                    [3] -- REALIZAR DEPÓSITO
                    [4] -- REALIZAR SAQUE
                    [5] -- SAIR""");
        entrada_usuario = input.nextInt();

        switch (entrada_usuario){
            case 1:
                System.out.println("Seu saldo é de R$ XX,XX");
                break;
            case 2:
                System.out.println("""
                        saque realizado - R$ XX,XX DD/MM/AAAA
                        deposito realiza + R$ XX,XX DD/MM/AAAA
                        compra realizada - R$ XX,XX DD/MM/AAAA
                        transferência realizada - R$ XX,XX DD/MM/AAAA
                        
                        saldo - R$ XX,XX DD/MM/AAAA""");
                break;
            case 3:
                System.out.println("Insira o valor a ser depositado: ");
                deposito = input.nextDouble();
                break;
            case 4:
                System.out.println("Insira o valor que deseja sacar: ");
                saque = input.nextDouble();
                break;
            case 5:
                System.out.println("Muito obrigado");
                break;
            default:
                System.out.println("Opção inválida inserida.");
        }
    }
}

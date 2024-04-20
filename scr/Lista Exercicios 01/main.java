import java.util.Scanner;

public class main {
    
    public static void Main (String[] args) {
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
            13 -- Exercício 13
            14 -- Exercício 14
            15 -- Exercício 15
            16 -- Exercício 16
            17 -- Exercício 17
            18 -- Exercício 18
            19 -- Exercício 19
            20 -- Exercício 20
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
                case 13:
                    Ex13(input);
                    break;
                case 14:
                    Ex14(input);
                    break;
                case 15:
                    Ex15(input);
                    break;
                case 16:
                    Ex16(input);
                    break;
                case 17:
                    Ex14(input);
                    break;
                case 18:
                    Ex14(input);
                    break;
                case 19:
                    Ex14(input);
                    break;
                case 20:
                    Ex14(input);
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
        int numero1, numero2, soma;
        
        System.out.println("Digite um número: ");
        numero1 = input.nextInt();
        System.out.println("Digite outro número: ");
        numero2 = input.nextInt();
        
        soma = numero1 + numero2;
        
        System.out.println("A soma de"+ numero1+" + "+ numero2+" = "+ soma);
    }
    public static void Ex02(Scanner input){
        int numero1, numero2, resto;
        
        System.out.println("Digite um número: ");
        numero1 = input.nextInt();
        System.out.println("Digite outro número: ");
        numero2 = input.nextInt();
        
        resto = numero1 % numero2;
        
        System.out.printf("O resto da divisão de %d por %d é %d", numero1, numero2, resto);
               
    }
    public static void Ex03(Scanner input){
        String nome;

        System.out.println("Digite o seu nome: ");
        nome = input.nextLine();
        System.out.printf("O seu nome é %s %d",nome);
    }
    public static void Ex04(Scanner input){
        String nome, endereco, telefone; 
        
        System.out.println("Informe o seu nome: ");
        nome = input.nextLine();
        System.out.println("Informe seu endereço: ");
        endereco = input.nextLine();
        System.out.println("Informe seu telefone: ");
        telefone = input.nextLine();
                
        System.out.printf("Olá %s você reside em %s e seu número é %s", nome, endereco, telefone);

    }
    public static void Ex05(Scanner input){
        double dolar = 4.95, dolar_entrada, real_final;
        
        System.out.println("Digite o valor em Dolar para converter em Reais:");
        dolar_entrada = input.nextDouble();
        
        real_final = dolar_entrada * dolar;
        
        System.out.printf("Convertendo sua quantia de dolar para Real você teria R$ "+ real_final);
    }
    public static void Ex06(Scanner input){
        int idade, dias_vividos, ano = 365;
       
        System.out.println("Me informe sua idade: ");
        idade = input.nextInt();
        
        dias_vividos = idade * ano;
        
        System.out.printf("Com sua idade você viveu %d dias.", dias_vividos);
    }
    public static void Ex07(Scanner input){
        double salario, reajuste;
        
        System.out.println("Me informe o seu sálario ");
        salario = input.nextFloat();
        
        reajuste = (float)salario * 1.07;
        
        System.out.println("Seu salario com reajuste é R$ "+reajuste);

    }
    public static void Ex08(Scanner input){
        float metros_entrada, centimetros_saida;

        System.out.print("Por favor digite a medida que você quér converter em centímetros: ");
        metros_entrada = input.nextFloat();

        centimetros_saida = 100 * metros_entrada;

        System.out.printf("%2.2f metros é igual a %2.2f centímetros", metros_entrada, centimetros_saida);

    }
    public static void Ex09(Scanner input){
        double raio, area, pi;

        pi = Math.PI;

        System.out.print("Para calcular a área de um circulo é nescessário saber seu raio.\nInforme o raio em centimetros do circulo para saber sua área:  ");
        raio = input.nextDouble();

        area = pi * (raio * raio);

        System.out.printf("A área do circulo com o raio %2.2f cm é de %2.2f cm²", raio, area);
    }   
    public static void Ex10(Scanner input){
        int graus_celcius, fahrenheit;

        System.out.print("Digite a temperatura em Fahrenheit para converter em Graus Celcius: ");
        fahrenheit = input.nextInt();


        graus_celcius = (fahrenheit - 32) * 5/9;
        System.out.printf("%d° fahrenheit é igual á %d° em Graus Celcius.", fahrenheit, graus_celcius);

    }
    public static void Ex11(Scanner input){
        int nota_1, nota_2, nota_3, media;

        System.out.print("Digite sua nota na primeira matéria: ");
        nota_1 = input.nextInt();
        System.out.print("Digite sua nota na segunda matéria: ");
        nota_2 = input.nextInt();
        System.out.print("Digite sus nota na terceira matéria: ");
        nota_3 = input.nextInt();

        media = (nota_1 + nota_2 + nota_3)/3;

        System.out.printf("Sua média nas três matérias é %d",media);
    }
    public static void Ex12(Scanner input){
        int numero, antecessor;

        System.out.print("Digite um número: ");
        numero = input.nextInt();
        
        antecessor = numero - 1;

        System.out.printf("O antecessor de %d é %d.", numero, antecessor);
    }
    public static void Ex13(Scanner input){
        double valor_hora, salario_liquido;
        int horas_trabalhadas;

        System.out.print("Qual é o valor de sua hora de trabalho? ");
        valor_hora = input.nextDouble();
        System.out.print("Quantas horas você trabalha em um mês? ");
        horas_trabalhadas = input.nextInt();

        salario_liquido = (valor_hora * horas_trabalhadas) * 0.91 ;

        System.out.printf("Ganhando R$ %2.2f por hora, trabalhando %d horas por mês\n você receberá R$ %2.2f por mês com desconto do Inss.", valor_hora, horas_trabalhadas, salario_liquido);
    }
    public static void Ex14(Scanner input){
        int a , b, c;

        System.out.print("Digite um número para atribuir a A: ");
        a = input.nextInt();
        System.out.print("Digite um número para atribuir a B: ");
        b = input.nextInt();

        System.out.printf("(A) vale %d e (B) vale %d.", a, b);
        c = a;
        a = b;
        b = c;
        System.out.printf("\nAgora (A) vale %d e (B) vale %d.",a ,b);

    }
    public static void Ex15(Scanner input){
        int a, b, c;
        double delta, x1, x2;

       
        System.out.println("Vamos resolver a equação (Ax²+Bx+C) em que você fornecera o valor de A, B e C.");
        System.out.print("Forneça um valor para A: ");
        a = input.nextInt();
        System.out.print("Forneça um valor para B: ");
        b = input.nextInt();
        System.out.print("Forneça um valor para C: ");
        c = input.nextInt();
        
        delta = (b*b)-4*a*c;
       
        //Este programa NaN para as raizes quando o valor do delta der negativo (Não existe raiz quadrada de número negativo)
        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);

        System.out.printf("Em raises da equação são para X1 %2.2f e para X2 %2.2f", x1, x2);

    }
    public static void Ex16(Scanner input){
        double distancia, combustivel, consumo;

        System.out.print("Digite a distancia em Km que percorreu com seu carro: ");
        distancia = input.nextDouble();
        System.out.print("Digite a quantidade de litros de combustivel gasta para percorrer essa distancia: ");
        combustivel = input.nextDouble();

        consumo = distancia / combustivel;

        System.out.printf("Percorrendo %1.2f Km consumindo %1.2f litros de cobustivel você tera um consumo médio de %.2f Km/l.", distancia, combustivel, consumo);

    }
    public static void Ex17(Scanner input){
        double numero_canetas, valor_pago, troco, valor_caneta;

        System.out.print("Quantas canetas foram adquiridas? ");
        numero_canetas = input.nextDouble();
        System.out.print("Qual nota foi utilizada para pagar? ");
        valor_pago = input.nextDouble();
        System.out.print("Qual foi o troco recebido? ");
        troco = input.nextDouble();

        valor_caneta = (valor_pago - troco) / numero_canetas;

        System.out.printf("O valor pago por cada caneta foi de R$ %2.2f.", valor_caneta);
    }
    public static void Ex18(Scanner input){
        double altura_degrau, altura_desejada, degrau_necessarios;

        System.out.print("Qual a altura de cada degrau em metros? ");
        altura_degrau = input.nextDouble();
        System.out.print("Qual a altura que deseja alcançar em metros? ");
        altura_desejada = input.nextDouble();

        degrau_necessarios = (int) (altura_desejada / altura_degrau);

        System.out.printf("Você devera subir %2.2f degraus para atingir seu objetivo.", degrau_necessarios);

    }
    public static void Ex19(Scanner input){
        double numero, quadrado, cubo;

            System.out.println("Número                       Quadrado                       Cubo");
            numero = 0;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                            %.0f\n", numero, quadrado, cubo);

            numero = 1;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                            %.0f\n", numero, quadrado, cubo);

            numero = 2;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                            %.0f\n", numero, quadrado, cubo);

            numero = 3;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                            %.0f\n", numero, quadrado, cubo);

            numero = 4;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 5;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 6;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 7;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 8;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 9;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                              %.0f                           %.0f\n", numero, quadrado, cubo);

            numero = 10;
            quadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.printf(" %.0f                             %.0f                          %.0f\n", numero, quadrado, cubo);

    }
    public static void Ex20(Scanner input){
        String codigo_1, codigo_2;
        double ipi, preco_1, preco_2, total_pagar, total_peca_1, total_peca_2;
        int quantidade_1, quantidade_2;

        System.out.print("Insira a porcentagem do IPI: ");
        ipi = input.nextDouble();
        System.out.print("Insira o código da primeira peça: ");
        codigo_1 = input.next();
        System.out.print("Insira a quantidade desta peça: ");
        quantidade_1 = input.nextInt();
        System.out.print("Insira o valor da mesma: ");
        preco_1 = input.nextDouble();

        System.out.print("Insira o código da segunda peça: ");
        codigo_2 = input.next();
        System.out.print("Insira a quantidade desta peça: ");
        quantidade_2 = input.nextInt();
        System.out.print("Insira o valor da mesma: ");
        preco_2 = input.nextDouble();

        total_peca_1 = (ipi/100 + 1) * (preco_1 * quantidade_1);
        total_peca_2 = (ipi/100 + 1) * (preco_2 * quantidade_2);
        total_pagar = total_peca_1 + total_peca_2;

        System.out.printf("%s: %d de peças a R$ %2.2f cada gera um total de R$ %2.2f já acrescido do IPI \n", codigo_1, quantidade_1, preco_1, total_peca_1);
        System.out.printf("%s: %d de peças a R$ %2.2f cada gera um total de R$ %2.2f já acrescido do IPI \n", codigo_2, quantidade_2, preco_2, total_peca_2);
        System.out.printf("O valor total a pagar pela compra dos dois tipos de peça será de R$ %2.2f já acrescido do IPI.", total_pagar);
    }
}

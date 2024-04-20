import java.util.Objects;
import java.util.Scanner;

public class main {

    public static void main (String[] args){
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
                case 0:
                    System.out.println("Obrigado por utilizar");
                default:
                    System.out.println("Opção inválida.");
                    break;
            } 
        input.close();
    }
    public static void Ex01(Scanner input){
        double hora, minuto, minutos_total_dia;

        System.out.print("Informe a hora do momento (HH:--): ");
        hora = input.nextDouble();
        System.out.print("Informe os minutos agora (--:MM): ");
        minuto = input.nextDouble();

        minutos_total_dia = (hora * 60) + minuto;

        System.out.printf("No dia de hoje se passaram %.0f minutos desde o inicio do dia.", minutos_total_dia);

    }
    public static void Ex02(Scanner input){
        double gasolina, etanol, percentual;

        System.out.print("Insira o valor da Gasolina: ");
        gasolina = input.nextDouble();
        System.out.print("Insira o valor do etanol: ");
        etanol = input.nextDouble();

        percentual = (etanol * 100) / gasolina;

        if (percentual > 70){
            System.out.println("Baseado no valor dos combustíveis você deve escolher gasolina.");
            System.out.printf("Já que o etanol custa %.0f porcento do preço da gasolina.", percentual);
        }else {
            System.out.println("Baseado no valor dos combustíveis você deve escolher etanol.");
            System.out.printf("Já que o etanol custa %.0f porcento do preço da gasolina.", percentual);

        }

    }
    public static void Ex03(Scanner input){
        double c, a , b;

        System.out.println("Este programa calcula o teorema de Pitágoras, utilizado para descobrir o valor da hipotenusa.");
        System.out.print("Insira o valor do cateto adjacente: ");
        a = input.nextDouble();
        System.out.print("Insira o valor do cateto oposto: ");
        b = input.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("O valor da hipotenusa é %.2f", c);

    }
    public static void Ex04(Scanner input){
        double grandezaUm, grandezaDois, grandezaTres, xDaQuestao;

        System.out.println("Regra de três é um método matemático que possibilita encontrar um valor até então desconhecido,\nconsiderando a proporcionalidade entre as variáveis já conhecidas. \nEssas variáveis podem ser diversas, tais como área, tempo, dinheiro etc.\n");
        System.out.print("Insira o valor da primeira grandeza: ");
        grandezaUm = input.nextDouble();
        System.out.print("Insira a sua proporção: ");
        grandezaDois = input.nextDouble();
        System.out.print("Insira a terceira grandeza: ");
        grandezaTres = input.nextDouble();

        xDaQuestao = (grandezaTres * grandezaDois) / grandezaUm;

        System.out.printf("O valor de 'X' é %.2f .", xDaQuestao);
    }
    public static void Ex05(Scanner input){
        double base, altura, area, perimetro, diagonal;

        System.out.println("Este programa irá calcular a área, perímetro e diagonal de um retângulo.");
        System.out.print("Primeiro me informe o valor base do retângulo em cm: ");
        base = input.nextDouble();
        System.out.print("Agora informe o valor da altura do retângulo em cm: ");
        altura = input.nextDouble();

        area = base * altura;
        perimetro = (2 * base) + (altura * 2);
        diagonal = Math.sqrt((Math.pow(base,2)) + (Math.pow(altura,2)));

        System.out.printf("Á área deste retângulo é %.2f cm\n", area);
        System.out.printf("O perímetro deste retângulo é %.2f cm\n", perimetro);
        System.out.printf("O comprimento da diagonal deste retângulo é %.2f cm\n", diagonal);

    }
    public static void Ex06(Scanner input){
        double comprimento, largura, area, revestimento, alturaRevestimento, larguraRevestimento, numeroRevestimento;

        System.out.println("Este programa irá calcular a m² de uma superfície para calculo de revestimento.");
        System.out.print("Insira o comprimento da superfície em metros: ");
        comprimento = input.nextDouble();
        System.out.print("Insira a largura da superfície em metros: ");
        largura = input.nextDouble();
        System.out.print("Informe agora as dimensões do revestimento começando pela altura em Cm: ");
        alturaRevestimento = input.nextDouble();
        System.out.print("Informe agora a largura do revestimento em Cm: ");
        larguraRevestimento = input.nextDouble();

        area = comprimento * largura;
        revestimento = alturaRevestimento * larguraRevestimento;
        numeroRevestimento = (area / (revestimento / 10000)) * 1.1;

        System.out.printf("Á área da superfície em que será aplicado o revestimento é %.0f cm².\n",area);
        System.out.printf("Serão necessários %.0f peças de revestimento para cobrir esta superfície.", numeroRevestimento);


    }
    public static void Ex07(Scanner input){
        double comprimento, largura, area, revestimento, alturaRevestimento, larguraRevestimento, numeroRevestimento, valorUnitario, custoTotal;

        System.out.println("Este programa irá calcular a m² de uma superfície para calculo de revestimento e custo.");
        System.out.print("Insira o comprimento da superfície em metros: ");
        comprimento = input.nextDouble();
        System.out.print("Insira a largura da superfície em metros: ");
        largura = input.nextDouble();
        System.out.print("Informe agora as dimensões do revestimento começando pela altura em Cm: ");
        alturaRevestimento = input.nextDouble();
        System.out.print("Informe agora a largura do revestimento em Cm: ");
        larguraRevestimento = input.nextDouble();
        System.out.print("Informe o valor unitário de cada peça R$ ");
        valorUnitario = input.nextDouble();


        area = comprimento * largura;
        revestimento = alturaRevestimento * larguraRevestimento;
        numeroRevestimento = (area / (revestimento / 10000)) * 1.1;
        custoTotal = numeroRevestimento * valorUnitario;

        System.out.printf("Á área da superfície em que será aplicado o revestimento é %.0f cm².\n",area);
        System.out.printf("Serão necessários %.0f peças de revestimento para cobrir esta superfície.\n", numeroRevestimento);
        System.out.printf("O custo total deste revestimento será de R$ %.2f.", custoTotal);


    }
    public static void Ex08(Scanner input){

        int tamanho_arquivo, velocidade_internet, tempo_gasto_minutos, tempo_gasto_segundos;

        System.out.println("Este programa irá calcular o tempo gasto para fazer o download de um arquivo.\n");
        System.out.print("Informe o tamanho do arquivo em MB: ");
        tamanho_arquivo = input.nextInt();
        System.out.print("Informe a velocidade do link de internet em Mbps: ");
        velocidade_internet = input.nextInt();

        tamanho_arquivo = tamanho_arquivo * 8;
        tempo_gasto_minutos = (tamanho_arquivo / velocidade_internet) / 60;
        tempo_gasto_segundos = (tamanho_arquivo / velocidade_internet) % 60;

        System.out.printf("Você gastara %d min %d s para fazer o download do arquivo.", tempo_gasto_minutos, tempo_gasto_segundos);

    }
    public static void Ex09(Scanner input){
        double peso, altura , imc, imc_ajustado;
        String sexo;

        System.out.println("Este programa ira calcular o IMC de uma pessoa\n");
        System.out.print("Informe seu peso em Kg: ");
        peso = input.nextDouble();
        System.out.print("Informe sua altura em Cm: ");
        altura = input.nextDouble();
        System.out.print("Informe agora o seu sexo utilizando (F) para feminino e (M) para masculino: ");
        sexo = input.next().toUpperCase();


        if (Objects.equals(sexo, "M")){
            imc = 52 + (0.75 * (altura - 152.4));
            imc_ajustado = ((peso - imc) * 0.25) + imc;

            System.out.printf("o seu peso ideal é de %.2f kg\n", imc);
            System.out.printf("Já o seu peso ideal ajustado é %.2f kg", imc_ajustado);

        } else if (Objects.equals(sexo, "F")) {
            imc = 52 + (0.67 * (altura - 152.4));
            imc_ajustado = ((peso - imc) * 0.25) + imc;

            System.out.printf("o seu peso ideal é de %.2f kg\n", imc);
            System.out.printf("Já o seu peso ideal ajustado é %.2f kg", imc_ajustado);


        }else {
            System.out.println("Digite uma opção válida.");
        }
    }
    public static void Ex10(Scanner input){
        double peso, agua_recomendada;

        System.out.println("Este programa calcula a quantidade de água que deve ser ingerida com base no seu peso.\n");
        System.out.print("Informe o seu peso em Kg: ");
        peso = input.nextDouble();

        agua_recomendada = peso * 0.035;

        System.out.printf("Segundo a organização mundial da saúde você deve ingerir %.1f litros de água por dia.", agua_recomendada);

    }
    public static void Ex11(Scanner input){
        double consumo_equipamento, potencia_equipamento, valor_Kw, horas_ligado, custo;

        System.out.println("Este programa calcula consumo de um equipamento e o custo disto.\n");
        System.out.print("Informe a potência de um equipamento em Watts:  ");
        potencia_equipamento = input.nextDouble();
        System.out.print("Informe quantas horas este equipamento fica ligado por dia:  ");
        horas_ligado = input.nextDouble();
        System.out.print("Informe o valor do KW/h em sua região: ");
        valor_Kw = input.nextDouble();

        consumo_equipamento = (potencia_equipamento * horas_ligado) / 1000;
        custo = consumo_equipamento * valor_Kw;

        System.out.printf("O seu equipamento tem um consumo diário de %.2f KW/h por dia\n", consumo_equipamento);
        System.out.printf("O funcionamento deste equipamento terá um custo de R$ %.2f por dia.", custo);


    }
    public static void Ex12(Scanner input){
        double  potencia_equipamento, valor_Kw, horas_ligado, custo_mensal, consumo_mensal;

        System.out.println("Este programa calcula consumo mensal de um equipamento e o custo disto.\n");
        System.out.print("Informe a potência de um equipamento em Watts:  ");
        potencia_equipamento = input.nextDouble();
        System.out.print("Informe quantas horas este equipamento fica ligado por dia:  ");
        horas_ligado = input.nextDouble();
        System.out.print("Informe o valor do KW/h em sua região: ");
        valor_Kw = input.nextDouble();

        consumo_mensal = ((potencia_equipamento * horas_ligado) / 1000) * 30;
        custo_mensal = consumo_mensal * valor_Kw;

        System.out.printf("O seu equipamento tem um consumo mensal de %.2f KW/h por dia\n", consumo_mensal);
        System.out.printf("O funcionamento deste equipamento terá um custo de R$ %.2f mensalmente.", custo_mensal);

    }
    public static void Ex13(Scanner input){
        int denominador_um , denominador_dois , numerador_um, numerador_dois, soma, multiplicacao_denominador;

        System.out.println("Este programa ira realizar a soma de duas frações.");
        System.out.print("Insira o numerador da primeira fração: ");
        numerador_um = input.nextInt();
        System.out.print("Insira o denominador da primeira fração: ");
        denominador_um = input.nextInt();
        System.out.print("Insira o numerador da segunda fração: ");
        numerador_dois = input.nextInt();
        System.out.print("Insira o denominador da segunda fração: ");
        denominador_dois = input.nextInt();


        multiplicacao_denominador = (denominador_um * denominador_dois);
        soma = (numerador_um * denominador_dois) + (numerador_dois * denominador_um);

        System.out.printf("A soma de: %d/%d + %d/%d = %d/%d ", numerador_um, denominador_um, numerador_dois, denominador_dois, soma, multiplicacao_denominador);
    }
    public static void Ex14(Scanner input){
        double p1x1, p1y1, p2x2, p2y2, distancia;

        System.out.println("Este programa ira calcular a distancia entre dois pontos no plano cartesiano fornecidos pelo usuário.");
        System.out.print("Insira os dados do ponto 1, primeiro o valor de [X]: ");
        p1x1 = input.nextInt();
        System.out.print("Insira os dados do ponto 1, agora o valor de [Y]: ");
        p1y1 = input.nextInt();
        System.out.print("Insira os dados do ponto 2, primeiro o valor de [X]: ");
        p2x2 = input.nextInt();
        System.out.print("Insira os dados do ponto 2, agora o valor de [Y]: ");
        p2y2 = input.nextInt();

        distancia = Math.sqrt(Math.pow((p1x1 - p2x2),2) + Math.pow((p1y1 - p2y2),2));

        System.out.printf("O valor da distancia entre os dois pontos é %.2f", distancia);


    }
}

package exercicio03;

import java.util.Scanner;

// Crie um algoritmo que leia o valor do salário de um usuário, calcule a quantidade de salários mínimos
// que esse usuário ganha e imprima o resultado. (1SM=R$1.212,00).
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis com Valores definidos
        double salarioMin = 1212.00;

        // Cabeçalho
        System.out.println("-----------------------------------");
        System.out.println("Boas-vindas à Calculadora de Salários Mínimos!");
        System.out.println("-----------------------------------");

        // Entrada de dados
        System.out.println("Digite o valor do seu salário: ");
        double salarioRecebido = sc.nextDouble();

        // Cálculo da quantidade de salários
        double qtdSalarios = salarioRecebido/salarioMin;

        // Saída de dados
        System.out.printf("Você recebe %.4f SM", qtdSalarios );

    }
}

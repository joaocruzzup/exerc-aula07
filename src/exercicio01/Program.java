package exercicio01;
// João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
// (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente. João precisa que você faça um programa que leia a
// variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos
// além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa
// com as mensagens adequadas.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis com valores definidos
        double multa = 4.0;
        double limite = 50.0;
        String nome = "João Papo-de-Pescado";

        // Entrada de dados
        System.out.println("Boas vindas ao Sistema de rendimento diário, " + nome + "!");
        System.out.println("Informe o peso do peixe:");
        double peso = sc.nextDouble();

        // Cálculo da Diferença
        double diferencaPeso = peso - limite;
        double excesso = Math.max(diferencaPeso, 0); // Caso o valor de diferencaPeso seja negativo, o Math.Max retornará 0
        double valorPagamento = multa * excesso;

        // Saída de dados
        System.out.println("O excesso calculado foi de: " + excesso + " Kg");
        System.out.println("Você terá que pagar: R$" + valorPagamento + " de multa");
    }
}

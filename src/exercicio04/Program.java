package exercicio04;

import java.util.Scanner;

//  Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
//  Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cabeçalho
        System.out.println("-----------------------------------");
        System.out.println("Boas-vindas ao Conversor de Idade em Dias!");
        System.out.println("Você precisará informar a sua idade completa, ou seja, anos, meses e dias!");
        System.out.println("Confuso? Segue um exemplo: 23 anos, 5 meses e 25 dias de Idade");
        System.out.println("-----------------------------------");

        // Entrada de dados
        System.out.println("Digite a sua quantidade de anos: ");
        int anos = sc.nextInt();
        System.out.println("Digite a sua quantidade de meses: ");
        int meses = sc.nextInt();
        System.out.println("Digite a sua quantidade de dias: ");
        int dias = sc.nextInt();

        // Calculo
        int idadeDias = (anos * 365) + (meses * 30) + (dias);

        // Saida de dados
        System.out.println("-----------------------------------");
        System.out.println("Sua idade em dias é: " + idadeDias);


    }
}

package exercicio02;

import java.util.Scanner;

// Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
// OBS:  Fórmula: IMC = peso/ (altura x altura).
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cabeçalho
        System.out.println("-----------------------------------");
        System.out.println("Boas-vindas à Calculadora de IMC!");
        System.out.println("-----------------------------------");

        // Entrada de dados
        System.out.println("Digite a sua altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.println("Digite o seu peso (em Kg): ");
        double peso = sc.nextDouble();

        // Calculo do IMC
        double imc = peso / (altura * altura);

        // Saida de dados
        System.out.println("-----------------------------------");
        System.out.printf("O seu IMC é: %.2f Kg/m²", imc );
    }
}

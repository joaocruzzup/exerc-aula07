package exercicio02;

import java.util.Scanner;

// Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
// OBS:  Fórmula: IMC = peso/ (altura x altura).
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo à Calculadora de IMC");
        System.out.println("Digite a sua altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.println("Digite o seu peso (em Kg): ");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: %.2f Kg/m²", imc );
    }
}

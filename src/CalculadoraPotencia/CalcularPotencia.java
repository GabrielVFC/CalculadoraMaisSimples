package CalculadoraPotencia;

import java.util.Scanner;

public class CalcularPotencia {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        CalculosPotencia variaveis = new CalculosPotencia();

        System.out.println("Digite um número:");

        variaveis.numero = dado.nextInt();

        System.out.println("O número %d ao quadrado é: %d".formatted(variaveis.numero, variaveis.potencia()));
    }
}

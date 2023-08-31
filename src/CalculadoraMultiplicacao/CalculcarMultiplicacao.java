package CalculadoraMultiplicacao;

import java.util.Scanner;

public class CalculcarMultiplicacao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        CalculosMultiplicacao variaveis = new CalculosMultiplicacao();

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um número:");
            variaveis.numero = dado.nextInt();

        }
        System.out.println("A multiplicação de todos os número é: %d".formatted(variaveis.totalMultiplicacao()));
    }
}

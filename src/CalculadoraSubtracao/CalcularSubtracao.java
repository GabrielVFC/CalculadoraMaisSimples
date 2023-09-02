package CalculadoraSubtracao;

import java.util.Scanner;

public class CalcularSubtracao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        CalculosSubtracao variaveis = new CalculosSubtracao();

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite um número:");
            variaveis.total(dado.nextInt());
        }

        System.out.println("A subtraçao de todos os número é: %d".formatted(variaveis.totalSubtracao()));
    }


}

package CalculadoraDivisao;

import java.util.Scanner;

public class CalcularDivisao {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        CalculosDivisao variaveis = new CalculosDivisao();

        for (int i = 0; i < 1; i++) {
            System.out.println("Digite um número: ");
            variaveis.numero1 = dado.nextInt();
            System.out.println("Digite um número: ");
            variaveis.numero2 = dado.nextInt();

            if (variaveis.numero2 == 0){
                System.out.println("Impossivel de fazer a divisão!");
                break;
            } else {
                System.out.println("A divisão dos dois números é: %.2f".formatted(variaveis.totalDivisao()));
            }
        }


    }
}

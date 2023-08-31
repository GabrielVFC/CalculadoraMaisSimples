package CalculadoraSoma;

import java.util.Scanner;

public class CalcularSoma {
    public static void main(String[] args) {
        //Criação de entrada de dados pelo usuario
        Scanner digite = new Scanner(System.in);

        //Classe criada para armazenar os calculos
        CalculosSoma variaveis = new CalculosSoma();

        //O usuario irá escrever os numeros para serem calculados

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            variaveis.numero = digite.nextInt();
        }
        //Saída dos calculos feito pelo programa
        System.out.println("A soma de todos os número é: %d".formatted(variaveis.totalSoma()));
        }
    }

package CalculadoraDivisao;

public class CalculosDivisao {
    int numero1, numero2;

    void total (int numeros){
        numero1 /= numeros;
        numero2 /= numeros;
    }

    double totalDivisao (){
        return (double) numero1 / numero2;
    }
}

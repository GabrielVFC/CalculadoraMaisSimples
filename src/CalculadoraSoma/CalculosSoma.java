package CalculadoraSoma;

public class CalculosSoma {
    //Variaveis criados para usar nos calculos
    int numero;

    // Calculos das entradas de numero
    void total (int numeros){
        numero += numeros;
    }

    //Retorna o total dos valores
    int totalSoma (){
        return numero;
    }
}

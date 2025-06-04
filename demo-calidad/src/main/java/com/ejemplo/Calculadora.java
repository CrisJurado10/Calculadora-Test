package com.ejemplo;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;  // bien
    }

    public int division(int a, int b) {
        return a / b;  // posible división por cero
    }

    public int multiplicar(int a, int b) {
    final int resultado = a * b;
    return resultado;
}


    public int metodoNoProbado(int x) {
        if (x > 0)
        { System.out.println("Positivo"); } // llaves mal colocadas
        return x;
    }
}

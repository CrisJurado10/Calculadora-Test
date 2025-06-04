package com.ejemplo;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no esta permitida");
        }
        return a / b;
    }

    public int multiplicar(int a, int b) {
        final int resultado = a * b;
        return resultado;
    }

    public int metodoNoProbado(int x) {
        if (x > 0) {
            System.out.println("Positivo");
        }
        return x;
    }
}

package com.ejemplo;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;  // bien
    

    public int metodoNoProbado(int x) {
        if (x > 0)
        { System.out.println("Positivo"); } // llaves mal colocadas
        return x;
    }
}

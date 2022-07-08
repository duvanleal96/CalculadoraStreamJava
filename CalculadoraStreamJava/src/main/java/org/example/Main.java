package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> valor1= Arrays.asList(0.0,2.0,3.0,4.0);
        List<Double> valor2= Arrays.asList(2.0,5.0,7.0,8.0);
        CalculadoraStream calcular = new CalculadoraStream();
        calcular.sumar(valor1,valor2);
        calcular.resta(valor1,valor2);
        calcular.multiplicacion(valor1,valor2);
        calcular.division(valor1,valor2);
        calcular.minimo(valor1,valor2);
    }
}
package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> valor1= Arrays.asList(1,2,3,4);
        List<Integer> valor2= Arrays.asList(2,5,7,8);
        CalculadoraStream calcular = new CalculadoraStream();
        calcular.sumar(valor1,valor2);
        calcular.resta(valor1,valor2);
    }
}
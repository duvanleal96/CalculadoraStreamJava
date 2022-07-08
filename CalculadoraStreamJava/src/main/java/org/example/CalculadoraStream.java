package org.example;

import java.util.List;

public class CalculadoraStream {


    public void sumar(List<Double> valor1,List<Double>valor2) {
          valor1.stream()
                .map(number->{
                    int contador = valor1.indexOf(number);
                    return number + valor2.get(contador);
                }).forEach(e -> System.out.println("La suma es : " + e));
    }
    public void resta(List<Double> valor1,List<Double>valor2) {
        valor1.stream()
                .map(number->{
                    int contador = valor1.indexOf(number);
                    return number - valor2.get(contador);
                }).forEach(e -> System.out.println("La resta es : " + e));
    }
    public void multiplicacion(List<Double> valor1,List<Double>valor2) {
        valor1.stream()
                .map(number->{
                    int contador = valor1.indexOf(number);
                    return number * valor2.get(contador);
                }).forEach(e -> System.out.println("La multiplicacion es : " + e));
    }
    public void division(List<Double> valor1,List<Double>valor2) {
        valor1.stream()
                .filter(e -> e > 0)
                .map(number->{
                    int contador = valor1.indexOf(number);
                    return number / valor2.get(contador);
                }).forEach(e -> System.out.println("la division : " + e));
    }
    public void minimo(List<Double> valor1,List<Double>valor2){
        valor1.stream()
                .min((i, j) -> i.compareTo(j))
                .ifPresent(e->System.out.println("el numero minimo del arreglo 1 es "+ e));
        valor2.stream()
                .min((i, j) -> i.compareTo(j))
                .ifPresent(e->System.out.println("el numero minimo del arreglo 2 es "+ e));
    }

}






package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CalculadoraStream {


    public void sumar(List<Integer> valor1,List<Integer>valor2) {
          valor1.stream()
                .map(number->{
                    int contador = valor1.indexOf(number);
                    return number + valor2.get(contador);
                }).forEach(System.out::println);
    }
    public void resta(List<Integer> valor1,List<Integer>valor2) {
        valor1.stream()
                .map(number->{
                    int contador = valor1.indexOf(number);
                    return number - valor2.get(contador);
                }).forEach(System.out::println);
    }


}






package br.com.figurasgeometricas.imprimir;

import br.com.figurasgeometricas.poligonos.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Poligono quadrado = new Poligono(new BigDecimal("4"), new BigDecimal("3"));
        Poligono triangulo = new Poligono(new BigDecimal("4.1"), new BigDecimal("5.9"));
        Poligono retangulo = new Poligono(new BigDecimal("2"), new BigDecimal("6"));

        CalculoDeArea calculoArea = new CalculoDeArea();
        System.out.println(calculoArea.calcularArea(quadrado, new Quadrado()));
        System.out.println(calculoArea.calcularArea(triangulo, new Triangulo()));
        System.out.println(calculoArea.calcularArea(retangulo, new Retangulo()));

    }
}
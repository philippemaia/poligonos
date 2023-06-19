package br.com.figurasgeometricas.poligonos;

import java.math.BigDecimal;

public class Triangulo implements FiguraGeometrica{
    @Override
    public BigDecimal calcularArea(Poligono poligono) {
        return poligono.getBase().multiply(poligono.getAltura()).divide(new BigDecimal("2"));
    }
}

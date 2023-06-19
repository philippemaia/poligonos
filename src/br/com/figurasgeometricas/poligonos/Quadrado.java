package br.com.figurasgeometricas.poligonos;

import java.math.BigDecimal;

public class Quadrado implements FiguraGeometrica{


    @Override
    public BigDecimal calcularArea(Poligono poligono) {
        return poligono.getBase().multiply(poligono.getBase());
    }
}

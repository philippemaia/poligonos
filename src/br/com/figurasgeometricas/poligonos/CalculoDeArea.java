package br.com.figurasgeometricas.poligonos;

import java.math.BigDecimal;

public class CalculoDeArea {

    public BigDecimal calcularArea(Poligono poligono, FiguraGeometrica figura){
        return figura.calcularArea(poligono);
    }
}

package br.com.figurasgeometricas.poligonos;

import java.math.BigDecimal;

public class Poligono {

    private BigDecimal base;
    private BigDecimal altura;

    public Poligono(BigDecimal base, BigDecimal altura) {
        this.base = base;
        this.altura = altura;
    }

    public BigDecimal getBase() {
        return base;
    }

    public BigDecimal getAltura() {
        return altura;
    }
}

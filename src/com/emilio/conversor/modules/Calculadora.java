package com.emilio.conversor.modules;

import java.io.IOException;

public class Calculadora {
    private Consulta consulta = new Consulta();
    public String convertir(String codigoInicial, String codigoFinal, float cantidad) throws IOException, InterruptedException {
        Moneda monedaInicial = consulta.consultar(codigoInicial);

        return "$" + cantidad + " " + codigoInicial + " son: $" + cantidad * monedaInicial.conversion_rates().get(codigoFinal) + " " + codigoFinal;
    }

}

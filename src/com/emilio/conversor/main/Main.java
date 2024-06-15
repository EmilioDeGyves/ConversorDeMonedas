package com.emilio.conversor.main;

import com.emilio.conversor.modules.Calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner usuario = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String menu = "*****************************************************************************+" +
                "Bienvenido al conversor de monedas :] \n" +
                "1) Dólar => Peso argentino\n" +
                "2) Peso argentino => Dólar\n" +
                "3) Dólar => Real brasileño\n" +
                "4) Real brasileño => Dólar\n" +
                "5) Dólar => Peso colombiano\n" +
                "6) Peso colombiano => Dólar\n" +
                "7) Dólar => Peso mexicano\n" +
                "8) Peso mexicano => Dólar\n" +
                "9) Salir\n" +
                "Elija una opción válida:\n" +
                "*****************************************************************************+";
        while(true) {
            System.out.println(menu);
            try {
                int eleccion = usuario.nextInt();
                if (eleccion == 9) {
                    break;
                }
                System.out.println("Ingrese la cantidad a convertir: ");
                try {
                    float cantidad = usuario.nextFloat();

                    switch (eleccion) {
                        case 1:
                            System.out.println(calculadora.convertir("USD", "ARS", cantidad));
                            break;
                        case 2:
                            System.out.println(calculadora.convertir("ARS", "USD", cantidad));
                            break;
                        case 3:
                            System.out.println(calculadora.convertir("USD", "BRL", cantidad));
                            break;
                        case 4:
                            System.out.println(calculadora.convertir("BRL", "USD", cantidad));
                            break;
                        case 5:
                            System.out.println(calculadora.convertir("USD", "COP", cantidad));
                            break;
                        case 6:
                            System.out.println(calculadora.convertir("COP", "USD", cantidad));
                            break;
                        case 7:
                            System.out.println(calculadora.convertir("USD", "MXN", cantidad));
                            break;
                        case 8:
                            System.out.println(calculadora.convertir("MXN", "USD", cantidad));
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("ha ocurrido un error: " + e.getMessage());
                }
            }catch(Exception e){
                System.out.println("ha ocurrido un error: " + e.getMessage());
            }
        }
        System.out.println("Programa Finalizado");


    }
}

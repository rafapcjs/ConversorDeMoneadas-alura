package com.aluracursos.conversorDeMonedas.Metodos;

import java.util.Scanner;


public class SeleccionarMoneda {

    private static final String USD = "USD";
    private static final String COP = "COP";
    private static final String BRL = "BRL";
    private static final String EUR = "EUR";
    private static final String ARS = "ARS";

    private static final String NOMBRE_DOLAR = "Dólar";
    private static final String NOMBRE_PESO_COLOMBIANO = "Peso Colombiano";
    private static final String NOMBRE_REAL_BRASILENO = "Real Brasileño";
    private static final String NOMBRE_EURO = "Euro";
    private static final String NOMBRE_PESO_ARGENTINO = "Peso Argentino";

    public void seleccionar() {
        Scanner lectura = new Scanner(System.in);
        int opcion = -1;

        Menu verMenu = new Menu();
        verMenu.renderizarMenu();

        while (opcion != 0) {
            opcion = lectura.nextInt();

            switch (opcion) {
                case 0:
                    mostrarDespedida();
                    break;
                case 1:
                    realizarConversion(USD, NOMBRE_DOLAR, COP, NOMBRE_PESO_COLOMBIANO);
                    break;
                case 2:
                    realizarConversion(COP, NOMBRE_PESO_COLOMBIANO, USD, NOMBRE_DOLAR);
                    break;
                case 3:
                    realizarConversion(USD, NOMBRE_DOLAR, BRL, NOMBRE_REAL_BRASILENO);
                    break;
                case 4:
                    realizarConversion(BRL, NOMBRE_REAL_BRASILENO, USD, NOMBRE_DOLAR);
                    break;
                case 5:
                    realizarConversion(USD, NOMBRE_DOLAR, EUR, NOMBRE_EURO);
                    break;
                case 6:
                    realizarConversion(EUR, NOMBRE_EURO, USD, NOMBRE_DOLAR);
                    break;
                case 7:
                    realizarConversion(EUR, NOMBRE_EURO, COP, NOMBRE_PESO_COLOMBIANO);
                    break;
                case 8:
                    realizarConversion(COP, NOMBRE_PESO_COLOMBIANO, EUR, NOMBRE_EURO);
                    break;
                case 9:
                    realizarConversion(USD, NOMBRE_DOLAR, ARS, NOMBRE_PESO_ARGENTINO);
                    break;
                case 10:
                    realizarConversion(ARS, NOMBRE_PESO_ARGENTINO, USD, NOMBRE_DOLAR);
                    break;
                case 99:
                    mostrarInstrucciones();
                    break;
                default:
                    mostrarOpcionInvalida();
                    break;
            }
        }

        lectura.close();
    }

    private void realizarConversion(String monedaActual, String nombreMonedaActual, String monedaAConvertir, String nombreDeMonedaAConvertir) {
        CalcularConversion conversion = new CalcularConversion();
        conversion.calcular(monedaActual, nombreMonedaActual, monedaAConvertir, nombreDeMonedaAConvertir);
    }

    private void mostrarDespedida() {
        Menu despedida = new Menu();
        System.out.println(despedida.getDespedida());
    }

    private void mostrarInstrucciones() {
        Menu instrucciones = new Menu();
        System.out.println(instrucciones.getInstrucciones());
    }

    private void mostrarOpcionInvalida() {
        System.out.println("""
            Por favor, ingresa una opción válida. ⛔
            Estamos trabajando para tener más monedas, selecciona otra conversión. 🛠️
            """);
    }

}

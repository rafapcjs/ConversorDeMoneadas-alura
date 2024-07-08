package com.aluracursos.conversorDeMonedas.Metodos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.Scanner;



public class CalcularConversion {

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private Scanner lectura = new Scanner(System.in);

    public void calcular(String busqueda, String nombreMonedaActual, String monedaAConvertir, String nombreDeMonedaAConvertir) {
        System.out.println("Seleccionaste convertir: " + nombreMonedaActual + " >>>>>>> " + nombreDeMonedaAConvertir);

        ConsumirApi consumir = new ConsumirApi();
        String data = gson.toJson(consumir.convertirMonedas(busqueda));
        JsonObject jsonObject = gson.fromJson(data, JsonObject.class);

        // Obtener moneda base
        String monedaActual = jsonObject.get("base_code").getAsString();

        // Obtener tasa de conversión
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        double valorDeMonedaAConvertir = conversionRates.get(monedaAConvertir).getAsDouble();

        // Solicitar valor a convertir
        System.out.println("Ingresa el valor de " + monedaActual + " a convertir:");
        String valorIngresado = lectura.nextLine().replace(".", ",");

        double valorIngresadoToDouble;
        try {
            valorIngresadoToDouble = Double.parseDouble(valorIngresado);
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresa un valor numérico válido.");
            return;
        }

        while (valorIngresadoToDouble <= 0) {
            System.out.println("¡Ingrese una cantidad mayor!");
            valorIngresado = lectura.nextLine().replace(".", ",");
            try {
                valorIngresadoToDouble = Double.parseDouble(valorIngresado);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un valor numérico válido.");
                return;
            }
        }

        // Realizar cálculo de conversión
        double valorCalculado = valorIngresadoToDouble * valorDeMonedaAConvertir;
        String valorCalculadoDosDecimal = String.format("%.2f", valorCalculado);

        // Mostrar resultado
        System.out.println("$ " + valorIngresadoToDouble + " " + nombreMonedaActual + " equivalen a >>>> " + valorCalculadoDosDecimal + " " + nombreDeMonedaAConvertir);
        System.out.println("Presiona (0) para salir.");
    }
}
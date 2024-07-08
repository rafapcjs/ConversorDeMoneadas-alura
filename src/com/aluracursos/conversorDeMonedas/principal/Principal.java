package com.aluracursos.conversorDeMonedas.principal;

import com.aluracursos.conversorDeMonedas.Metodos.SeleccionarMoneda;

public class Principal {

    public static void main(String[] args) {


            SeleccionarMoneda seleccionarMoneda;

        // Se selecciona la moneda que se va a convertir.
        SeleccionarMoneda seleccionar = new SeleccionarMoneda();
        seleccionar.seleccionar();

    }
}

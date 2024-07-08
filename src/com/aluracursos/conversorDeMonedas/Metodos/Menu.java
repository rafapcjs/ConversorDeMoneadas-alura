package com.aluracursos.conversorDeMonedas.Metodos;

public class Menu {

    private static final String INDICE = """
            *********************************************************************
            ************* - Conversor de Monedas - Reto de Alura - **************
            *********************************************************************
            """;

    private static final String SUB_MENU = """
            >>>>>>>>>> Sean bienvenidos a nuestro conversor de monedas <<<<<<<<<<
            >>>>>>>>>> Presiona (99) para ver el menú de instrucciones <<<<<<<<<<
            >>>>>>>>>>           Presiona (0) para salir               <<<<<<<<<<
            
            ********* 1  - Dólar              >>>>>>>    Peso Colombiano ********
            ********* 2  - Peso Colombiano    >>>>>>>    Dólar           ********
            ********* 3  - Dólar              >>>>>>>    Real Brasileño  ********
            ********* 4  - Real Brasileño     >>>>>>>    Dólar           ********
            ********* 5  - Dólar              >>>>>>>    Euro            ********
            ********* 6  - Euro               >>>>>>>    Dólar           ********
            ********* 7  - Euro               >>>>>>>    Peso Colombiano ********
            ********* 8  - Peso Colombiano    >>>>>>>    Euro            ********
            ********* 9  - Dólar              >>>>>>>    Peso Argentino  ********
            ********* 10 - Peso Argentino     >>>>>>>    Dólar           ********
            """;

    private static final String DESPEDIDA = """
            *********************************************************************
            ************* - Conversor de Monedas - Reto de Alura - **************
            ******* - Transforma tu experiencia digital con nosotros.  - ********
            ********************** - Vuelve pronto! 😎  - ***********************
            *********************************************************************
            """;

    private static final String INSTRUCCIONES = """
            *********************************************************************
            ************* - Conversor de Monedas - Reto de Alura - **************
            ********************** - Instrucciones de uso - *********************
            **** 1 - Elige una opción para convertir                         ****
            **** 2 - Ingresa el valor a convertir                            ****
            *********************************************************************
            **** 3 - Para salir presiona (0)                                 ****
            *********************************************************************
            """;

    public void renderizarMenu() {
        imprimirIndice();
        imprimirSubMenu();
        System.out.println("Elija una opción: ");
    }

    private void imprimirIndice() {
        System.out.println(INDICE);
    }

    private void imprimirSubMenu() {
        System.out.println(SUB_MENU);
    }

    public String getDespedida() {
        return DESPEDIDA;
    }

    public String getInstrucciones() {
        return INSTRUCCIONES;
    }
}

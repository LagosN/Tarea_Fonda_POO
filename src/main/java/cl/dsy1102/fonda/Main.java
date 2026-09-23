package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {
        GestorFonda bebidas = new GestorFonda();
        Bebida chicha = new BebidaSinAlcohol(95,"Chicha",1000,60);
        Bebida moteConHuesillo = new BebidaSinAlcohol(70,"Mote con Huesillo",400, 50);
        Bebida chichaSinAlcohol = new BebidaAlcoholica("Chicha",1000,40,3,12.0, false,true);
        Bebida piscoSour = new BebidaAlcoholica("Pisco Sour",500,25,3,18,true,true);


    /*Registrar bebidas */
    bebidas.agregarBebida(chicha);
    bebidas.agregarBebida(moteConHuesillo);
    bebidas.agregarBebida(chichaSinAlcohol);
    bebidas.agregarBebida(piscoSour);

    ((ConsumoResponsable) chicha).restringirVenta();

    bebidas.mostrarBebidas();

    piscoSour.obtenerDetalle();

    }







        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        // TODO 3: registrarlas todas en el gestor.
        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.


    }


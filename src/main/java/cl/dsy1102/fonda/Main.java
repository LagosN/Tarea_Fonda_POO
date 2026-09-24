package cl.dsy1102.fonda;



/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {

        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
        GestorFonda bebidas = new GestorFonda();
        Bebida chichaSinAlcohol = new BebidaSinAlcohol(95,"Chicha",1000,60);
        Bebida moteConHuesillo = new BebidaSinAlcohol(70,"Mote con Huesillo",400, 50);
        Bebida chicha = new BebidaAlcoholica("Chicha",1000,40,12,false, false);
        Bebida piscoSour = new BebidaAlcoholica("Pisco Sour",500,25,3,true,false);


    // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        ((ConsumoResponsable) chicha).restringirVenta();

        // TODO 3: registrarlas todas en el gestor.
        //  /*Registrar bebidas */
        bebidas.agregarBebida(chicha);
        bebidas.agregarBebida(moteConHuesillo);
        bebidas.agregarBebida(chichaSinAlcohol);
        bebidas.agregarBebida(piscoSour);
        bebidas.mostrarBebidas();

        

        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        bebidas.vender("Pisco Sour",2);
        bebidas.vender("Pisco Sour",5);
        bebidas.vender("Chicha",1);
        bebidas.vender("Mote con Huesillo",6);

        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.
        bebidas.mostrarBebidas();
        bebidas.buscarPorNombre("Chicha");




    }

    }


package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorFonda   {
    private  ArrayList<Bebida> bebidas = new ArrayList<>() ;


    public GestorFonda(ArrayList<Bebida> bebidas){


        bebidas.add(new BebidaSinAlcohol(95,"Chicha",1000,60));
        bebidas.add(new BebidaSinAlcohol(70,"Mote con Huesillo",400, 50));
        bebidas.add(new BebidaAlcoholica("Chicha",1000,40,3,12.0, false,true));
        bebidas.add(new BebidaAlcoholica("Pisco Sour",500,25,3,18,true,true));




    }
    public  GestorFonda(){};

    public void agregarBebida(Bebida bebida){

        this.bebidas.add(bebida);
        System.out.println("Bebida agregada correctamente");

    }

    public Bebida buscarPorNombre(String nombre){
        for(Bebida bebida : this.bebidas){
            if (bebida.getNombre().equals(nombre)){
                /* Por que aca me dice que es un redundancia ? pero en el siguente toString no ? */
                System.out.println(bebida.toString());
                /* Usar ej bebida. muestra tantos metodos de con y Sin alcohol */
                return  bebida;


            }
        }
        System.out.println("Nombre no encontrado");
        return null;
    }


    public void mostrarBebidas(){
        System.out.println("Lista de bebidas");
        for (Bebida bebida:bebidas){
            /* No puedo usar metodo de isCertificada usar   para entregar un dato u otro// Si es alcoholica o no */
            System.out.println("Nombre;" + bebida.toString());

        }
    }

    public  void vender(String nombreBebida, int unidades) {

        for (Bebida bebida:bebidas){
            /* Uso de instanceof ? */
            if (bebida.getNombre().equalsIgnoreCase(nombreBebida) || unidades < bebida.){
                System.out.println(("Precio de venta "+ bebida.getNombre() + ": $" +bebida.calcularPrecio()));
                return;
            }
        /* Quiero poder agregar el nombre buscado y que luego pida las cantidades, esto debe quedar en un "carrito"
        otra lista ? */
        /*Recorrer lista que entregue posicion y nombre */


        }
        System.out.println("Bebida no encontrada");
    }



}

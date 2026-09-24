package cl.dsy1102.fonda;

import java.util.ArrayList;

public class GestorFonda   {
    private  ArrayList<Bebida> bebidas = new ArrayList<>() ;


    public GestorFonda(ArrayList<Bebida> bebidas){

    }
    public  GestorFonda(){};

    public void agregarBebida(Bebida bebida){

        this.bebidas.add(bebida);
        System.out.println("Bebida:" + bebida.getNombre() + "Tipo:" + bebida.getClass()+ " agregada correctamente");

    }

    public String buscarPorNombre(String nombre){
        System.out.println("Búsqueda por nombre;");
        for(Bebida bebida : this.bebidas){
            if (bebida.getNombre().equals(nombre)){

                System.out.println(bebida.obtenerDetalle());
                return bebida.obtenerDetalle();

            }
        }
        System.out.println("Nombre no encontrado");
        return null;
    }


    public void mostrarBebidas(){
        System.out.println("Lista de bebidas");
        for (Bebida bebida:bebidas){
            /* No puedo usar metodo de isCertificada usar   para entregar un dato u otro// Si es alcoholica o no */
            System.out.println( toString());

        }
    }

    public  void vender(String nombreBebida, int unidades) {

        for (Bebida bebida:bebidas){
            /* Implementar metodos de Consumo responsable */
            if (bebida.getNombre().equalsIgnoreCase(nombreBebida) ) {

            if (unidades > bebida.getStock()){
                System.out.println("Supera el maximo de unidades");
                if (bebida instanceof ConsumoResponsable) {
                    ConsumoResponsable consumo;
                    consumo = (ConsumoResponsable) bebida;

                    if (consumo.tieneVentaRestringida()){
                        System.out.println("Venta rechazada" + nombreBebida + "tiene venta restringida");
                        return;
                    }
                    if (consumo.superaLimite(unidades)){
                        System.out.println("Venta rechazada:" + unidades+" unidades de:" +nombreBebida + "superan el maximo de 3.");
                    }
                }

            }
                System.out.println(("Nombre " + bebida.getNombre() + ": $" + (bebida.calcularPrecio() * unidades)));
                double total = unidades * bebida.calcularPrecio();
                bebida.setStock(unidades);
                return;
            }

                /* Agregar el descuento de stock */






        }
        System.out.println("Bebida no encontrada");
    }



}

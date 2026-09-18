package cl.dsy1102.fonda;

import java.util.ArrayList;

public class GestorFonda extends  BebidaSinAlcohol  {
    private ArrayList<Bebida> bebidas ;

    public GestorFonda(ArrayList<Bebida> bebidas){
        super(95,"Chicha", 1000,60);

        this.bebidas = new ArrayList<>();
        this.bebidas.add(new Bebida("Mote con Huesillo", 400, 50) {
            @Override
            public double calcularPrecio() {
                return 0;
            }

            @Override
            public String obtenerDetalle() {
                return "";
            }

        });
        this.bebidas.add(new Bebida("Chicha", 1000, 40) {
            @Override
            public double calcularPrecio() {
                return 0;
            }

            @Override
            public String obtenerDetalle() {
                return "";
            }
        }

    }

    public void agregarBebida(Bebida e){
        this.bebidas.add(e);
        System.out.println("Bebida agregada correctamente");

    }

    public Bebida buscarPorNombre(String nombre){
        for(Bebida e : this.bebidas){
            if (e.getNombre().equals(nombre)){
                return  e;
            }
        }
        System.out.println("Nombre no encontrado");
        return null;
    }

    public  void vender(String nombre, int unidades){
        /* Quiero poder agregar el nombre buscado y que luego pida las cantidades, esto debe quedar en un "carrito"
        otra lista ? */
       Bebida carrito = buscarPorNombre();
    }


}

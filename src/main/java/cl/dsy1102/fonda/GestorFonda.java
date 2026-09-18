package cl.dsy1102.fonda;

import java.util.ArrayList;

public class GestorFonda   {
    private ArrayList<Bebida> bebidas ;

    public GestorFonda(ArrayList<Bebida> bebidas){
        this.bebidas = new ArrayList<>();
        bebidas.add(new BebidaSinAlcohol(95,"Chicha",1000,60));
        bebidas.add(new BebidaSinAlcohol(70,"Mote con Huesillo",400, 50));
        bebidas.add(new BebidaAlcoholica("Chicha",1000,40,3,12.0, false,true));
        bebidas.add(new BebidaAlcoholica("Pisco Sour",500,25,3,18,true,true));




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

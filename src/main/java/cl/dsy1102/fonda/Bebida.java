package cl.dsy1102.fonda;

public abstract class Bebida {
    protected String nombre;
    protected int volumenMl;
    protected int stock;


    public Bebida(String nombre, int volumenMl, int stock){
        this.nombre = nombre;
        this.volumenMl = volumenMl;
        this.stock = stock;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVolumenMl() {
        return volumenMl;
    }

    public void setVolumenMl(int volumenMl) {
        this.volumenMl = volumenMl;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract double calcularPrecio();
    /*  Por que no sale en azul ? */
    public abstract String obtenerDetalle();


    public String toString(){
        String respuesta =  super.toString();
        respuesta = respuesta + "Nombre: "+ this.nombre + "Volumen:" +this.volumenMl +  "Stock:"+ this.stock;
        return  (respuesta);




    }
}
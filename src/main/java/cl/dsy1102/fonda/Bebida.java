package cl.dsy1102.fonda;

public abstract class Bebida {
    private String nombre;
    private int volumenMl;
    private int stock;

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

    public abstract String obtenerDetalle();

    /* toString solicita que en los argumentos este nombre y cantidad de ML,
     se puede dejar con void y que entregue por consola el valor como string */
    public String toString(){
        return "";
    }
}
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
        if (nombre == null){
            throw  new IllegalArgumentException("EL nombre no puede quedar en blanco");
        }

    }

    public int getVolumenMl() {
        return volumenMl;
    }

    public void setVolumenMl(int volumenMl) {
        if (volumenMl > 100 && volumenMl < 3000) {
            this.volumenMl = volumenMl;
        }else{
            throw  new IllegalArgumentException("Solo puedes agregar un volumen entre 100 y 3000");

        }

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock > 0) {
            this.stock = stock;
        }else{
            throw  new IllegalArgumentException("Debes agregar un numero mayor a 0");
        }
    }

    public abstract double calcularPrecio();


    public abstract String obtenerDetalle();


    public String toString(){
        String respuesta =  super.toString();
        respuesta = respuesta + "Nombre: "+ this.nombre + "Volumen:" +this.volumenMl +  "Stock:"+ this.stock;
        return  (respuesta);




    }
}
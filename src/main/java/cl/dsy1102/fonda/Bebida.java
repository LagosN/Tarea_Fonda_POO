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

    public void setNombre(String nombre) throws  IllegalArgumentException {


        if (nombre == null || nombre.isBlank() ){
            throw  new IllegalArgumentException("EL nombre no puede quedar en blanco ni vacio");
        }else {
            this.nombre = nombre;
        }

    }

    public int getVolumenMl() {
        return volumenMl;
    }

    public void setVolumenMl(int volumenMl) throws  IllegalArgumentException {
        if ((volumenMl >= 100) && (volumenMl <= 3000)) {
            throw  new IllegalArgumentException("Solo puedes agregar un volumen entre 100 y 3000");

        }
        this.volumenMl = volumenMl;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws  IllegalArgumentException {
        if (stock < 0) {
            throw  new IllegalArgumentException("Debes agregar un numero mayor a 0");

        }
            this.stock = stock;


    }

    public abstract double calcularPrecio();


    public abstract String obtenerDetalle();


    public String toString(){
        String respuesta =  super.toString();
        respuesta = respuesta + "Nombre: " + this.nombre + "Volumen:" + this.volumenMl;
        return  (respuesta);




    }
}
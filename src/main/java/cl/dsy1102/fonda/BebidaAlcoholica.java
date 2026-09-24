package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements  ConsumoResponsable {
    private static final int cantidadMaxima = 3;
    private double gradosAlcohol;
    private boolean certificada;
    private  boolean ventaRestringida;

    public BebidaAlcoholica(String nombre, int volumenMl, int stock, double gradosAlcohol, boolean certificada, boolean ventaRestringida){
        super(nombre, volumenMl,stock);

        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;

    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        if (gradosAlcohol < 0.5 || gradosAlcohol > 45) {
            throw  new IllegalArgumentException("Solo puedes agregar 0.5 hasta 45 grados de alcohol");

        }

        this.gradosAlcohol = gradosAlcohol;


    }

    public boolean isVentaRestringida() {
        return ventaRestringida;
    }

    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }

    public boolean isCertificada() {
        return certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }


    @Override
    public boolean tieneVentaRestringida() {

        return ventaRestringida;
    }

    @Override
    public void restringirVenta() {
        this.ventaRestringida = true;
        System.out.println("Restriccion actualizada");
        /*Llamar al método setVentaRestringida? */



    }
    @Override
    public double calcularPrecio() {
        int precio;

        if (this.certificada ){
            precio = 3500;
        }else {
            precio = (int) (3500*1.2);}
        return precio;
    }


    @Override
    public String obtenerDetalle() {
        String respuestaDetalle;
                respuestaDetalle=
                "Tipos de Bebidas Alcoholicas | Nombre: "+getNombre() +
                "|Volumen: " + getVolumenMl() + "| Stock:" + getStock() +
                        "| Grados de Alcohol: °"+ this.gradosAlcohol +
                "| Certificada: " + this.certificada + "|Venta Restringida: " + this.ventaRestringida
        +  " Precio: " +  this.calcularPrecio() ;
        return respuestaDetalle;
    }

    @Override
    public String toString(){
        return  super.toString();

    }
    @Override
    public boolean superaLimite(int unidades) {
        return  (unidades > cantidadMaxima) && (unidades > stock);


    }
}

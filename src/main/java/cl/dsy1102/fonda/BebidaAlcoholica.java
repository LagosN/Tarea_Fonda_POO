package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements  ConsumoResponsable {
    private static final int cantidadMaxima = 3;
    private double gradosAlcohol;
    private boolean certificada;
    private  boolean ventaRestringida;

    public BebidaAlcoholica(String nombre, int volumenMl, int stock,int limiteUnidadesPorCliente, double gradosAlcohol, boolean certificada, boolean ventaRestringida){
        super(nombre, volumenMl,stock);

        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;

    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    public boolean isVentaRestringida() {
        return ventaRestringida;
    }

    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }

    public boolean isCertificad() {
        return certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }



    @Override
    public void restringirVenta() {
        /*Llamar al método setVentaRestringida? */
        boolean Ajuste ;

    }
    @Override
    public double calcularPrecio() {
        int precio;

        if (certificada ){/* como usar el 2000*1.10 ? */
            precio = 3500;
        }else {
            precio = (int) (3500*1.2);}
        return precio;
    }


    @Override
    public String obtenerDetalle() {
        String respuestaDetalle;
        respuestaDetalle= "Tipos de Bebidas Alcoholicas | Nombre: "+getNombre() +
                "|Volumen: " + getVolumenMl() + "| Stock:" + getStock() + "| Grados de Alcohol: °"+ this.gradosAlcohol + "| Certificada: "  ;
        return respuestaDetalle;
    } /* Como imprimir boleanos? usando if  ? */

    @Override
    public String toString(){
        String respuesta =  super.toString();
        respuesta = respuesta + <nombre,volumenMl,stock>
        return  (respuesta);

    }
    @Override
    public boolean superaLimite(int unidades) {

        return unidades > cantidadMaxima;
    }
}

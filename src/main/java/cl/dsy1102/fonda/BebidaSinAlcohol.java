package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
    private int  azucarPorLitro;


    /*Constructor */
    public BebidaSinAlcohol(int azucarPorLitro, String nombre, int volumenMl, int stock){
        super(nombre, volumenMl, stock);
        this.azucarPorLitro = azucarPorLitro;
    }


    /*Metodos get y set */
    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }
    /* Metodos de comportamiento */
    @Override
    public double calcularPrecio() {
        int precio;

        if (azucarPorLitro > 80){
            precio = (int) (2000*1.10);
        }else {
            precio = 2000;}
        return precio;
    }

    @Override
    public String obtenerDetalle() {
        String respuestaDetalle;
        respuestaDetalle = "Tipos de Bebidas No alcoholicas | Nombre: "+getNombre() +
                "|Volumen: " + getVolumenMl() + "| Stock:" + getStock() + "| Azucar por litro: "+ this.azucarPorLitro +  "Valor: " + this.calcularPrecio()  ;
        return respuestaDetalle;
    } /* Como imprimir boleanos ? */

    @Override
    public String toString(){
        return  super.toString();

    }
}

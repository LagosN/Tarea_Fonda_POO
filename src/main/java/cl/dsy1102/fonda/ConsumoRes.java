package main.java.cl.dsy1102.fonda;

public interface ConsumoRes {
    public boolean tieneVentaRestringida();

    public void restringirVenta();

    /* El int unidades va en este apartado como interfaz o directamente cuando se implementa en la clase?*/
    public boolean superaLimite(int  unidades);

    ;
}

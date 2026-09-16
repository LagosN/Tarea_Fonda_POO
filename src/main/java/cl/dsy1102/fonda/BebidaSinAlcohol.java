package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida implements ConsumoRes{
    int azucarPorLitro;

    public BebidaSinAlcohol(int azucarPorLitro, String nombre, int volumenMl, int stock){
        super(nombre, volumenMl, stock);
        this.azucarPorLitro = azucarPorLitro;
    }

    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }

    @Override
    public String obtenerDetalle() {
        return "";
    }

    @Override
    public boolean tieneVentaRestringida() {
        return false;
    }

    @Override
    public void restringirVenta() {

    }

    @Override
    public boolean superaLimite(int unidades) {
        return false;
    }
}

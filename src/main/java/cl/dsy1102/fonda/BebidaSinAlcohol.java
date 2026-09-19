package main.java.cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
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


}

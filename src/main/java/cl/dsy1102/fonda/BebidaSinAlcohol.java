package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
    private int azucarPorLitro;

    public BebidaSinAlcohol(String nombre, int volumenMl, int stock, int azucarPorLitro) {
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
        int precio;

        if (azucarPorLitro > 80){
            precio = (int) (2000*1.10);
        }else {
            precio = 2000;}
        return precio;
    }

    @Override
    public String obtenerDetalle() {
        return "Tipo: Bebida Sin Alcohol | Nombre: " + getNombre()
                + " | Volumen: " + getVolumenMl() + " ml"
                + " | Stock: " + getStock()
                + " | Azúcar: " + azucarPorLitro + " g/L"
                + " | Precio: $" + (int) calcularPrecio();
    }
    @Override
    public  String toString(){
        return  super.toString();
    }
}

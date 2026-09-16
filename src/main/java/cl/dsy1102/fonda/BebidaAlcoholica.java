package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements  ConsumoRes {
    protected int limiteUnidadesPorCliente;
    private double gradosAlcohol;
    private boolean certificad;
    private  boolean ventaRestringida;

    public BebidaAlcoholica(String nombre, int volumenMl, int stock,int limiteUnidadesPorCliente, double gradosAlcohol, boolean certificad, boolean ventaRestringida){
        super(nombre, volumenMl,stock);
        this.limiteUnidadesPorCliente = limiteUnidadesPorCliente;
        this.gradosAlcohol = gradosAlcohol;
        this.certificad = certificad;
        this.ventaRestringida = ventaRestringida;

    }

    public int getLimiteUnidadesPorCliente() {
        return limiteUnidadesPorCliente;
    }

    public void setLimiteUnidadesPorCliente(int limiteUnidadesPorCliente) {
        this.limiteUnidadesPorCliente = limiteUnidadesPorCliente;
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
        return certificad;
    }

    public void setCertificad(boolean certificad) {
        this.certificad = certificad;
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

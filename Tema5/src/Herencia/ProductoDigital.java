package Herencia;

public class ProductoDigital extends Producto{
    private String URL;
    private double MB;

    public ProductoDigital(){}
    public ProductoDigital(int id, String nombre, double precioFinal, String uRL, double mB) {
        super(id, nombre, precioFinal);
        URL = uRL;
        MB = mB;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }
    public double getMB() {
        return MB;
    }
    public void setMB(double mB) {
        MB = mB;
    }

    
    
    
}

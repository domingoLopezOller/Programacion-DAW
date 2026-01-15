package Herencia;

public class ProductoFisico extends Producto{
    private double peso;
    private double costeEnvio;

    public ProductoFisico(){}
    public ProductoFisico(int id, String nombre, double precioFinal, double peso, double costeEnvio) {
        super(id, nombre, precioFinal);
        this.peso = peso;
        this.costeEnvio = costeEnvio;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getCosteEnvio() {
        return costeEnvio;
    }
    public void setCosteEnvio(double costeEnvio) {
        this.costeEnvio = costeEnvio;
    }

    @Override
    public void imprimeProducto(){
        if(peso>2.0)
            System.out.println("Nombre: "+nombre+" Precio: "+precio+"PrecioIVA: "+(precioFinal()+costeEnvio)*1.1);
        else
            System.out.println("Nombre: "+nombre+" Precio: "+precio+"PrecioIVA: "+precioFinal()+costeEnvio);
    }
    
}

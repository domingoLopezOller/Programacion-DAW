package Herencia;

public class Producto {
    protected int id;
    protected String nombre;
    protected double precio;

    public Producto(){}
    public Producto(int id, String nombre, double precioFinal) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precioFinal;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double precioFinal(){
        return precio*1.21;
    }

    public void imprimeProducto(){
        System.out.println("Nombre: "+nombre+" Precio: "+precio+"PrecioIVA: "+precioFinal());
    }
    
}

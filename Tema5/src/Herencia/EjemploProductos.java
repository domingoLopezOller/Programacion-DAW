package Herencia;

public class EjemploProductos {
    public static void main(String[] args) {
        ProductoFisico p1 = new ProductoFisico(1,"Pendrive",10,0.200,5);
        ProductoFisico p2 = new ProductoFisico(2,"Ordenador",700,3,50);
        ProductoDigital d1 = new ProductoDigital(3,"ebook",20,"iescuravalera.es",300);

        p1.imprimeProducto();
        p2.imprimeProducto();
        d1.imprimeProducto();
    }
}

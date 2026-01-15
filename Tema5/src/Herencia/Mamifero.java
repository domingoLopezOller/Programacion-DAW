package Herencia;

public class Mamifero extends Animal {
    protected int gestacion;

    public Mamifero(String nombre, String tipo_alimentacion, int edad, int gestacion) {
        super(nombre, tipo_alimentacion, edad);
        this.gestacion = gestacion;
    }

    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }

    @Override
    public String toString() {
        return "Mamifero [nombre=" + nombre + ", gestacion=" + gestacion + ", tipo_alimentacion=" + tipo_alimentacion
                + ", edad=" + edad + "]";
    }

    
    

    
}

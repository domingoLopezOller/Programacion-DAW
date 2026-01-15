package Herencia;

public class Perro extends Mamifero{
    private String raza;

    public Perro(String nombre, String tipo_alimentacion, int edad, int gestacion,String raza) {
        super(nombre, tipo_alimentacion, edad, gestacion);
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", raza=" + raza + ", gestacion=" + gestacion + ", tipo_alimentacion="
                + tipo_alimentacion + ", edad=" + edad + "]";
    }
    
    
    
    
}

package Herencia;

public class Circulo extends Figura {
    private final double PI=3.141592;
    private double radio;

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return PI*radio;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 2*PI*radio;
    }
    
}

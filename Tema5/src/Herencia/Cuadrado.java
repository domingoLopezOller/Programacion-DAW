package Herencia;

public class Cuadrado extends Figura {
    private double lado;

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 4*lado;
    }
    
}

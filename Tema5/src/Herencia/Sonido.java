package Herencia;

public interface Sonido extends Ejemplo2{
    public void hacerSonido();
    public default void estoyDurmiendo(){System.out.println("zzzzzzzzzz");}

    public int contarPatas();
}

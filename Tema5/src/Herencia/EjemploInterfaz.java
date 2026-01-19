package Herencia;

import java.util.ArrayList;

public class EjemploInterfaz implements Sonido {
    public EjemploInterfaz(){}
    
    @Override
    public int contarPatas() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void hacerSonido() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void noHaceNada() {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        EjemploInterfaz ejemplo= new EjemploInterfaz();
        ejemplo.hacerSonido();


        ArrayList<Sonido> ejemplo2=new ArrayList<>();
        ejemplo2.add(ejemplo);
    }
    
}

package Practicas.Practica5;

import java.util.ArrayList;

public class AgendaArrayList {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Domingo","AVENIDA","666666666"));
        lista.add(new Persona("Aurora","adfadfasf","666666666"));
        lista.add(new Persona("Marggio","PORTAL ... ","666666666"));
        lista.add(new Persona("José Miguel","CALLE...","666666666"));
        lista.add(new Persona("Pedro","OTRA","666666666"));

        //Ordenar la lista de personas
        lista.sort((p1, p2) -> p2.getNombre().compareTo(p1.getNombre()));

        //Mostar las personas
        for(int i=0;i<lista.size();i++){
            lista.get(i).imprimePersona();
        }
    }
}

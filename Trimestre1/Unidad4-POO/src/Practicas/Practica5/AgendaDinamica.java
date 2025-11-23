package Practicas.Practica5;

/**
 * Vamos a desarrollar una agenda telefónica a partir del caso
 * anterior utilizando vector y ArrayList. Si quisiéramos ordenar usaremos:
 * sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()))
 */
public class Practica5 {

    static void main() {
        //Necesito tener un vector de personas
        Persona[] lista = new Persona[5];
        lista[0]=new Persona("Domingo","AVENIDA","666666666");
        lista[1]=new Persona("Aurora","adfadfasf","666666666");
        lista[2]=new Persona("Marggio","PORTAL ... ","666666666");
        lista[3]=new Persona("José Miguel","CALLE...","666666666");
        lista[4]=new Persona("Pedro","OTRA","666666666");

        //Imprimir las personas
        for(int i=0;i< lista.length;i++){
            lista[i].imprimePersona();
        }
    }
}

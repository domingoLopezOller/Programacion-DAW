import java.util.ArrayList;
import java.util.Scanner;

public class Actividad {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(); //Creación de la lista vacía
        Scanner teclado=new Scanner(System.in);
        String palabra;
        boolean salida=false;
        do{
            System.out.println("Introduzca una palabra o fin para terminar: ");
            palabra=teclado.nextLine();
            if(!palabra.equals("fin") && !lista.contains(palabra)){ 
                    lista.add(palabra);
            }
            if(palabra.equals("fin")) {salida=true;}
        }while(!salida);

        //Sacar las palabras guardadas
        System.out.print("Contenido de la lista: ");
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)+" ");
        }
        System.out.println();

        //Vamos a ordenar la lista y mostrar el resultado
        lista.sort(String.CASE_INSENSITIVE_ORDER);
        // lista.sort((a,b)->{return a.compareTo(b);});
        System.out.print("Contenido de la lista ordenada: ");
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)+" ");
        }
        System.out.println();
    }
}

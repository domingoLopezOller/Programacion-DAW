package Herencia;

import java.util.ArrayList;

public class EjectarGranja {
    public static void main(String[] args) {
        // Animal a1 = new Animal("Molly","Carne",5);
        // Mamifero m1 = new Mamifero("Arlo","Verdura",3,8);
        Perro p1 = new Perro("Santa","Pienso",8,4,"Cocker");
        Animal a1 = new Perro("Molly","Pienso",5,4,"Cocker");


        ArrayList<Perro> array1 = new ArrayList<>();
        ArrayList<Animal> array2 = new ArrayList<>();
        array2.add(a1); array2.add(p1);
        // array1.add(p1); array1.add(a1);//No funcionará
        System.out.println(p1);
        System.out.println(a1);
    }
}

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) throws Exception {
        Ejercicio4();
    }

    public static void Ejercicio1(){
        int entradas;
        int dia;//1 es lunes, martes es 2.... domingo es 7
        boolean tarjeta; //true o false
        double precio;
        Scanner teclado=new Scanner(System.in);
    
        System.out.print("Introduzca el número de entradas: ");
        entradas=Integer.parseInt(teclado.nextLine());
        System.out.print("Introduzca el día del cine (1 a 7): ");
        dia=Integer.parseInt(teclado.nextLine());
        System.out.print("¿Tiene tarjeta cine?(0 o 1): ");
        int valor=Integer.parseInt(teclado.nextLine());
        //Colocar el valor de tarjeta
        if (valor==0) tarjeta=false;
        else tarjeta=true;

        //Procesar la entrada
        if(dia==3){ //Caso miércolees
            precio=5;
            System.out.println("Entradas individuales: "+entradas);
            System.out.println("Precio: "+precio);
            System.out.println("Total: "+(precio*entradas));
            if(tarjeta){
                System.out.println("Descuento: "+(precio*entradas)*0.1);
                System.out.println("Total final: "+(precio*entradas)*0.9);
            }
            else{
                System.out.println("Descuento: 0€");
                System.out.println("Total final: "+(precio*entradas));
            }
        }
        else if(dia==4){//Caso día de las parejas
            precio=11;
            entradas=entradas/2;
            System.out.println("Entradas individuales: "+entradas);
            System.out.println("Precio: "+precio);
            System.out.println("Total: "+(precio*entradas));
            if(tarjeta){
                System.out.println("Descuento: "+(precio*entradas)*0.1);
                System.out.println("Total final: "+(precio*entradas)*0.9);
            }
            else{
                System.out.println("Descuento: 0€");
                System.out.println("Total final: "+(precio*entradas));
            }
        }
        else{//Caso genearl
            precio=8;
            System.out.println("Entradas individuales: "+entradas);
            System.out.println("Precio: "+precio);
            System.out.println("Total: "+(precio*entradas));
            if(tarjeta){
                System.out.println("Descuento: "+(precio*entradas)*0.1);
                System.out.println("Total final: "+(precio*entradas)*0.9);
            }
            else{
                System.out.println("Descuento: 0€");
                System.out.println("Total final: "+(precio*entradas));
            }
        }
    }

    public static void Ejercicio2(){
        int ganadas=0;
        int jugador;
        int ordenador;
        do{
        Scanner teclado=new Scanner(System.in);
        jugador=teclado.nextInt();//Estás metiendo 1, 2, 3
        //Generar la jugada del ordenador
        ordenador=(int)(Math.random()*(3-1+1))+1;
        //Comprobar la jugada
        //if-else (comprobar la jugada)
        }while(jugador!=-1 || ganadas!=5);

    }

    public static void Ejercicio3(){
        int total=0;
        int sumaImpares=0;
        int mayorPares=-1;
        int minimo=-1;
        int numero;
        Scanner teclado =new Scanner(System.in);
        //REpetir mientras el usuario no meta un número negativo
        do{
            numero=teclado.nextInt();
            if(numero>0){
                //Incrementar el total
                total++;
                if(numero%2==1){//Suma de impares
                    sumaImpares=sumaImpares+numero;
                }
                if(numero%2==0){//El maximo de los pares
                    if(mayorPares<numero) mayorPares=numero;
                }
                if(total==1){
                    minimo=numero;
                }
                else{ 
                    if (minimo>numero) minimo=numero;
                }
            }

        }while(numero>0);
        //Sacar por pantalla

    }

    public static boolean esPrimo(int n){
        boolean esprimo;
        if(n<2){ 
            esprimo=false;
            return esprimo;
        }
        else{
            esprimo=true;
            for(int i =2;i<n-1;i++){
                if(n%i==0){
                    esprimo=false;
                    return esprimo;
                }
            }
        }
        esprimo=true;
        return esprimo;
    }
    public static void Ejercicio4(){
        Scanner teclado=new Scanner(System.in);
        int numero1,numero2;
        do{//Controlar que numero1 y numero2 siempre tienen que ser mayores que 50
            System.out.println("Introduce número1 mayor que 50: ");
            numero1=Integer.parseInt(teclado.nextLine());
        }while(numero1<50);
        do{
            System.out.println("Introduce número2 mayor que 50: ");
            numero2=Integer.parseInt(teclado.nextLine());
        }while(numero2<50);
        for(int i=numero1;i<numero2;i++){
            if(esPrimo(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void Ejercicio5(boolean valor){
        if(valor==true){
            System.out.println("dibujo de la izquierda");
        }
        else{
            System.out.println("dibujo de la derecha");
        }
    }
}

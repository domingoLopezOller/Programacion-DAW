
import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        // //Caso básico de bucle
        // for(int i=0;i<5;i++){ //Conozco cuántas se van a ejecutar
        //     System.out.println(i);
        // }
        // int j=0;
        // //Bucle while
        // while(j<5){ //mientras se cumpla la condición
        //     System.out.println(j);
        //     j++;
        // }
        // //Bucle do-while
        // int k=0;
        // do{ //Haz mientras se cumpla condición, pero al menos 1
        //     System.out.println(k);
        //     k++;
        // }while(k<5);


        // //COSAS QUE NO QUIERO VER EN VUESTROS CÓDIGOS
        // boolean continua=true;
        // for(int i=0;i<5&&continua;i++){
        //     System.out.println(i);
        //     if (i==3) break;
        // }

        // //Hacerlo mejor con un bucle while
        // int j=0;
        // continua=true;
        // while(j<5 && continua){
        //     System.out.println(j);
        //     if (j==3) continua=false;
        //     j++;
        // }

        // Scanner teclado = new Scanner(System.in);
        // int numero=0;
        // do{
        //     System.out.print("Escribe un número entre 1 y 5: ");
        //     numero=teclado.nextInt();
        // }while(numero<1||numero>5);

        //Bucles anidados
        for (int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                
                    System.out.println(i+"*"+j+"= "+(i*j));
                
            }
            System.out.println("");
        }
    }
}

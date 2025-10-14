import java.util.Scanner;

public class Arrays {
    public static void imprimeArray(double[] array){
        System.out.println(array[1]);
    }
    public static double[] devolverArray(double[] a){
        a[1]=a[1]*3;
        return a;
    }
    public static void main(String[] args) {
        // String nombre1;
        // String Apellidos1; 
        // int edad1;
        // double notaBD1;
        // double notaPROG1;
        // double notaED1;

        // double calificaciones[]={7,8,2,4,8,9};
        // System.out.println(calificaciones[5]);

        // //Array dinámico
        // double[] calificaciones2;
        // System.out.println("Indica el tamaño del array calificaciones2: ");
        // Scanner teclado=new Scanner(System.in);
        // calificaciones2=new double[teclado.nextInt()];
        // System.out.println(calificaciones2);


        // //Arrays que apuntan al mismo sitio
        // double[] calificacionesOtro;
        // calificacionesOtro=calificaciones;
        // System.out.println(calificaciones[1]);
        // System.out.println(calificacionesOtro[1]);
        // // calificaciones=null;
        // // calificacionesOtro=null;
        // // System.out.println(calificacionesOtro[3]);

        // //Imprime la posición 1
        // imprimeArray(calificaciones);
        // double[] resultado=devolverArray(calificaciones);
        // System.out.println(resultado[1]);
        // System.out.println(calificaciones[1]);


        // //matrices
        // String[][] comidas={{"arroz","manzana","conejo","celiaco"},{"verdura","pollo","fresa","domingo"},{"patatas","naranja","cerdo","fiesta"}};
        // System.out.println(comidas[2][3]);
        // String[] aux=comidas[1];
        // System.out.println("Matriz: "+comidas[1][2]);
        // System.out.println("Vector: "+aux[2]);


        // //Usar la memoria dinámica reservada
        // calificaciones2[3]=5;
        // System.out.println(calificaciones2[3]);
        // System.out.println(calificaciones2[1]);


        // //acceso a args del main
        // // System.out.println(args[0]);

        //RECORRER UN VECTOR
        int[] vector={7,5,3,4};
        for(int i=vector.length-1;i>=0;i--){
            System.out.print(vector[i]+" ");
        }
        System.out.println();

        //PRÁCTICA RECORRER MATRICES
        // int[][] matriz2={{1,2,3,4,5},{1,2,3,4},{1,2,3},{1,2},{1}};
        int[][] matriz2={{3,7,1},{4,-4,2},{5,0,5}};
        for(int i=0;i<matriz2.length;i++){//Recorre las filas
            for(int j=0;j<matriz2[i].length;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        } 
    }
    
}

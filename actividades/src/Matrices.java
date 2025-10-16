import java.util.Scanner;

public class Matrices {
    public static void imprimeMatriz(int[][] matriz){
        for(int i =0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Vamos a solicitar filas y columnas
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca filas: ");
        int filas=teclado.nextInt();
        System.out.println("Introduzca columnas: ");
        int columnas=teclado.nextInt();

        //Generar la matriz dinámica
        int[][] matriz = new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]=(int)(Math.random()*10)+1;
            }
        }
        //Imprimir la matriz
        imprimeMatriz(matriz);

        //Suma de los elementos de cada fila
        int[] resultadoFila = new int[filas];
        int[] resultadoColumna = new int[columnas];

        //Recorrer por filas
        for(int i=0;i<filas;i++){
            int total=0;
            for(int j=0;j<columnas;j++){
                total=total+matriz[i][j];
            }
            resultadoFila[i]=total;
        }
        //Mostar las sumas
        System.out.println("SUmas por filas:");
        for(int i=0;i<filas;i++){
            System.out.println(resultadoFila[i]);
        }

        //Recorrer por columnas
        for(int i=0;i<columnas;i++){
            int total=0;
            for(int j=0;j<filas;j++){
                total=total+matriz[j][i];
            }
            resultadoColumna[i]=total;
        }
        //Mostar las sumas
        System.out.println("SUmas por columnas:");
        for(int i=0;i<columnas;i++){
            System.out.println(resultadoColumna[i]);
        }

        
    }    
}

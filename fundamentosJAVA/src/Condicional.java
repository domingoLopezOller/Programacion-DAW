

public class Condicional {
    public static void main(String[] args) {
        //Manejo de if-else
        int user=19;
        if (user < 18){
            System.out.println("User es muy joven");
        }
        else{
            System.out.println("User mayor de edad");
        }
        //Operador ternario
        int a=19;
        System.out.println(a<18 ? "User es muy joven" : "User es mayor de edad");
        
        //Comprobar si un número es divisible por 2 y por 3
        // Si numero%2 es 0 Y numero%3 es 0 entonces
        //     escribir numero es divisible por 2 y 3
        // Sino 
        //     escribir no es divisible por 2 y 3
        // fin_Si
        int numero=6;
        if(numero%2==0 && numero%3==0){
            System.out.println("El número "+numero+" es divisible por 2 y 3");
        }
        else{
            System.out.println("El número "+numero+" no es divisible por 2 y 3");
        }


        /*
         * Si numero%2=0 entonces
         *  Si numero%3=0 entonces
         *      escribe Es divisible por 2 y 3;
         *  Si no entonces
         *      escribe No es divisible por 2 y 3
         *  fin_si
         * fin_si
         */
        if(numero%2==0){
            if(numero%3==0){
                System.out.println("El número "+numero+" es divisible por 2 y 3");
            }
            else{
                System.out.println("El número "+numero+" no es divisible por 2 y 3");
            }
        }
    }
}


import java.time.LocalDateTime;

public class Funciones {
    public static void main(String[] args) {
        //Tratamiento de fechas en JAVA
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println(hoy.toString());
        System.out.println(hoy.getDayOfWeek());
    }
}

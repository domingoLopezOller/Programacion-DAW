package vista;

import java.util.List;
import java.util.Scanner;

import modelo.Categoria;

public class CategoriaVista {
    private Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ PERSONAS ---");
        System.out.println("1. Listar Categorías");
        System.out.println("2. Insertar categoría");
        System.out.println("3. Actualizar categoría");
        System.out.println("4. Eliminar categoría");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }
    public void mostrarCategorias(List<Categoria> categorias) {
        System.out.println("\nLISTADO:");
        for (Categoria p : categorias) {
            System.out.println(p.getId() + " - " + p.getNombre());
        }
    }
    public Categoria pedirNuevaCategoria() {
        sc.nextLine();
        System.out.print("ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        return new Categoria(id,nombre);
    }
    public Categoria pedirCateogoriaActualizar() {
        System.out.print("ID a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nuevo nombre: ");
        String nombre = sc.nextLine();
        return new Categoria(id, nombre);
    }
    public int pedirIdEliminar() {
        System.out.print("ID a eliminar: ");
        return sc.nextInt();
    }
    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
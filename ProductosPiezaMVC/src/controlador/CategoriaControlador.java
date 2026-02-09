package controlador;
import modelo.CategoriaDAO;
import vista.CategoriaVista;

public class CategoriaControlador {
    private CategoriaDAO dao;
    private CategoriaVista view;
    public CategoriaControlador() {
        dao = new CategoriaDAO();
        view = new CategoriaVista();
    }
    public void iniciar() {
        int opcion;
        try{
            do {
                opcion = view.mostrarMenu();
                switch (opcion) {
                    case 1: view.mostrarCategorias(dao.listar()); break;
                    case 2: { dao.insertar(view.pedirNuevaCategoria());
                        view.mostrarMensaje("Categoria insertada"); break; }
                    case 3: { dao.actualizar(view.pedirCateogoriaActualizar());
                        view.mostrarMensaje("Categoria actualizada"); break; }
                    case 4: { dao.eliminar(view.pedirIdEliminar());
                        view.mostrarMensaje("Categoria eliminada"); }
                    case 0: view.mostrarMensaje("Saliendo..."); break;
                    default: view.mostrarMensaje("Opción incorrecta"); break;
                }
            } while (opcion != 0);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }
}
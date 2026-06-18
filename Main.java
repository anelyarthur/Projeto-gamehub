import dao.UsuarioDAOImpl;
import entidades.Usuario;

public class Main {

	public static void main(String[] args) {
		Usuario u = new Usuario (1 , "André", "andrefulasi@gmail.com", 1234, "2026-05-21" );
		UsuarioDAOImpl uDAO = new UsuarioDAOImpl();
		uDAO.create(u);
		
		
		System.out.println("Finalizado");
    }
}


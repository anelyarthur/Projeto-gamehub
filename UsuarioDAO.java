package dao;

import entidades.Usuario;

public interface UsuarioDAO {
	
	public void create (Usuario u);
	public Usuario read (int id);
	public void update (Usuario u);
	public void delete (Usuario u);

	
	
}

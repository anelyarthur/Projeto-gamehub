package dao;

import entidades.Genero;

public interface GeneroDAO {
	
	public void create (Genero g);
	public Genero read (int id);
	public void update (Genero g);
	public void delete (Genero g);
	
	
}

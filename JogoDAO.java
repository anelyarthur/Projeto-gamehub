package dao;

import entidades.Jogo;

public interface JogoDAO {
	
	public void create (Jogo j);
	public Jogo read (int id);
	public void update (Jogo j);
	public void delete (Jogo j);
	
	
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Genero;

public class GeneroDAOImpl implements GeneroDAO {

	@Override
	public void create(Genero g) {
		String sql = "INSERT INTO Genero (id_genero, nome_genero, descricao_genero) VALUES (?, ?, ?)";
		sql = sql.replaceFirst("\\?", String.valueOf(g.getId()));
		sql = sql.replaceFirst("\\?", "'" + g.getNome() + "'");
		sql = sql.replaceFirst("\\?", "'" + g.getDescricao() + "'");
		
		Connection conn = DBConnection.getInstance().getConnection();
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public Genero read(int id) {
		String sql = "SELECT * from Genero where id_genero = ? ";
		return null;
	}

	@Override
	public void update(Genero g) {
	    String sql = "UPDATE Genero SET nome_genero = ?, descricao_genero = ? WHERE id_genero = ?";
	}

	@Override
	public void delete(Genero g) {
		String sql = "DELETE from Genero where id_genero = ?";

	}

}

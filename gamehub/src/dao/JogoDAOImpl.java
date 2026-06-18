package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Jogo;

public class JogoDAOImpl implements JogoDAO {

	@Override
	public void create(Jogo j) {
		String sql = "INSERT INTO Jogo (id_jogo, titulo, ano_lancamento, desenvolvedor, descricao, id_genero) VALUES (?, ?, ?, ?, ?, ?)";
		sql = sql.replaceFirst("\\?", String.valueOf(j.getId()));
		sql = sql.replaceFirst("\\?", "'" + j.getTitulo() + "'");
		sql = sql.replaceFirst("\\?", "'" + j.getLancamento() + "'");
		sql = sql.replaceFirst("\\?", "'" + j.getDesenvolvedor() + "'");
		sql = sql.replaceFirst("\\?", "'" + j.getDescricao() + "'");
		sql = sql.replaceFirst("\\?", String.valueOf(j.getGenero()));
		
		
		
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
	public Jogo read(int id) {
		String sql = "SELECT * from Jogo where id_jogo = ? ";
		return null;
	}

	@Override
	public void update(Jogo j) {
	    String sql = "UPDATE Jogo SET titulo = ?, ano_lancamento = ?, descricao = ?, desenvolvedor = ? WHERE id_jogo = ?";
	}

	@Override
	public void delete(Jogo j) {
		String sql = "DELETE from Jogo where id_jogo = ?";

	}

}
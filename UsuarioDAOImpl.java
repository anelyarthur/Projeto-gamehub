package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {
	
	@Override
	public void create(Usuario u) {
		String sql = "INSERT INTO Usuario (id_usuario, nome, email, senha, data_cadastro) VALUES (?, ?, ?, ?, ?)";
		sql = sql.replaceFirst("\\?", String.valueOf(u.getId()));
		sql = sql.replaceFirst("\\?", "'" + u.getNome() + "'");
		sql = sql.replaceFirst("\\?", "'" + u.getEmail() + "'");
		sql = sql.replaceFirst("\\?", String.valueOf(u.getSenha()));
		sql = sql.replaceFirst("\\?", "'" + u.getDataCadastro() + "'");
		
		
		
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
	public Usuario read(int id) {
		String sql = "SELECT * from Usuario where id_usuario = ? ";
		return null;
	}
	
	@Override
	public void update(Usuario u) {
	    String sql = "UPDATE Usuario SET nome = ?, email = ?, senha = ?, data_cadastro = ? WHERE id_usuario = ?";
	}
	
	@Override
	public void delete(Usuario u) {
		String sql = "DELETE from Usuario where id_usuario = ?";
	
	}

}
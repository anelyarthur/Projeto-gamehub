package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private Connection connection;
	private static DBConnection instance;
	
	
		private DBConnection() {
			try {
				this.connection = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/gamehub", "postgres", "1234"
						);
			} catch (SQLException e) {
				throw new RuntimeException("Erro ao conectar", e);
				}
			}
	public Connection getConnection() {
		return this.connection;
		}
	
	
	public static DBConnection getInstance() {
		if (instance == null) { // 1ª verificação (rápida)
			synchronized (DBConnection.class) {
				if (instance == null) { // 2ª verificação (segura)
					instance = new DBConnection();
				}
			}
		}
		return instance;
	}
}

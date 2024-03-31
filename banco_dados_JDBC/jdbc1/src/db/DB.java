package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	// Declaração da variável de conexão estática
	private static Connection conn = null;

	// Método estático para obter uma conexão com o banco de dados
	public static Connection getConnction() {
		// Verifica se a conexão já foi estabelecida
		if (conn == null) {
			try {
				// Carrega as propriedades de conexão do arquivo db.properties
				Properties props = loadProperties();
				// Obtém a URL do banco de dados do arquivo de propriedades
				String url = props.getProperty("dburl");
				// Estabelece a conexão com o banco de dados usando DriverManager
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				// Lança uma exceção personalizada se ocorrer um erro ao conectar ao banco de
				// dados
				throw new DbException(e.getMessage());
			}
		}
		// Retorna a conexão
		return conn;
	}

	// Método estático para fechar a conexão com o banco de dados
	public static void closeConnection() {
		// Verifica se a conexão não é nula antes de tentar fechar
		if (conn != null) {
			try {
				// Fecha a conexão
				conn.close();
			} catch (SQLException e) {
				// Lança uma exceção personalizada se ocorrer um erro ao fechar a conexão
				throw new DbException(e.getMessage());
			}
		}
	}

	// Método privado para carregar as propriedades de conexão do arquivo
	// db.properties
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			// Cria um objeto Properties para armazenar as propriedades
			Properties props = new Properties();
			// Carrega as propriedades do arquivo de entrada
			props.load(fs);
			// Retorna o objeto Properties carregado
			return props;
		} catch (IOException e) {
			// Lança uma exceção personalizada se ocorrer um erro ao carregar as
			// propriedades
			throw new DbException(e.getMessage());
		}
	}

}

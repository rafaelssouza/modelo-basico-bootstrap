package bibliotecaLivros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bibliotecaLivros.Connection.ConnectionFactory;
import bibliotecaLivros.models.Autor;


public class AutorDAO {
	
	
	public ArrayList<Autor> listaAutores() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		conn			= ConnectionFactory.createConnection();
		Class.forName("com.mysql.jdbc.Driver");  
		ArrayList<Autor> autores = new ArrayList<Autor>();
		String sql	= "SELECT * FROM autores ORDER BY nm_nome ASC";
		PreparedStatement mysql = conn.prepareStatement(sql);
			ResultSet rs	= mysql.executeQuery();
				
				while (rs.next()) {
					Autor autor = new Autor();
					autor.setId(rs.getInt(1));
					autor.setNome(rs.getString(2));
					autor.setAtivo(rs.getBoolean(3));
					autores.add(autor);
				}
			
				mysql.close();
				conn.close();
		  return autores;
	}
	
	
	
	

}

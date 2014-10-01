package bibliotecaLivros.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bibliotecaLivros.Connection.ConnectionFactory;
import bibliotecaLivros.models.Livro;


public class LivroDAO {

	
	public void inserir(Livro livro) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection conn	= null;
		try{
			conn	= ConnectionFactory.createConnection();
			String sql = "INSERT INTO livros VALUES (?,?,?,?,?)";
			PreparedStatement mysql = conn.prepareStatement(sql);
			mysql.setString(2, livro.getNome());
			mysql.setBoolean(3, livro.isAtivo() );
			mysql.setString(4, livro.getData());
			mysql.setInt(5, livro.getAutor() );
			
			mysql.execute();
			mysql.close();
		}finally{ //garante que vai chamar o close, mesmo que ocorroa uma exceço no bloco acima
			if(conn != null && !conn.isClosed())
				conn.close();
		}
		
	}
	
	
	public ArrayList<Livro> lista() throws SQLException, ClassNotFoundException{
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");  
		ArrayList<Livro> livros	= new ArrayList<Livro>();
		
			conn			= ConnectionFactory.createConnection();
			String sql		= "select * from livros where n_ativo = 1";
			PreparedStatement mysql = conn.prepareStatement(sql);
			ResultSet rs	= mysql.executeQuery();
				while (rs.next()) {
					Livro livro = new Livro();
					livro.setId(rs.getInt(1));
					livro.setNome(rs.getString(2));
					livro.setAtivo(rs.getBoolean(3));
					livro.setAutor(rs.getInt(4));
					livro.setData(rs.getString(5));
					
					livros.add(livro);
				}
			
				mysql.close();
				conn.close();
		  return livros;
	}
	
}

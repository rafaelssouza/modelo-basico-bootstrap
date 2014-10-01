package bibliotecaLivros.service;

import java.sql.SQLException;
import java.util.List;

import bibliotecaLivros.dao.AutorDAO;
import bibliotecaLivros.models.Autor;


public class AutorService {
	
	AutorDAO autorDAO = new AutorDAO();
	
	public List<Autor> listaLivros () throws ClassNotFoundException, SQLException {
		return autorDAO.listaAutores();
	}

	
	

}

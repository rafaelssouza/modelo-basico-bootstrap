package bibliotecaLivros.service;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import bibliotecaLivros.dao.LivroDAO;
import bibliotecaLivros.models.Livro;

@ManagedBean
public class LivroService {

	private LivroDAO livroDAO;
	
	
	public LivroService() {
		livroDAO = new LivroDAO();
	}
	
	
	public ArrayList<Livro> listaLivros() throws SQLException, ClassNotFoundException{
		return livroDAO.lista();
	}
	
	public void cadastroNovoLivro(Livro livro) throws ClassNotFoundException{
		try {
			
			livroDAO.inserir(livro);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

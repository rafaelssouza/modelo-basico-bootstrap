package bibliotecaLivros.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import bibliotecaLivros.models.Livro;
import bibliotecaLivros.service.LivroService;

@RequestScoped
@ManagedBean (name="livroController")
public class LivrosController extends Livro {

	private static ArrayList<Livro> livros = new ArrayList<Livro>();
	LivroService livroService = new LivroService();
	Livro livro = new Livro();
	
	

	public LivroService getLivroService() {
		return livroService;
	}


	public void setLivroService(LivroService livroService) {
		this.livroService = livroService;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public  void cadatroLivro() throws SQLException, ClassNotFoundException{

			livro.getId();
			livro.isAtivo();
			livro.getNome();
			livro.getAutor();
		 
			livroService.cadastroNovoLivro(livro);
		
	}
	
	
	public ArrayList<Livro> listaLivros() throws SQLException, ClassNotFoundException{
		return livroService.listaLivros();
	}


	public static ArrayList<Livro> getLivros() {
		return livros;
	}


	public static void setLivros(ArrayList<Livro> livros) {
		LivrosController.livros = livros;
	}
	
	
}

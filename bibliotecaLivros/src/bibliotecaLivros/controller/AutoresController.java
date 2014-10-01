package bibliotecaLivros.controller;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import bibliotecaLivros.models.Autor;
import bibliotecaLivros.service.AutorService;

@RequestScoped
@ManagedBean (name = "autoresController")
public class AutoresController {
	
	AutorService autorService = new AutorService();

	public List<Autor> listaAutores() throws ClassNotFoundException, SQLException{
		return autorService.listaLivros();		
	}


}

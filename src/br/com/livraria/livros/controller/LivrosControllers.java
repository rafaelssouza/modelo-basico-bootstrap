package br.com.livraria.livros.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.livraria.livros.classes.Livros;

@ViewScoped
@ManagedBean(name="livrosLista")
public class LivrosControllers {
	
	public List<Livros> livros;
	
	@PostConstruct
	public void init(){
		System.out.println("Ok, foi executado");
	}
	
	/*
	 * *
	 * 	public Integer cd_livro;
	public String nm_livro;
	public Integer n_ativo;
	public String data;
	
	
	 */

	 public List<Livros> criaUmlivro() {
	        List<Livros> livro = new ArrayList<Livros>();
	        Livros livrosAdd	= new Livros();
	        livrosAdd.setCd_livro(1);
	        livrosAdd.setData("15/03/197");
	        livrosAdd.setN_ativo(1);
	        livrosAdd.setNm_livro("Julio Ventura");
	        
	        livro.add(livrosAdd);
	         
	        return livro;
	    }
	
	

}

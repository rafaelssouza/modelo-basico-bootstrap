package bibliotecaLivros.models;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Livro {

	private Integer id;
	private boolean ativo;
	private Integer autor;
	private String nome;
	private String data;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Integer getAutor() {
		return autor;
	}
	public void setAutor(Integer autor) {
		this.autor = autor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}


}

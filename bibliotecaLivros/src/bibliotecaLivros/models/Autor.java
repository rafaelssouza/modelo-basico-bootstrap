package bibliotecaLivros.models;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Autor {
	
	private Integer id;
	private String nome;
	private boolean ativo;
	
	// 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}

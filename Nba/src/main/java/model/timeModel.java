package model;

import DAO.TimeDAO;

public class timeModel {

	private String idcon;
	private String nome;
	private String titulos;
		
	public timeModel() {
		super();
	}

	public timeModel(String idcon, String nome, String titulos) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.titulos = titulos;

	}
	
	public timeModel(String nome, String titulos) {
		super();
		this.nome = nome;
		this.titulos = titulos;

	}
	

	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulos() {
		return titulos;
	}
	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}
	
	public void salvar() {
        new TimeDAO().inserirTime(this);
    }
	
}





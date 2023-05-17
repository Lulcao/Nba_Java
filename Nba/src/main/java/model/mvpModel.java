package model;

import DAO.MvpDAO;

public class mvpModel {

	private String idmvp;
	private String mvp;
	private String mvpClass;
	private String mvpNac;
	public String getIdmvp() {
		return idmvp;
	}
	public void setIdmvp(String idmvp) {
		this.idmvp = idmvp;
	}
	public String getMvp() {
		return mvp;
	}
	public void setMvp(String mvp) {
		this.mvp = mvp;
	}
	public String getMvpClass() {
		return mvpClass;
	}
	public void setMvpClass(String mvpClass) {
		this.mvpClass = mvpClass;
	}
	public String getMvpNac() {
		return mvpNac;
	}
	public void setMvpNac(String mvpNac) {
		this.mvpNac = mvpNac;
	}
	
	public mvpModel() {
		super();
	}
	
	public mvpModel(String idmvp, String mvp, String mvpClass, String mvpNac) {
		super();
		this.idmvp = idmvp;
		this.mvp = mvp;
		this.mvpClass = mvpClass;
		this.mvpNac = mvpNac;
	}
	
	public mvpModel(String mvp, String mvpClass, String mvpNac) {
		super();
		this.mvp = mvp;
		this.mvpClass = mvpClass;
		this.mvpNac = mvpNac;
	}
	
	public void salvar() {
        new MvpDAO().inserirMvp(this);
    }
	
	
}

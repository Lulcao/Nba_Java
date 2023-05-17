package model;

import DAO.StarDAO;

public class starModel {

	private String id;
	private String star;
	private String starClass;
	private String starNac;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getStarClass() {
		return starClass;
	}
	public void setStarClass(String starClass) {
		this.starClass = starClass;
	}
	public String getStarNac() {
		return starNac;
	}
	public void setStarNac(String starNac) {
		this.starNac = starNac;
	}
	
	public starModel() {
		super();
	}
	
	public starModel(String id, String star, String starClass, String starNac) {
		super();
		this.id = id;
		this.star = star;
		this.starClass = starClass;
		this.starNac = starNac;
	}
	
	public starModel(String star, String starClass, String starNac) {
		super();
		this.star = star;
		this.starClass = starClass;
		this.starNac = starNac;
	}
	
	public void salvar() {
        new StarDAO().inserirStar(this);
    }
	
	
}

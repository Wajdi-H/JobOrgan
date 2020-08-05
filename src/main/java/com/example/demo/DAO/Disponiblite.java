package com.example.demo.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Disponiblite implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IDdispo;
	private float heuredeb;
	private float heurefin;
	
	 @ManyToMany(mappedBy = "disponiblites")
	    private List<ChercheurJ>chercheurJs ;

	public long getIDdispo() {
		return IDdispo;
	}

	public void setIDdispo(long iDdispo) {
		IDdispo = iDdispo;
	}

	public float getHeuredeb() {
		return heuredeb;
	}

	public void setHeuredeb(float heuredeb) {
		this.heuredeb = heuredeb;
	}

	public float getHeurefin() {
		return heurefin;
	}

	public void setHeurefin(float heurefin) {
		this.heurefin = heurefin;
	}

	public List<ChercheurJ> getChercheurJs() {
		return chercheurJs;
	}

	public void setChercheurJs(List<ChercheurJ> chercheurJs) {
		this.chercheurJs = chercheurJs;
	}

	public Disponiblite(long iDdispo, float heuredeb, float heurefin, List<ChercheurJ> chercheurJs) {
		super();
		IDdispo = iDdispo;
		this.heuredeb = heuredeb;
		this.heurefin = heurefin;
		this.chercheurJs = chercheurJs;
	}

	public Disponiblite() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

	

}

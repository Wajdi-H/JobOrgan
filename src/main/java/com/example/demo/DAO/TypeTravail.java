package com.example.demo.DAO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TypeTravail implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Idtypetravail;
	private String Nomtype;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Categorieid")
    private Categorie categorie;

	public long getIdtypetravail() {
		return Idtypetravail;
	}

	public void setIdtypetravail(long idtypetravail) {
		Idtypetravail = idtypetravail;
	}

	public String getNomtype() {
		return Nomtype;
	}

	public void setNomtype(String nomtype) {
		Nomtype = nomtype;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public TypeTravail(long idtypetravail, String nomtype, Categorie categorie) {
		super();
		Idtypetravail = idtypetravail;
		Nomtype = nomtype;
		this.categorie = categorie;
	}

	public TypeTravail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

package com.example.demo.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class preferance  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idpreferance;
	private float Distancehomeloctravail;
	private float TempsHS;
	private boolean DisponibliteDerM;
	private String TypeContartPrefere;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ChercheurJob")
    private ChercheurJ chercheurJ;
	
	@ManyToMany(mappedBy = "preferances")
    private List<Categorie>categories ;

	public long getIdpreferance() {
		return idpreferance;
	}

	public void setIdpreferance(long idpreferance) {
		this.idpreferance = idpreferance;
	}

	public float getDistancehomeloctravail() {
		return Distancehomeloctravail;
	}

	public void setDistancehomeloctravail(float distancehomeloctravail) {
		Distancehomeloctravail = distancehomeloctravail;
	}

	public float getTempsHS() {
		return TempsHS;
	}

	public void setTempsHS(float tempsHS) {
		TempsHS = tempsHS;
	}

	public boolean isDisponibliteDerM() {
		return DisponibliteDerM;
	}

	public void setDisponibliteDerM(boolean disponibliteDerM) {
		DisponibliteDerM = disponibliteDerM;
	}

	public String getTypeContartPrefere() {
		return TypeContartPrefere;
	}

	public void setTypeContartPrefere(String typeContartPrefere) {
		TypeContartPrefere = typeContartPrefere;
	}

	public ChercheurJ getChercheurJ() {
		return chercheurJ;
	}

	public void setChercheurJ(ChercheurJ chercheurJ) {
		this.chercheurJ = chercheurJ;
	}

	public List<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	public preferance(long idpreferance, float distancehomeloctravail, float tempsHS, boolean disponibliteDerM,
			String typeContartPrefere, ChercheurJ chercheurJ, List<Categorie> categories) {
		super();
		this.idpreferance = idpreferance;
		Distancehomeloctravail = distancehomeloctravail;
		TempsHS = tempsHS;
		DisponibliteDerM = disponibliteDerM;
		TypeContartPrefere = typeContartPrefere;
		this.chercheurJ = chercheurJ;
		this.categories = categories;
	}

	public preferance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

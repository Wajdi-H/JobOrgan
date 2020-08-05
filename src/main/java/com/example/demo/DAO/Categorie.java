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
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCateg;
	private String nomCateg;
	private String images;
	
	@OneToMany(
			mappedBy = "categorie",
			fetch = FetchType.LAZY)
	private List<TypeTravail> typeTravails ;
	
	@OneToMany(
			mappedBy = "categorie",
			fetch = FetchType.LAZY)
	private List<Mission> missions ;

    @ManyToMany
    @JoinTable(name="categorieprefrances",joinColumns=
    @JoinColumn(name="preferance"),inverseJoinColumns=
    @JoinColumn(name="categorie"))
    private List<preferance>preferances ;

	public long getIdCateg() {
		return idCateg;
	}

	public void setIdCateg(long idCateg) {
		this.idCateg = idCateg;
	}

	public String getNomCateg() {
		return nomCateg;
	}

	public void setNomCateg(String nomCateg) {
		this.nomCateg = nomCateg;
	}

	public List<TypeTravail> getTypeTravails() {
		return typeTravails;
	}

	public void setTypeTravails(List<TypeTravail> typeTravails) {
		this.typeTravails = typeTravails;
	}

	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	public List<preferance> getPreferances() {
		return preferances;
	}

	public void setPreferances(List<preferance> preferances) {
		this.preferances = preferances;
	}
	

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	

	public Categorie(long idCateg, String nomCateg, String images, List<TypeTravail> typeTravails,
			List<Mission> missions, List<preferance> preferances) {
		super();
		this.idCateg = idCateg;
		this.nomCateg = nomCateg;
		this.images = images;
		this.typeTravails = typeTravails;
		this.missions = missions;
		this.preferances = preferances;
	}

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}

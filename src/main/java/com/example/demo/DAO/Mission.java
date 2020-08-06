package com.example.demo.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Mission implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMission;
	private String TitreMission;
	private String Competances;
	private String Description;
	private String vehicule;
	private String accessoires;
	private String Localisation;
	private float budget;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Categorieid")
    private Categorie categorie;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Entrepriseid")
    private Entreprise entreprise;
	
	@JsonIgnore
	@OneToMany(
			mappedBy = "mission",
			fetch = FetchType.LAZY)
	private List<Candidature> candidatures ;


	public long getIdMission() {
		return idMission;
	}


	public void setIdMission(long idMission) {
		this.idMission = idMission;
	}


	public String getTitreMission() {
		return TitreMission;
	}


	public void setTitreMission(String titreMission) {
		TitreMission = titreMission;
	}


	public String getCompetances() {
		return Competances;
	}


	public void setCompetances(String competances) {
		Competances = competances;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public String getVehicule() {
		return vehicule;
	}


	public void setVehicule(String vehicule) {
		this.vehicule = vehicule;
	}


	public String getAccessoires() {
		return accessoires;
	}


	public void setAccessoires(String accessoires) {
		this.accessoires = accessoires;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public Entreprise getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}


	public List<Candidature> getCandidatures() {
		return candidatures;
	}


	public void setCandidatures(List<Candidature> candidatures) {
		this.candidatures = candidatures;
	}





	public String getLocalisation() {
		return Localisation;
	}


	public void setLocalisation(String localisation) {
		Localisation = localisation;
	}


	public float getBudget() {
		return budget;
	}


	public void setBudget(float budget) {
		this.budget = budget;
	}


	


	public Mission(long idMission, String titreMission, String competances, String description, String vehicule,
			String accessoires, String localisation, float budget, Categorie categorie, Entreprise entreprise,
			List<Candidature> candidatures) {
		super();
		this.idMission = idMission;
		TitreMission = titreMission;
		Competances = competances;
		Description = description;
		this.vehicule = vehicule;
		this.accessoires = accessoires;
		Localisation = localisation;
		this.budget = budget;
		this.categorie = categorie;
		this.entreprise = entreprise;
		this.candidatures = candidatures;
	}


	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

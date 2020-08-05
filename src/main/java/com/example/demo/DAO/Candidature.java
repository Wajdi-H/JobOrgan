package com.example.demo.DAO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.apache.logging.log4j.util.StringMap;

@Entity
public class Candidature implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long IdCandidature;
	private float BudgetDemande;
	private String DescCompetances;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Chercheuridcat")
    private ChercheurJ chercheur;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Missionid")
    private  Mission mission;

	public long getIdCandidature() {
		return IdCandidature;
	}

	public void setIdCandidature(long idCandidature) {
		IdCandidature = idCandidature;
	}

	public float getBudgetDemande() {
		return BudgetDemande;
	}

	public void setBudgetDemande(float budgetDemande) {
		BudgetDemande = budgetDemande;
	}

	public String getDescCompetances() {
		return DescCompetances;
	}

	public void setDescCompetances(String descCompetances) {
		DescCompetances = descCompetances;
	}

	public ChercheurJ getChercheur() {
		return chercheur;
	}

	public void setChercheur(ChercheurJ chercheur) {
		this.chercheur = chercheur;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public Candidature(long idCandidature, float budgetDemande, String descCompetances, ChercheurJ chercheur,
			Mission mission) {
		super();
		IdCandidature = idCandidature;
		BudgetDemande = budgetDemande;
		DescCompetances = descCompetances;
		this.chercheur = chercheur;
		this.mission = mission;
	}

	public Candidature() {
		super();
		// TODO Auto-generated constructor stub
	}
    


}

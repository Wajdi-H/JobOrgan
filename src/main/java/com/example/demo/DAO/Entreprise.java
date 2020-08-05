package com.example.demo.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entreprise implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEntreprise ;
	private String nomCommercial;
	private String raisonsocial;
	private String ActivitePrncipale;
	private String DomaineActivite;
	private String formejuridique;
	private String Slogan;
	private long numsert;
	private long numtva;
	private long RIB;
	
	@OneToMany(
			mappedBy = "entreprise",
			fetch = FetchType.LAZY)
	private List<Employe> employes ;
	
	@OneToMany(
			mappedBy = "entreprise",
			fetch = FetchType.LAZY)
	private List<ReseauSoc> reseauSocs  ;
	
	@OneToMany(
			mappedBy = "entreprise",
			fetch = FetchType.LAZY)
	private List<Mission> missions  ;

	public long getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(long idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getNomCommercial() {
		return nomCommercial;
	}

	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}

	public String getRaisonsocial() {
		return raisonsocial;
	}

	public void setRaisonsocial(String raisonsocial) {
		this.raisonsocial = raisonsocial;
	}

	public String getActivitePrncipale() {
		return ActivitePrncipale;
	}

	public void setActivitePrncipale(String activitePrncipale) {
		ActivitePrncipale = activitePrncipale;
	}

	public String getDomaineActivite() {
		return DomaineActivite;
	}

	public void setDomaineActivite(String domaineActivite) {
		DomaineActivite = domaineActivite;
	}

	public String getFormejuridique() {
		return formejuridique;
	}

	public void setFormejuridique(String formejuridique) {
		this.formejuridique = formejuridique;
	}

	public String getSlogan() {
		return Slogan;
	}

	public void setSlogan(String slogan) {
		Slogan = slogan;
	}

	public long getNumsert() {
		return numsert;
	}

	public void setNumsert(long numsert) {
		this.numsert = numsert;
	}

	public long getNumtva() {
		return numtva;
	}

	public void setNumtva(long numtva) {
		this.numtva = numtva;
	}

	public long getRIB() {
		return RIB;
	}

	public void setRIB(long rIB) {
		RIB = rIB;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public List<ReseauSoc> getReseauSocs() {
		return reseauSocs;
	}

	public void setReseauSocs(List<ReseauSoc> reseauSocs) {
		this.reseauSocs = reseauSocs;
	}

	public List<Mission> getMissions() {
		return missions;
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	public Entreprise(long idEntreprise, String nomCommercial, String raisonsocial, String activitePrncipale,
			String domaineActivite, String formejuridique, String slogan, long numsert, long numtva, long rIB,
			List<Employe> employes, List<ReseauSoc> reseauSocs, List<Mission> missions) {
		super();
		this.idEntreprise = idEntreprise;
		this.nomCommercial = nomCommercial;
		this.raisonsocial = raisonsocial;
		ActivitePrncipale = activitePrncipale;
		DomaineActivite = domaineActivite;
		this.formejuridique = formejuridique;
		Slogan = slogan;
		this.numsert = numsert;
		this.numtva = numtva;
		RIB = rIB;
		this.employes = employes;
		this.reseauSocs = reseauSocs;
		this.missions = missions;
	}

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

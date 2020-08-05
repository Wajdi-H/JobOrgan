package com.example.demo.DAO;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;


@Entity
public class ChercheurJ implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idC;
	private String Prenom;
	private String Nom ;
	private Date DateNaissance;
	private String Ville ; 
	private int NumSecSoc;
	private String Nationalite;
	private String Email;
	private int Telephone;
	private int Codepostale;
	private String PaysResidance;
	
	@OneToMany(
			mappedBy = "chercheur",
			fetch = FetchType.LAZY)
	private List<Experiance> experiance ;
	
	@OneToMany(
			mappedBy = "chercheur",
			fetch = FetchType.LAZY)
	private List<Candidature> candidatures ;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Preferance")
    private preferance preferance;
	
	
    @ManyToMany
    @JoinTable(name="chercheurdisponibite",joinColumns=
    @JoinColumn(name="chercheur"),inverseJoinColumns=
    @JoinColumn(name="disponiblite"))
    private List<Disponiblite>disponiblites ;


	public Long getIdC() {
		return idC;
	}


	public void setIdC(Long idC) {
		this.idC = idC;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public Date getDateNaissance() {
		return DateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}


	public String getVille() {
		return Ville;
	}


	public void setVille(String ville) {
		Ville = ville;
	}


	public int getNumSecSoc() {
		return NumSecSoc;
	}


	public void setNumSecSoc(int numSecSoc) {
		NumSecSoc = numSecSoc;
	}


	public String getNationalite() {
		return Nationalite;
	}


	public void setNationalite(String nationalite) {
		Nationalite = nationalite;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getTelephone() {
		return Telephone;
	}


	public void setTelephone(int telephone) {
		Telephone = telephone;
	}


	public int getCodepostale() {
		return Codepostale;
	}


	public void setCodepostale(int codepostale) {
		Codepostale = codepostale;
	}


	public String getPaysResidance() {
		return PaysResidance;
	}


	public void setPaysResidance(String paysResidance) {
		PaysResidance = paysResidance;
	}


	public List<Experiance> getExperiance() {
		return experiance;
	}


	public void setExperiance(List<Experiance> experiance) {
		this.experiance = experiance;
	}


	public List<Candidature> getCandidatures() {
		return candidatures;
	}


	public void setCandidatures(List<Candidature> candidatures) {
		this.candidatures = candidatures;
	}


	public preferance getPreferance() {
		return preferance;
	}


	public void setPreferance(preferance preferance) {
		this.preferance = preferance;
	}


	public List<Disponiblite> getDisponiblites() {
		return disponiblites;
	}


	public void setDisponiblites(List<Disponiblite> disponiblites) {
		this.disponiblites = disponiblites;
	}


	public ChercheurJ(Long idC, String prenom, String nom, Date dateNaissance, String ville, int numSecSoc,
			String nationalite, String email, int telephone, int codepostale, String paysResidance,
			List<Experiance> experiance, List<Candidature> candidatures, com.example.demo.DAO.preferance preferance,
			List<Disponiblite> disponiblites) {
		super();
		this.idC = idC;
		Prenom = prenom;
		Nom = nom;
		DateNaissance = dateNaissance;
		Ville = ville;
		NumSecSoc = numSecSoc;
		Nationalite = nationalite;
		Email = email;
		Telephone = telephone;
		Codepostale = codepostale;
		PaysResidance = paysResidance;
		this.experiance = experiance;
		this.candidatures = candidatures;
		this.preferance = preferance;
		this.disponiblites = disponiblites;
	}


	public ChercheurJ() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}

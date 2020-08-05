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
public class Employe implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Idemploye;
	private String prenom;
	private String nom ;
	private String posteoccupe;
	private String postesurplatforme;
	private String Email;
	private int Telephone ;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="entrepriseid")
    private Entreprise entreprise;

	public long getIdemploye() {
		return Idemploye;
	}

	public void setIdemploye(long idemploye) {
		Idemploye = idemploye;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPosteoccupe() {
		return posteoccupe;
	}

	public void setPosteoccupe(String posteoccupe) {
		this.posteoccupe = posteoccupe;
	}

	public String getPostesurplatforme() {
		return postesurplatforme;
	}

	public void setPostesurplatforme(String postesurplatforme) {
		this.postesurplatforme = postesurplatforme;
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

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Employe(long idemploye, String prenom, String nom, String posteoccupe, String postesurplatforme,
			String email, int telephone, Entreprise entreprise) {
		super();
		Idemploye = idemploye;
		this.prenom = prenom;
		this.nom = nom;
		this.posteoccupe = posteoccupe;
		this.postesurplatforme = postesurplatforme;
		Email = email;
		Telephone = telephone;
		this.entreprise = entreprise;
	}

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

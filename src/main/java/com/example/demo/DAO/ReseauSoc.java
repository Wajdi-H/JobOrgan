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
public class ReseauSoc implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IDres;
	private String NomRes;
	private String Lien;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="entrepriseid")
    private Entreprise entreprise;

	public long getIDres() {
		return IDres;
	}

	public void setIDres(long iDres) {
		IDres = iDres;
	}

	public String getNomRes() {
		return NomRes;
	}

	public void setNomRes(String nomRes) {
		NomRes = nomRes;
	}

	public String getLien() {
		return Lien;
	}

	public void setLien(String lien) {
		Lien = lien;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public ReseauSoc(long iDres, String nomRes, String lien, Entreprise entreprise) {
		super();
		IDres = iDres;
		NomRes = nomRes;
		Lien = lien;
		this.entreprise = entreprise;
	}

	public ReseauSoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

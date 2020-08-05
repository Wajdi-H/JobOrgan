package com.example.demo.DAO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Experiance  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idExper;
	private String nomentreprise;
	private String Domaine;
	private String posteoccupe;
	private Date Datedeb;
	private Date DateFin;
	private String Competances;
	private String Description;
	
	 @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="Chercheurid")
	    private ChercheurJ chercheur;
	 
	 @ManyToMany(mappedBy = "experiances")
	    private List<ChercheurJ>chercheurJs ;

	public long getIdExper() {
		return idExper;
	}

	public void setIdExper(long idExper) {
		this.idExper = idExper;
	}

	public String getNomentreprise() {
		return nomentreprise;
	}

	public void setNomentreprise(String nomentreprise) {
		this.nomentreprise = nomentreprise;
	}

	public String getDomaine() {
		return Domaine;
	}

	public void setDomaine(String domaine) {
		Domaine = domaine;
	}

	public String getPosteoccupe() {
		return posteoccupe;
	}

	public void setPosteoccupe(String posteoccupe) {
		this.posteoccupe = posteoccupe;
	}

	public Date getDatedeb() {
		return Datedeb;
	}

	public void setDatedeb(Date datedeb) {
		Datedeb = datedeb;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
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

	public ChercheurJ getChercheur() {
		return chercheur;
	}

	public void setChercheur(ChercheurJ chercheur) {
		this.chercheur = chercheur;
	}

	public List<ChercheurJ> getChercheurJs() {
		return chercheurJs;
	}

	public void setChercheurJs(List<ChercheurJ> chercheurJs) {
		this.chercheurJs = chercheurJs;
	}

	public Experiance(long idExper, String nomentreprise, String domaine, String posteoccupe, Date datedeb,
			Date dateFin, String competances, String description, ChercheurJ chercheur, List<ChercheurJ> chercheurJs) {
		super();
		this.idExper = idExper;
		this.nomentreprise = nomentreprise;
		Domaine = domaine;
		this.posteoccupe = posteoccupe;
		Datedeb = datedeb;
		DateFin = dateFin;
		Competances = competances;
		Description = description;
		this.chercheur = chercheur;
		this.chercheurJs = chercheurJs;
	}

	public Experiance() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}

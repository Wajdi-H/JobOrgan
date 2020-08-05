package com.example.demo.DAO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Crenaux implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcren;
	private Date DateDeb;
	private Date DateFin;
	public long getIdcren() {
		return idcren;
	}
	public void setIdcren(long idcren) {
		this.idcren = idcren;
	}
	public Date getDateDeb() {
		return DateDeb;
	}
	public void setDateDeb(Date dateDeb) {
		DateDeb = dateDeb;
	}
	public Date getDateFin() {
		return DateFin;
	}
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	public Crenaux(long idcren, Date dateDeb, Date dateFin) {
		super();
		this.idcren = idcren;
		DateDeb = dateDeb;
		DateFin = dateFin;
	}
	public Crenaux() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

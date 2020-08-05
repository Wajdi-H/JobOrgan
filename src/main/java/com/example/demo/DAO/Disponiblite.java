package com.example.demo.DAO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disponiblite implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IDdispo;
	private float heuredeb;
	private float heurefin;
	public long getIDdispo() {
		return IDdispo;
	}
	public void setIDdispo(long iDdispo) {
		IDdispo = iDdispo;
	}
	public float getHeuredeb() {
		return heuredeb;
	}
	public void setHeuredeb(float heuredeb) {
		this.heuredeb = heuredeb;
	}
	public float getHeurefin() {
		return heurefin;
	}
	public void setHeurefin(float heurefin) {
		this.heurefin = heurefin;
	}
	public Disponiblite(long iDdispo, float heuredeb, float heurefin) {
		super();
		IDdispo = iDdispo;
		this.heuredeb = heuredeb;
		this.heurefin = heurefin;
	}
	public Disponiblite() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

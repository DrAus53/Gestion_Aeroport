package fr.eseo.gestionaeroport.modele.baseDeDonnees;

import java.util.Date;

public class Vol {
	public int idVol;
	private int numeroVol;
	private int idAvion;
	private int nombrePassagers;
	private String nomPassagers;
	private int idAeroportDepart;
	private int idAeroportArrivee;
	private Date heureDepart;
	private Date heureArrivee;

	// constructeur:
	public Vol(int idVol, int numeroVol, int idAvion, int nombrePassagers, String nomPassagers, int idAeroportDepart,
			int idAeroportArrivee, Date heureDepart, Date heureArrivee) {
		super();
		this.idVol = idVol;
		this.numeroVol = numeroVol;
		this.idAvion = idAvion;
		this.nombrePassagers = nombrePassagers;
		this.nomPassagers = nomPassagers;
		this.idAeroportDepart = idAeroportDepart;
		this.idAeroportArrivee = idAeroportArrivee;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
	}

	public Vol() {
		this.idVol = 0;
		this.numeroVol = 0;
		this.idAvion = 0;
		this.nombrePassagers = 0;
		this.nomPassagers = "";
		this.idAeroportDepart = 0;
		this.idAeroportArrivee = 0;
		this.heureDepart = new Date();
		this.heureArrivee = new Date();
	}

	// getters and setters:
	public int getIdVol() {
		return idVol;
	}

	public void setIdVol(int idVol) {
		this.idVol = idVol;
	}

	public int getNumeroVol() {
		return numeroVol;
	}

	public void setNumeroVol(int numeroVol) {
		this.numeroVol = numeroVol;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public int getNombrePassagers() {
		return nombrePassagers;
	}

	public void setNombrePassagers(int nombrePassagers) {
		this.nombrePassagers = nombrePassagers;
	}

	public String getNomPassagers() {
		return nomPassagers;
	}

	public void setNomPassagers(String nomPassagers) {
		this.nomPassagers = nomPassagers;
	}

	public int getIdAeroportDepart() {
		return idAeroportDepart;
	}

	public void setIdAeroportDepart(int idAeroportDepart) {
		this.idAeroportDepart = idAeroportDepart;
	}

	public int getIdAeroportArrivee() {
		return idAeroportArrivee;
	}

	public void setIdAeroportArrivee(int idAeroportArrivee) {
		this.idAeroportArrivee = idAeroportArrivee;
	}

	public Date getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}

	public Date getHeureArrivee() {
		return heureArrivee;
	}

	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
}

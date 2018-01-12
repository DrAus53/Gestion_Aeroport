package fr.eseo.gestionAeroport.modele;

import java.util.Date;

public class Trajet {
	public int idTrajet;
	private float prix;
	private Aeroport aeroportDepart;//TODO
	private Aeroport aeroportArrivee;//TODO
	private int temps;//en minutes
	private Date dateDepart;
	private Date dateArrivee;
	private int nbEscales;
	private int dureeEscales;//en minutes
	
	//Constructeur:
	public Trajet(int idTrajet, float prix, Aeroport aeroportDepart, Aeroport aeroportArrivee, int temps,
			Date dateDepart, Date dateArrivee, int nbEscales, int dureeEscales) {
		super();
		this.idTrajet = idTrajet;
		this.prix = prix;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrivee = aeroportArrivee;
		this.temps = temps;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.nbEscales = nbEscales;
		this.dureeEscales = dureeEscales;
	}

	//getters and setters:
	public int getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(int idTrajet) {
		this.idTrajet = idTrajet;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}

	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}

	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}

	public int getTemps() {
		return temps;
	}

	public void setTemps(int temps) {
		this.temps = temps;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public int getNbEscales() {
		return nbEscales;
	}

	public void setNbEscales(int nbEscales) {
		this.nbEscales = nbEscales;
	}

	public int getDureeEscales() {
		return dureeEscales;
	}

	public void setDureeEscales(int dureeEscales) {
		this.dureeEscales = dureeEscales;
	}	
}

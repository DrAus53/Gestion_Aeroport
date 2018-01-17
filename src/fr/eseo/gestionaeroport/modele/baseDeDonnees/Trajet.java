package fr.eseo.gestionaeroport.modele.baseDeDonnees;

import java.util.Date;
import java.util.Set;

public class Trajet {

	// ID
	private int idtrajet;

	// ID Aeroport Depart
	private int idaeroportdepart;

	// ID Aeroport Arrivee
	private int idaeroportarrivee;

	// prix
	private int prix;

	// date Depart
	private Date datedepart;

	// date Arrivee
	private Date datearrivee;

	// temps de trajet
	private int tempstrajet;

	// nombre d'escales
	private int nombreescales;

	// liste des Id de vols
	private Set<Integer> listedesiddevols;

	// duree escales
	private int dureeescales;

	public Trajet(int idtrajet, int idaeroportdepart, int idaeroportarrivee, int prix, Date datedepart,
			Date datearrivee, int tempstrajet, int nombreescales, Set<Integer> listedesiddevols, int dureeescales) {
		this.idtrajet = idtrajet;
		this.idaeroportdepart = idaeroportdepart;
		this.idaeroportarrivee = idaeroportarrivee;
		this.prix = prix;
		this.datedepart = datedepart;
		this.datearrivee = datearrivee;
		this.tempstrajet = tempstrajet;
		this.nombreescales = nombreescales;
		this.listedesiddevols = listedesiddevols;
		this.dureeescales = dureeescales;
	}

	public Trajet() {
		this(0, 0, 0, 0, null, null, 0, 0, null, 0);
	}

	public int getIdtrajet() {
		return idtrajet;
	}

	public void setIdtrajet(int idtrajet) {
		this.idtrajet = idtrajet;
	}

	public int getIdaeroportdepart() {
		return idaeroportdepart;
	}

	public void setIdaeroportdepart(int idaeroportdepart) {
		this.idaeroportdepart = idaeroportdepart;
	}

	public int getIdaeroportarrivee() {
		return idaeroportarrivee;
	}

	public void setIdaeroportarrivee(int idaeroportarrivee) {
		this.idaeroportarrivee = idaeroportarrivee;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public Date getDatedepart() {
		return datedepart;
	}

	public void setDatedepart(Date datedepart) {
		this.datedepart = datedepart;
	}

	public Date getDatearrivee() {
		return datearrivee;
	}

	public void setDatearrivee(Date datearrivee) {
		this.datearrivee = datearrivee;
	}

	public int getTempstrajet() {
		return tempstrajet;
	}

	public void setTempstrajet(int tempstrajet) {
		this.tempstrajet = tempstrajet;
	}

	public int getNombreescales() {
		return nombreescales;
	}

	public void setNombreescales(int nombreescales) {
		this.nombreescales = nombreescales;
	}

	public Set<Integer> getListedesiddevols() {
		return listedesiddevols;
	}

	public void setListedesiddevols(Set<Integer> listedesiddevols) {
		this.listedesiddevols = listedesiddevols;
	}

	public int getDureeescales() {
		return dureeescales;
	}

	public void setDureeescales(int dureeescales) {
		this.dureeescales = dureeescales;
	}
}

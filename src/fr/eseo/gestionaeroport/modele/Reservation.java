package fr.eseo.gestionaeroport.modele;

import java.util.Date;

public class Reservation {
	public int idReservation;
	public java.util.Date dateReservation;

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public java.util.Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(java.util.Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public int getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(int idTrajet) {
		this.idTrajet = idTrajet;
	}

	public int idAvion;
	public int idUtilisateur;
	public int idTrajet;

	public Reservation(Date dateReservation, int idAvion, int idUtilisateur, int idTrajet) {
		super();
		this.dateReservation = dateReservation;
		this.idAvion = idAvion;
		this.idUtilisateur = idUtilisateur;
		this.idTrajet = idTrajet;
	}

	public void creer() {

	}

	public void modifier() {

	}

	public void supprimer() {

	}
}

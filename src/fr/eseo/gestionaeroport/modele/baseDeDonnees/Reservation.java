package fr.eseo.gestionaeroport.modele.baseDeDonnees;

import java.util.Date;

public class Reservation {
	public int idReservation;
	private Date dateReservation;
	private int idTrajet;
	private int idUtilisateur;

	public Reservation(int idReservation, Date dateReservation, int idTrajet, int idUtilisateur) {
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.idTrajet = idTrajet;
		this.idUtilisateur = idUtilisateur;
	}

	public Reservation() {
		this.idReservation = 0;
		this.dateReservation = new Date();
		this.idTrajet = 0;
		this.idUtilisateur = 0;
	}

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(int idTrajet) {
		this.idTrajet = idTrajet;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
}

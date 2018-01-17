package fr.eseo.gestionaeroport.dao;

import java.sql.ResultSet;

import fr.eseo.gestionAeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionAeroport.modele.baseDeDonnees.Reservation;

public class ReservationDAO extends DAO<Reservation> {

	public ReservationDAO(ConnexionBDD cBdd) {
		super(cBdd);
	}

	public boolean create(Reservation obj) {
		return false;
	}

	public boolean delete(Reservation obj) {
		return false;
	}

	public boolean update(Reservation obj) {
		return false;
	}

	public Reservation find (int id) {
		Reservation Reservation = new Reservation();
		
		try {
			//ResultSet result = this.connect
		}
	}
}

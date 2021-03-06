package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.modele.Reservation;

public class ReservationDAO extends DAO<Reservation> {

	public ReservationDAO(Connection cBdd) {
		super(cBdd);
	}

	// Cr�er une r�servation dans la base de donn�e
	public void create(Reservation obj) {
		try {
			this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate("INSERT INTO reservation (datereservation,idtrajet,idutilisateur) VALUES( '"
							+ obj.getDateReservation() + "'" + "," + "'" + obj.getIdTrajet() + "','"
							+ +obj.getIdUtilisateur() + "');");
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}
	}

	// Supprime une r�servation dans la base de donn�e
	public void delete(Reservation obj) {
		try {
			this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate("DELETE FROM reservation WHERE datereservation='" + obj.getDateReservation() + "'"
							+ "AND idtrajet=" + "'" + obj.getIdTrajet() + "'" + "AND idutilisateur=" + "'"
							+ obj.getIdUtilisateur() + "';");
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}
	}

	public void update(Reservation obj) {
	}

	@Override
	public List<Reservation> find(Reservation obj) {
		// TODO Auto-generated method stub
		return new ArrayList<>();
	}

	@Override
	public Object[] affiche() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Reservation obj, Reservation obj1) {
		// TODO Auto-generated method stub

	}
}

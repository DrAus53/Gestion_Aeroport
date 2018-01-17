package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eseo.gestionaeroport.modele.Reservation;

public class ReservationDAO extends DAO<Reservation> {

	public ReservationDAO(Connection cBdd) {
		super(cBdd);
	}

	public void create(Reservation obj) {
		try {
			int result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate(
							"INSERT INTO reservation (idreservation,datereservation,idtrajet,idutilisateur) VALUES("
									+ "'" + obj.getIdReservation() + "'" + "," + "'" + obj.getDateReservation() + "'"
									+ "," + "'ab'," + "'" + obj.getIdTrajet() + "'" + "," + "'" + obj.getIdUtilisateur()
									+ "');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(Reservation obj) {
		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("DELETE * FROM Reservation WHERE idreservation=" + "'" + obj.getIdReservation()
							+ "AND datereservation='" + "'" + obj.getDateReservation() + "'" + "AND idtrajet=" + "'"
							+ obj.getIdTrajet() + "'" + "AND idutilisateur=" + "'" + obj.getIdUtilisateur() + "');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(Reservation obj) {
	}

	@Override
	public Reservation find(Reservation obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation affiche() {
		// TODO Auto-generated method stub
		return null;
	}
}

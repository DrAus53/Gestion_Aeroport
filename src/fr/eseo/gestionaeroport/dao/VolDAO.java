package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eseo.gestionaeroport.modele.Vol;

public class VolDAO extends DAO<Vol> {

	public VolDAO(Connection conn) {
		super(conn);
	}

	public void create(Vol obj) {
		try {
			ResultSet aeroportdepart = this.conn
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(
							"SELECT nomAeroport FROM Aeroport WHERE " + obj.getIdaeroportDepart() + "=idAeroport");

			ResultSet aeroportarrivee = this.conn
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(
							"SELECT nomAeroport FROM Aeroport WHERE " + obj.getIdaeroportArrivee() + "=idAeroport");

			System.out.println(
					"INSERT INTO vol (numerovol,idavion,place,nompassagers,aeroportdepart,aeroportarrivee,nombrepassagers,heuredepart,heurearrivee) VALUES("
							+ "'" + 2 + "'" + "," + "'" + 2 + "'" + "," + "'ab'," + "'"
							+ obj.getNomPassagers().get(0).toString() + "'" + "," + "'" + obj.getIdaeroportDepart()
							+ "'" + "," + "'" + obj.getIdaeroportArrivee() + "'" + "," + "'" + 1 + "'"
							+ ",'01:02:50','01:02:50');");

			int result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate(
							"INSERT INTO vol (numerovol,idavion,place,nompassagers,aeroportdepart,aeroportarrivee,nombrepassagers,heuredepart,heurearrivee) VALUES("
									+ "'" + obj.getnumeroVol() + "'" + "," + "'" + obj.getIdavion() + "'" + ","
									+ "'ab'," + "'" + obj.getNomPassagers().get(0).toString() + "'" + "," + "'"
									+ obj.getIdaeroportDepart() + "'" + "," + "'" + obj.getIdaeroportArrivee() + "'"
									+ "," + "'" + 1 + "'" + ",'01:02:50','01:02:50');");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void delete(Vol obj) {
		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("DELETE vol WHERE idaeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
							+ "AND idaeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + "AND heuredepart="
							+ "'" + obj.getHeureDepart() + "'" + "AND heurearrivee=" + "'" + obj.getHeureArrivee()
							+ "');");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void update(Vol obj) {

	}

	public Vol find(Vol obj) {
		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM vol WHERE aeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
							+ "AND aeroportarrivee=" + "'" + obj.getIdaeroportDepart() + "'" + "AND heuredepart" + "'"
							+ obj.getHeureDepart() + "');");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return obj;

	}

	@Override
	public Vol affiche() {
		// TODO Auto-generated method stub
		return null;
	}

}

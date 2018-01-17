package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eseo.gestionaeroport.modele.baseDeDonnees.Vol;

public class VolDAO extends DAO<Vol> {

	public VolDAO(Connection conn) {
		super(conn);
	}

	public boolean create(Vol obj) {
		Vol vol = new Vol();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(
							"INSERT INTO vol VALUES(aeroportdepart,aeroportarrivee,nombrepassagers,heuredepart,heurearrivee) VALUES("
									+ vol.getIdAeroportDepart() + "," + vol.getIdAeroportArrivee() + ","
									+ vol.getHeureDepart() + "," + vol.getHeureArrivee() + ")");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public boolean delete(Vol obj) {
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("DELETE vol WHERE aeroportdepart=" + obj.getIdAeroportDepart()
							+ "AND aeroportarrivee=" + +obj.getIdAeroportArrivee() + "AND heuredepart="
							+ obj.getHeureDepart() + "AND heurearrivee=" + obj.getHeureArrivee());
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	public boolean update(Vol obj) {
		return false;
	}

	public Vol find(String aeroportdepart, String aeroportarrivee, Date heuredepart, Date heurearrivee) {
		Vol vol = new Vol();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM vol WHERE aeroportdepart=" + aeroportdepart + "AND aeroportarrivee="
							+ aeroportarrivee + "AND heuredepart" + heuredepart + "AND heurearrivee=" + heurearrivee);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return vol;
	}

	@Override
	public fr.eseo.gestionaeroport.modele.baseDeDonnees.Vol find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

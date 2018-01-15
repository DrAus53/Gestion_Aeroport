package fr.eseo.gestionAeroport.dao;

import java.sql.SQLException;

import fr.eseo.gestionAeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionAeroport.modele.baseDeDonnees.Vol;

public class VolDAO extends DAO<Vol> {

	public VolDAO(ConnexionBDD conn) {
		super(conn);
	}

	public boolean create(Vol obj) {
		return false;
	}

	public boolean delete(Vol obj) {
		return false;
	}

	public boolean update(Vol obj) {
		return false;
	}

	public Vol find(int id) {
		Vol vol = new Vol();

		try {

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vol;
	}
}

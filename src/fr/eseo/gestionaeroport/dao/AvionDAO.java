package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.SQLException;

import fr.eseo.gestionaeroport.modele.baseDeDonnees.Avion;

public class AvionDAO extends DAO<Avion> {

	// CTRL + SHIFT + O pour générer les imports

	public AvionDAO(Connection conn) {
		super(conn);
	}

	public void create(Avion obj) {
		return false;
	}

	public void delete(Avion obj) {
		return false;
	}

	public void update(Avion obj) {
		return false;
	}

	public Avion find(Avion id) {
		Avion avion = new Avion();

		try {

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return avion;
	}
}

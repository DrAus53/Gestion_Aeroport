package fr.eseo.gestionAeroport.dao;

import java.sql.SQLException;

import fr.eseo.gestionAeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionAeroport.modele.baseDeDonnees.Avion;

public class AvionDAO extends DAO<Avion> {

	// CTRL + SHIFT + O pour générer les imports

	public AvionDAO(ConnexionBDD conn) {
		super(conn);
	}

	public boolean create(Avion obj) {
		return false;
	}

	public boolean delete(Avion obj) {
		return false;
	}

	public boolean update(Avion obj) {
		return false;
	}

	public Avion find(int id) {
		Avion avion = new Avion();

		try {

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return avion;
	}
}

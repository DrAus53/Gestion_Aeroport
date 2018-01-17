package fr.eseo.gestionaeroport.dao;

import java.sql.SQLException;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.baseDeDonnees.Trajet;

public class TrajetDAO extends DAO<Trajet> {

	public TrajetDAO(ConnexionBDD conn) {
		super(conn);
	}

	public boolean create(Trajet obj) {
		return false;
	}

	public boolean delete(Trajet obj) {
		return false;
	}

	public boolean update(Trajet obj) {
		return false;
	}

	public Trajet find(int id) {
		Trajet trajet = new Trajet();

		try {

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return trajet;
	}

}

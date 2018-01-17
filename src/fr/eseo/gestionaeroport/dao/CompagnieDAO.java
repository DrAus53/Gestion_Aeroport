package fr.eseo.gestionaeroport.dao;

import java.sql.SQLException;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.baseDeDonnees.Compagnie;

public class CompagnieDAO extends DAO<Compagnie> {

	public CompagnieDAO(ConnexionBDD cBdd) {
		super(cBdd);
	}

	public boolean create(Compagnie obj) {
		return false;
	}

	public boolean delete(Compagnie obj) {
		return false;
	}

	public boolean update(Compagnie obj) {
		return false;
	}

	public Compagnie find(int id) {
		Compagnie compagnie = new Compagnie();

		try {
			// ResultSet result = this.connect
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return compagnie;
	}
}

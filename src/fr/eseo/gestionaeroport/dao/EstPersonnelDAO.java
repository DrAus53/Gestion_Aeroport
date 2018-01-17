package fr.eseo.gestionaeroport.dao;

import fr.eseo.gestionAeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionAeroport.modele.baseDeDonnees.EstPersonnel;

public class EstPersonnelDAO extends DAO<EstPersonnel> {

	public EstPersonnelDAO(ConnexionBDD cBdd) {
		super(cBdd);
	}

	public boolean create(EstPersonnel obj) {
		return false;
	}

	public boolean delete(EstPersonnel obj) {
		return false;
	}

	public boolean update(EstPersonnel obj) {
		return false;
	}

	public EstPersonnel find (int id) {
		EstPersonnel estPersonnel = new EstPersonnel();
		
		try {
			//ResultSet result = this.connect
		}
	}
}

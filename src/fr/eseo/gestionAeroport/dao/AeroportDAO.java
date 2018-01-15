package fr.eseo.gestionAeroport.dao;

import java.sql.ResultSet;

import fr.eseo.gestionAeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionAeroport.modele.baseDeDonnees.Aeroport;

public class AeroportDAO extends DAO<Aeroport> {

	public AeroportDAO(ConnexionBDD cBdd) {
		super(cBdd);
	}

	public boolean create(Aeroport obj) {
		return false;
	}

	public boolean delete(Aeroport obj) {
		return false;
	}

	public boolean update(Aeroport obj) {
		return false;
	}

	public Aeroport find (int id) {
		Aeroport aeroport = new Aeroport();
		
		try {
			//ResultSet result = this.connect
		}
	}
}

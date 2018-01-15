package fr.eseo.gestionAeroport.dao;
package com.sdz.dao.implement;

import fr.eseo.gestionAeroport.modele.baseDeDonnees.Avion;

public class AvionDAO extends DAO<Avion> {

	// CTRL + SHIFT + O pour générer les imports

	public AvionDAO(Connection conn) {
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
		Avion Avion = new Avion();

		try {

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Avion;
	}
}

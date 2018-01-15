package fr.eseo.gestionAeroport.dao;
package com.sdz.dao.implement;

import fr.eseo.gestionAeroport.modele.baseDeDonnees.Vol;

public class VolDAO extends DAO<Vol> {
	// CTRL + SHIFT + O pour générer les imports

	public VolDAO(Connection conn) {
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
		Vol Vol = new Vol();

		try {

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Vol;
	}
}

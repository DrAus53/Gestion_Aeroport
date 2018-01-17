package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eseo.gestionaeroport.modele.baseDeDonnees.Aeroport;

public class AeroportDAO extends DAO<Aeroport> {

	public AeroportDAO(Connection conn) {
		super(conn);
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

	public Aeroport find(int id) {
		Aeroport aeroport = new Aeroport();

		try {

			Statement state = conn.createStatement();

			ResultSet result = state.executeQuery("SELECT * FROM avion");

			ResultSetMetaData resultMeta = result.getMetaData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aeroport;
	}
}

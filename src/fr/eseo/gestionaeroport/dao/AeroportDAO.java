package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eseo.gestionaeroport.modele.baseDeDonnees.Aeroport;

public class AeroportDAO extends DAO<Aeroport> {

	public AeroportDAO(Connection conn) {
		super(conn);
	}

	public void create(Aeroport obj) {

	}

	public void delete(Aeroport obj) {

	}

	public void update(Aeroport obj) {

	}

	public String find() {

		String ville;

		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT Ville FROM aeroport");

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return ville;
	}
}
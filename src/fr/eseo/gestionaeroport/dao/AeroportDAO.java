package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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

	public Aeroport find(Aeroport obj) {
		return obj;
	}

	public Object[] affiche() {

		Object[] villes = new Object[20];

		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM aeroport");
			ResultSetMetaData resultMeta = result.getMetaData();
			int compteur = 0;

			while (result.next()) {

				for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
					villes[compteur] = ("" + result.getObject(2).toString() + "");
				}

				compteur += 1;
			}

		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		return villes;
	}
}
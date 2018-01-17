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

		Object[] villes = new Object[2];

		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT Ville FROM aeroport");
			ResultSetMetaData resultMeta = result.getMetaData();

			while (result.next()) {
				for (int i = 1; i <= resultMeta.getColumnCount(); i++)
					villes[i] = ("" + result.getObject(i).toString() + "");
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return villes;
	}
}
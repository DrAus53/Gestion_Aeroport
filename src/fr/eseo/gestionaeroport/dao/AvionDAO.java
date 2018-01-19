package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eseo.gestionaeroport.modele.Avion;

public class AvionDAO extends DAO<Avion> {

	public AvionDAO(Connection conn) {
		super(conn);
	}

	public void create(Avion obj) {

	}

	public void delete(Avion obj) {

	}

	public void update(Avion obj) {

	}

	public List<Avion> find(Avion obj) {
		return new ArrayList<>();
	}

	// Affiche la liste de tous les avions
	public Object[] affiche() {

		Object[] avions = new Object[30];

		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM avion");
			ResultSetMetaData resultMeta = result.getMetaData();
			int compteur = 0;

			while (result.next()) {

				for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
					avions[compteur] = ("" + result.getObject(2).toString() + "");
				}

				compteur += 1;
			}

		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		return avions;
	}

	@Override
	public void update(Avion obj, Avion obj1) {
		// TODO Auto-generated method stub

	}
}

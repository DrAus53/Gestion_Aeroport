package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Aeroport;

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

	public List<Aeroport> find(Aeroport obj) {
		return null;
	}

	// Récupère le nom de l'aeroport
	public static String getNomAeroport(int idaeroport) {
		Statement state;
		String aeroport = "";
		try {
			state = ConnexionBDD.connexion().createStatement();
			ResultSet result = state.executeQuery("SELECT * FROM aeroport");
			ResultSetMetaData resultMeta = result.getMetaData();
			result = state.executeQuery("SELECT nomaeroport FROM aeroport WHERE idaeroport='" + idaeroport + "';");
			resultMeta = result.getMetaData();
			while (result.next()) {
				aeroport = result.getString("nomaeroport");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aeroport;
	}

	// Affiche tous les aeroports ordonnés par idaeroport
	public Object[] affiche() {

		Object[] villes = new Object[30];

		try {
			ResultSet result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM aeroport ORDER BY idaeroport");
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

	@Override
	public void update(Aeroport obj, Aeroport obj1) {
		// TODO Auto-generated method stub

	}
}
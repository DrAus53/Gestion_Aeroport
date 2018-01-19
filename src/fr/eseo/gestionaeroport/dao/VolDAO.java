package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.swing.JTextField;

import fr.eseo.gestionaeroport.GestionAeroport;
import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Vol;

public class VolDAO extends DAO<Vol> {

	List<Vol> listvol = new ArrayList<Vol>();

	public VolDAO(Connection conn) {
		super(conn);
	}

	public void create(Vol obj) {
		try {
			this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeUpdate(
					"INSERT INTO vol (numerovol,idavion,place,nompassagers,idaeroportdepart,idaeroportarrivee,nombrepassagers,heuredepart,heurearrivee,datedepart,datearrivee) VALUES("
							+ "'" + obj.getnumeroVol() + "'" + "," + "'" + obj.getIdavion() + "'" + "," + "'ab'," + "'"
							+ obj.getNomPassagers().get(0).toString() + "'" + "," + "'" + obj.getIdaeroportDepart()
							+ "'" + "," + "'" + obj.getIdaeroportArrivee() + "'" + "," + "'" + 1 + "'" + ",'"
							+ obj.getDateDepart().getHours() + ":" + obj.getDateDepart().getMinutes() + ":"
							+ obj.getDateDepart().getSeconds() + "','" + obj.getDateArrive().getHours() + ":"
							+ obj.getDateArrive().getMinutes() + ":" + obj.getDateArrive().getSeconds() + "','"
							+ obj.getDateDepart() + "','" + obj.getDateArrive() + "');");
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());

		}

	}

	public int getIdAeroport(JTextField jTextField) {
		Statement state;
		int idaeroport = 0;
		try {
			state = ConnexionBDD.connexion().createStatement();
			ResultSet result = state.executeQuery("SELECT * FROM aeroport");
			result = state
					.executeQuery("SELECT idaeroport FROM aeroport WHERE nomaeroport='" + jTextField.getText() + "';");
			while (result.next()) {
				idaeroport = result.getInt("idaeroport");
			}
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}
		return idaeroport;
	}

	public int getIdAeroportStr(String str) {
		Statement state;
		int idaeroport = 0;
		try {
			state = ConnexionBDD.connexion().createStatement();
			ResultSet result = state.executeQuery("SELECT * FROM aeroport");
			result = state.executeQuery("SELECT idaeroport FROM aeroport WHERE nomaeroport='" + str + "';");
			while (result.next()) {
				idaeroport = result.getInt("idaeroport");
			}
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}
		return idaeroport;
	}

	public void delete(Vol obj) {
		try {
			this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate("DELETE FROM vol WHERE idaeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
							+ " AND idaeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + " AND heuredepart="
							+ "'" + obj.getDateDepart().getHours() + ":" + obj.getDateDepart().getMinutes() + ":"
							+ obj.getDateDepart().getSeconds() + "' AND heurearrivee=" + "'"
							+ obj.getDateArrive().getHours() + ":" + obj.getDateArrive().getMinutes() + ":"
							+ obj.getDateArrive().getSeconds() + "';");
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}

	}

	public void update(Vol obj) {

	}

	public List<Vol> find(Vol obj) {
		ResultSetMetaData resultMeta;
		ResultSet result;
		try {
			result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM vol WHERE idaeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
							+ "AND idaeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + "AND datedepart="
							+ "'" + obj.getDateDepart() + "';");

			resultMeta = result.getMetaData();

			// On affiche le nom des colonnes
			for (int i = 1; i <= resultMeta.getColumnCount(); i++)
				;

			while (result.next()) {
				for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
					listvol.add(new Vol(result.getInt("numerovol"), result.getDate("datedepart"),
							result.getDate("datearrivee"), result.getInt("idaeroportdepart"),
							result.getInt("idaeroportarrivee"), result.getInt("nombrepassagers"),
							result.getTime("heuredepart"), result.getTime("heurearrivee")));
				}
			}
			result.close();
		} catch (SQLException e) {
			GestionAeroport.getLogger().log(Level.INFO, e.toString());
		}
		return listvol;
	}

	@Override
	public Object[] affiche() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Vol obj, Vol obj1) {
		// TODO Auto-generated method stub

	}
}

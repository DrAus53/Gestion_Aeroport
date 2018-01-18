package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

import fr.eseo.gestionaeroport.controleur.baseDeDonnees.ConnexionBDD;
import fr.eseo.gestionaeroport.modele.Vol;

public class VolDAO extends DAO<Vol> {

	Object[][] vol = new Object[30][30];

	public VolDAO(Connection conn) {
		super(conn);
	}

	public void create(Vol obj) {
		try {

			System.out.println(
					"INSERT INTO vol (numerovol,idavion,place,nompassagers,idaeroportdepart,idaeroportarrivee,nombrepassagers,heuredepart,heurearrivee,datedepart,datearrivee) VALUES("
							+ "'" + obj.getnumeroVol() + "'" + "," + "'" + obj.getIdavion() + "'" + "," + "'ab'," + "'"
							+ obj.getNomPassagers().get(0).toString() + "'" + "," + "'" + obj.getIdaeroportDepart()
							+ "'" + "," + "'" + obj.getIdaeroportArrivee() + "'" + "," + "'" + 1 + "'" + ",'"
							+ obj.getDateDepart().getHours() + ":" + obj.getDateDepart().getMinutes() + ":"
							+ obj.getDateDepart().getSeconds() + "','" + obj.getDateArrive().getHours() + ":"
							+ obj.getDateArrive().getMinutes() + ":" + obj.getDateArrive().getSeconds() + "','"
							+ obj.getDateDepart() + "','" + obj.getDateArrive() + "');");
			int result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate(
							"INSERT INTO vol (numerovol,idavion,place,nompassagers,idaeroportdepart,idaeroportarrivee,nombrepassagers,heuredepart,heurearrivee,datedepart,datearrivee) VALUES("
									+ "'" + obj.getnumeroVol() + "'" + "," + "'" + obj.getIdavion() + "'" + ","
									+ "'ab'," + "'" + obj.getNomPassagers().get(0).toString() + "'" + "," + "'"
									+ obj.getIdaeroportDepart() + "'" + "," + "'" + obj.getIdaeroportArrivee() + "'"
									+ "," + "'" + 1 + "'" + ",'" + obj.getDateDepart().getHours() + ":"
									+ obj.getDateDepart().getMinutes() + ":" + obj.getDateDepart().getSeconds() + "','"
									+ obj.getDateArrive().getHours() + ":" + obj.getDateArrive().getMinutes() + ":"
									+ obj.getDateArrive().getSeconds() + "','" + obj.getDateDepart() + "','"
									+ obj.getDateArrive() + "');");
			System.out.println(obj.getDateArrive());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public int getIdAeroport(JTextField jTextField) {
		Statement state;
		int idaeroport = 0;
		try {
			state = ConnexionBDD.connexion().createStatement();
			ResultSet result = state.executeQuery("SELECT * FROM aeroport");
			ResultSetMetaData resultMeta = result.getMetaData();
			System.out.println("SELECT idaeroport FROM aeroport WHERE nomaeroport='" + jTextField.getText() + "';");
			result = state
					.executeQuery("SELECT idaeroport FROM aeroport WHERE nomaeroport='" + jTextField.getText() + "';");
			resultMeta = result.getMetaData();
			while (result.next()) {
				idaeroport = result.getInt("idaeroport");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return idaeroport;
	}

	public void delete(Vol obj) {
		try {
			System.out.println("DELETE * FROM vol WHERE idaeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
					+ " AND idaeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + " AND heuredepart=" + "'"
					+ obj.getDateDepart().getHours() + ":" + obj.getDateDepart().getMinutes() + ":"
					+ obj.getDateDepart().getSeconds() + "' AND heurearrivee=" + "'" + obj.getDateArrive().getHours()
					+ ":" + obj.getDateArrive().getMinutes() + ":" + obj.getDateArrive().getSeconds() + "';");

			int result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate("DELETE FROM vol WHERE idaeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
							+ " AND idaeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + " AND heuredepart="
							+ "'" + obj.getDateDepart().getHours() + ":" + obj.getDateDepart().getMinutes() + ":"
							+ obj.getDateDepart().getSeconds() + "' AND heurearrivee=" + "'"
							+ obj.getDateArrive().getHours() + ":" + obj.getDateArrive().getMinutes() + ":"
							+ obj.getDateArrive().getSeconds() + "';");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void update(Vol obj) {

	}

	public Object[][] find(Vol obj) {
		ResultSetMetaData resultMeta;
		System.out.println("SELECT * FROM vol WHERE idaeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
				+ "AND idaeroportarrivee=" + "'" + obj.getIdaeroportDepart() + "'" + "AND datedepart=" + "'"
				+ obj.getDateDepart() + "';");
		ResultSet result;
		try {
			result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM vol WHERE idaeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
							+ "AND idaeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + "AND datedepart="
							+ "'" + obj.getDateDepart() + "';");

			resultMeta = result.getMetaData();

			System.out.println("\n**********************************");
			// On affiche le nom des colonnes
			for (int i = 1; i <= resultMeta.getColumnCount(); i++)
				System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

			System.out.println("\n**********************************");
			int compteurl = 0;
			int compteur = 0;
			while (result.next()) {
				for (int i = 1; i <= resultMeta.getColumnCount(); i++) {
					System.out.print("\t" + result.getObject(i).toString() + "\t |");
					vol[compteur][compteurl] = ("" + result.getObject(i).toString() + "");
					compteurl++;
					System.out.println("\n---------------------------------");
				}
				compteur++;
			}
			result.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vol;
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

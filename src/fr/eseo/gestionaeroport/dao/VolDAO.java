package fr.eseo.gestionaeroport.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import fr.eseo.gestionaeroport.modele.Vol;

public class VolDAO extends DAO<Vol> {

	public VolDAO(Connection conn) {
		super(conn);
	}

	public void create(Vol obj) {
		try {

			System.out.println(
					"INSERT INTO vol (numerovol,idavion,place,nompassagers,aeroportdepart,aeroportarrivee,nombrepassagers,heuredepart,heurearrivee,datedepart,datearrivee) VALUES("
							+ "'" + obj.getnumeroVol() + "'" + "," + "'" + obj.getIdavion() + "'" + "," + "'ab'," + "'"
							+ obj.getNomPassagers().get(0).toString() + "'" + "," + "'" + obj.getIdaeroportDepart()
							+ "'" + "," + "'" + obj.getIdaeroportArrivee() + "'" + "," + "'" + 1 + "'" + ",'"
							+ obj.getDateDepart().getHours() + ":" + obj.getDateDepart().getMinutes() + ":"
							+ obj.getDateDepart().getSeconds() + "','" + obj.getDateArrive().getHours() + ":"
							+ obj.getDateArrive().getMinutes() + ":" + obj.getDateArrive().getSeconds() + "','"
							+ obj.getDateDepart() + "','" + obj.getDateArrive() + "');");
			int result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate(
							"INSERT INTO vol (numerovol,idavion,place,nompassagers,aeroportdepart,aeroportarrivee,nombrepassagers,heuredepart,heurearrivee,datedepart,datearrivee) VALUES("
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

	public void delete(Vol obj) {
		try {
			System.out.println("DELETE * FROM vol WHERE aeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
					+ " AND aeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + " AND heuredepart=" + "'"
					+ obj.getDateDepart().getHours() + ":" + obj.getDateDepart().getMinutes() + ":"
					+ obj.getDateDepart().getSeconds() + "' AND heurearrivee=" + "'" + obj.getDateArrive().getHours()
					+ ":" + obj.getDateArrive().getMinutes() + ":" + obj.getDateArrive().getSeconds() + "';");

			int result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeUpdate("DELETE FROM vol WHERE aeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
							+ " AND aeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + " AND heuredepart="
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

	public Vol find(Vol obj) {
		System.out.println("SELECT * FROM vol WHERE aeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
				+ "AND aeroportarrivee=" + "'" + obj.getIdaeroportDepart() + "'" + "AND datedepart=" + "'"
				+ obj.getDateDepart() + "';");
		ResultSet result;
		try {
			result = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM vol WHERE aeroportdepart=" + "'" + obj.getIdaeroportDepart() + "'"
							+ "AND aeroportarrivee=" + "'" + obj.getIdaeroportArrivee() + "'" + "AND datedepart=" + "'"
							+ obj.getDateDepart() + "';");

			ResultSetMetaData resultMeta = result.getMetaData();

			System.out.println("\n**********************************");
			// On affiche le nom des colonnes
			for (int i = 1; i <= resultMeta.getColumnCount(); i++)
				System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

			System.out.println("\n**********************************");

			while (result.next()) {
				for (int i = 1; i <= resultMeta.getColumnCount(); i++)
					System.out.print("\t" + result.getObject(i).toString() + "\t |");

				System.out.println("\n---------------------------------");

			}
			result.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Vol affiche() {
		// TODO Auto-generated method stub
		return null;
	}
}

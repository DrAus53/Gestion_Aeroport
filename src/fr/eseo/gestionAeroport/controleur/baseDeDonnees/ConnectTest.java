package fr.eseo.gestionAeroport.controleur.baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ConnectTest {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");

			String url = "jdbc:postgresql://192.168.4.127:5432/gestionaeroport";
			String user = "damien";
			String passwd = "Hkos39H2";

			Connection conn = DriverManager.getConnection(url, user, passwd);

			// Création d'un objet Statement
			Statement state = conn.createStatement();
			// L'objet ResultSet contient le résultat de la requête SQL
			ResultSet result = state.executeQuery("SELECT * FROM avion");
			// On récupère les MetaData
			ResultSetMetaData resultMeta = result.getMetaData();

			System.out.println("\n***************************************************");
			// On affiche le nom des colonnes
			for (int i = 1; i <= resultMeta.getColumnCount(); i++)
				System.out.print(" " + resultMeta.getColumnName(i).toUpperCase() + " *");

			System.out.println("\n***************************************************");

			while (result.next()) {
				for (int i = 1; i <= resultMeta.getColumnCount(); i++)
					System.out.print("   " + result.getObject(i).toString() + "   |");

				System.out.println("\n---------------------------------------------------");

			}

			result.close();
			state.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
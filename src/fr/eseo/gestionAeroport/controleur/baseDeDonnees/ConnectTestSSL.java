package fr.eseo.gestionAeroport.controleur.baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Properties;

public class ConnectTestSSL {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");

			String url = "jdbc:postgresql://192.168.4.127:5432/gestionaeroport?ssl";
			Properties props = new Properties();
			props.setProperty("user", "damien");
			props.setProperty("password", "Hkos39H2");
			props.setProperty("javax.net.ssl.trustStore",
					"C:\\Program Files\\Java\\jre1.8.0_151\\lib\\security\\gestionaeroport.cer");
			props.setProperty("javax.net.ssl.trustStoreType", "JKS");
			props.setProperty("javax.net.ssl.trustStorePassword", "welcome123");

			Connection conn = DriverManager.getConnection(url, props);

			// Création d'un objet Statement
			Statement state = conn.createStatement();
			// L'objet ResultSet contient le résultat de la requête SQL
			ResultSet result = state.executeQuery("SELECT * FROM vol");
			// On récupère les MetaData
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
			state.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
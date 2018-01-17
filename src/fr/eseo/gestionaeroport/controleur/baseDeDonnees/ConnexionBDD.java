package fr.eseo.gestionaeroport.controleur.baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionBDD {

	// Variables

	private static String url = "jdbc:postgresql://192.168.4.127:5432/gestionaeroport";
	private static String user = "tanguy";
	private static String mdp = "6c4c4USV";

	// Methodes

	public static Connection connexion() {
		Connection connect = null;
		try {
			Class.forName("org.postgresql.Driver");
			connect = DriverManager.getConnection(url, user, mdp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connect;
	}

}
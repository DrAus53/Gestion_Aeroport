package fr.eseo.gestionaeroport.controleur.baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionBDD {

	// Variables
	// Connexion à la BDD avec le type de BDD, l'adresse hote, le port et le nom de
	// la BDD
	private static String url = "jdbc:postgresql://192.168.4.127:5432/gestionaeroport";
	// private static String user = "damien";
	private static String user = "java";
	// private static String mdp = "Hkos39H2";
	private static String mdp = "javaConnectBD986uhGt523because";

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
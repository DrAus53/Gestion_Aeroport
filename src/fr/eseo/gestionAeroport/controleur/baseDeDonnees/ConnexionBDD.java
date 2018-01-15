package fr.eseo.gestionAeroport.controleur.baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionBDD {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver O.K.");

			String url = "jdbc:postgresql://192.168.4.127/phppgadmin";
			String user = "java";
			String passwd = "javaConnectBD986uhGt523because";

			Connection connect = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connexion effective !");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
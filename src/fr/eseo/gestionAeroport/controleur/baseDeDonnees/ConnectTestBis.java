package fr.eseo.gestionAeroport.controleur.baseDeDonnees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author postgresqltutorial.com
 */
public class ConnectTestBis {

	private final String url = "jdbc:postgresql://192.168.4.127:443/gestionaeroport&ssl=true";
	private final String user = "damien";
	private final String password = "Hkos39H2";

	/**
	 * Connect to the PostgreSQL database
	 *
	 * @return a Connection object
	 */
	public Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		ConnectTestBis app = new ConnectTestBis();
		app.connect();
	}
}

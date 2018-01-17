package fr.eseo.gestionaeroport.controleur.baseDeDonnees;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.eseo.gestionaeroport.dao.ReservationDAO;
import fr.eseo.gestionaeroport.dao.VolDAO;
import fr.eseo.gestionaeroport.modele.Reservation;
import fr.eseo.gestionaeroport.modele.Vol;

public class TestSQL {

	public static void main(String[] args) {
		try {

			Connection conn = ConnexionBDD.connexion();

			// Création d'un objet Statement
			Statement state = conn.createStatement();
			VolDAO volDAO = new VolDAO(conn);

			List<String> damien = new ArrayList<String>();
			damien.add("Damien");
			volDAO.find(new Vol(300, new Date(), new Date(), 124, 125, damien, 1, 2, "ab"));

			ReservationDAO reservationDAO = new ReservationDAO(conn);

			reservationDAO.delete(new Reservation(new Date(), 2, 3, 2));

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

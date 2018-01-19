package fr.eseo.gestionaeroport.controleur.baseDeDonnees;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fr.eseo.gestionaeroport.dao.VolDAO;
import fr.eseo.gestionaeroport.modele.Vol;

public class Test {

	public static void main(String[] args) {

		String aeroportdepart = "";
		String aeroportarrivee = "";
		int idaeroportdepart = 36;
		int idaeroportarrivee = 40;
		String avion = "";
		int idavion = 50;
		int anneeD = 0;
		int anneeA = 0;
		int moisD = 0;
		int moisA = 0;
		int jourD = 0;
		int jourA = 0;
		Date dateD = new Date();
		Date dateA = new Date();
		List<String> nomPassagers = new ArrayList<String>();
		nomPassagers.add("damien");

		Connection conn = ConnexionBDD.connexion();

		VolDAO volproposeDAO = new VolDAO(conn);
		Vol volpropose = new Vol(0, dateD, dateA, idaeroportdepart, idaeroportarrivee, nomPassagers, 0, idavion, "XX");
		volproposeDAO.create(volpropose);

	}
}
